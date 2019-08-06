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

package com.google.api.graphql.examples.helloworld.graphqlserver;

import com.google.api.graphql.execution.GuavaListenableFutureSupport;
import com.google.api.graphql.rejoiner.Schema;
import com.google.api.graphql.rejoiner.SchemaProviderModule;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Guice;
import com.google.inject.Key;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.execution.instrumentation.ChainedInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import graphql.execution.instrumentation.tracing.TracingInstrumentation;
import graphql.schema.GraphQLSchema;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class GraphQlHandler extends AbstractHandler {
  private static final Gson GSON = new GsonBuilder().serializeNulls().create();
  private static final TypeToken<Map<String, Object>> MAP_TYPE_TOKEN =
      new TypeToken<Map<String, Object>>() {};

  private static final GraphQLSchema SCHEMA =
          //为给定的模块集创建注入器
      Guice.createInjector(
              new SchemaProviderModule(),
              new HelloWorldClientModule(),
              new HelloWorldSchemaModule())
          .getInstance(Key.get(GraphQLSchema.class, Schema.class));
  /**
   * 这个接口中提供了一些检测graphql的查询执行步骤的功能
   * 其中每个方法都会返回一个InstrumentationContext
   * 执行一个异步操作，一步用于完成，一步用于分发
   */
  private static final Instrumentation INSTRUMENTATION =
          /**
           * 将许多Instrumentation连接在一块，并且按照顺序执行
           * 始终保持列表的执行顺序
           */
      new ChainedInstrumentation(
              /**
               * 第一个参数：监控返回来的值，并且将这个值转化一下，具体怎么转化不太清楚
               * 第二个参数：追踪仪表，追踪graphql结果集
               */
          Arrays.asList(
              GuavaListenableFutureSupport.listenableFutureInstrumentation(),
              new TracingInstrumentation()));

  private static final GraphQL GRAPHQL =
      GraphQL.newGraphQL(SCHEMA).instrumentation(INSTRUMENTATION).build();

  @Override
  public void handle(
      String target,
      Request request,
      HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse)
      throws IOException, ServletException {
    if ("/graphql".equals(target)) {
      request.setHandled(true);
      //这个参数就是在前台页面上传入的参数（readJSON方法是直接将json字符串转化为）
      Map<String, Object> json = readJson(httpServletRequest);
      //System.out.println(json.toString());
      String query = (String) json.get("query");
      //如果前台传过来的query啥也没有的时候，这时候报错400
      if (query == null) {
        httpServletResponse.setStatus(400);
        return;
      }
      /**
       * operationName：操作名
       * variables：变量
       */
      String operationName = (String) json.get("operationName");

      Map<String, Object> variables = getVariables(json.get("variables"));

      ExecutionInput executionInput =
          ExecutionInput.newExecutionInput()
              .query(query)
              .operationName(operationName)
              .variables(variables)
              .context(new Object())
              .build();
      //使用输入的参数对象执行Graphql语句
      ExecutionResult executionResult = GRAPHQL.execute(executionInput);
      httpServletResponse.setContentType("application/json");
      httpServletResponse.setStatus(HttpServletResponse.SC_OK);
      //第一个参数为服务器，接受到客户端请求后返回的一数据
      GSON.toJson(executionResult.toSpecification(), httpServletResponse.getWriter());
//      System.out.println(executionResult.toSpecification());
    }
  }

  private static Map<String, Object> getVariables(Object variables) {
    Map<String, Object> variablesWithStringKey = new HashMap<>();
    if (variables instanceof Map) {
      ((Map) variables).forEach((k, v) -> variablesWithStringKey.put(String.valueOf(k), v));
    }
    return variablesWithStringKey;
  }

  /**
   * 将json转化为字符串，然后调用方法转化为Map
   * @param request
   * @return
   */
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
