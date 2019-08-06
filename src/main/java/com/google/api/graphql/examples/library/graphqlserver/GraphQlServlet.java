// Copyright 2017 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.graphql.examples.library.graphqlserver;

import com.google.api.graphql.execution.GuavaListenableFutureSupport;
import com.google.api.graphql.rejoiner.Schema;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.execution.instrumentation.ChainedInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation;
import graphql.execution.instrumentation.tracing.TracingInstrumentation;
import graphql.schema.GraphQLSchema;
import org.dataloader.DataLoaderRegistry;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * 接收到graphql传过来的参数，然后进行数据操作
 */
//标识注入器，只实例化一次
@Singleton
final class GraphQlServlet extends HttpServlet {

  private static final Gson GSON = new GsonBuilder().serializeNulls().create();
  private static final TypeToken<Map<String, Object>> MAP_TYPE_TOKEN =
      new TypeToken<Map<String, Object>>() {};

  private static final Logger logger = Logger.getLogger(GraphQlServlet.class.getName());
  //官方定义的一些类型。比如说mutation（inject中的注入）
  @Inject @Schema GraphQLSchema schema;
  @Inject Provider<DataLoaderRegistry> registryProvider;
    //当接收到post请求的时候执行的东西
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    DataLoaderRegistry dataLoaderRegistry = registryProvider.get();
    Instrumentation instrumentation =
            //这将允许您将许多个Instrumentation放到一块并且按照顺序去执行
        new ChainedInstrumentation(
            Arrays.asList(
                GuavaListenableFutureSupport.listenableFutureInstrumentation(),
                new DataLoaderDispatcherInstrumentation(dataLoaderRegistry),
                new TracingInstrumentation()));
    GraphQL graphql = GraphQL.newGraphQL(schema).instrumentation(instrumentation).build();
    //读取到所有请求的数据
    Map<String, Object> json = readJson(req);
    //获取到query的内容，并且强转成一个String类型
    String query = (String) json.get("query");
    if (query == null) {
      resp.setStatus(400);
      return;
    }
    String operationName = (String) json.get("operationName");
    Map<String, Object> variables = getVariables(json.get("variables"));
    //在Graphql执行的时候输入的一系列的值query，variables之类的东西
    ExecutionInput executionInput =
        ExecutionInput.newExecutionInput()
            .query(query)
            .operationName(operationName)
            .variables(variables)
            .context(dataLoaderRegistry)
            .build();
    //使用提供的输入对象执行sql语句
    ExecutionResult executionResult = graphql.execute(executionInput);
    //设置响应的方式是json
    resp.setContentType("application/json");
    resp.setStatus(HttpServletResponse.SC_OK);
    //将目标序列化为json，还有一个fromJSON将目标反序列化为GSON
    GSON.toJson(executionResult.toSpecification(), resp.getWriter());
    logger.info("stats: " + dataLoaderRegistry.getStatistics());
  }
    //将获得的variables变量转换为map
  private static Map<String, Object> getVariables(Object variables) {
    Map<String, Object> variablesWithStringKey = new HashMap<>();
      if (variables instanceof Map) {
          //遍历map将其赋值到另一个map当中去
          ((Map) variables).forEach((k, v) -> variablesWithStringKey.put(String.valueOf(k), v));
      }
    return variablesWithStringKey;
  }
  //将请求的json数据转换成map
  private static Map<String, Object> readJson(HttpServletRequest request) {
    try {
      String json = CharStreams.toString(request.getReader());
      return jsonToMap(json);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static Map<String, Object> jsonToMap(String json) {
    if (Strings.isNullOrEmpty(json)) {
      return ImmutableMap.of();
    }
    return Optional.<Map<String, Object>>ofNullable(GSON.fromJson(json, MAP_TYPE_TOKEN.getType()))
        .orElse(ImmutableMap.of());
  }
}
