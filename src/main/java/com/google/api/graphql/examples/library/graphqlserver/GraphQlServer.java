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

import com.google.api.graphql.examples.library.graphqlserver.client.ClientModule;
import com.google.api.graphql.examples.library.graphqlserver.schema.SchemaModule;
import com.google.api.graphql.rejoiner.SchemaProviderModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.util.resource.PathResource;

import java.io.File;
import java.util.EnumSet;
import java.util.logging.Logger;

import static javax.servlet.DispatcherType.ASYNC;
import static javax.servlet.DispatcherType.REQUEST;
import static org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS;

/**
 * 配置那个方便查询的页面。
 */
public class GraphQlServer {

          private static final int HTTP_PORT = 8989;
          private static final Logger logger = Logger.getLogger(GraphQlServer.class.getName());


          public static void main(String[] args) throws Exception {

              Server server = new Server(HTTP_PORT);
              //使用上下文对象构造可选的简单构造上下文会话和安全处理程序等。
              ServletContextHandler context = new ServletContextHandler(server, "/", SESSIONS);
              //利用上下文创建一个监听器
    context.addEventListener(
            //构建应用程序的对象的图形。注入器跟踪依赖关系
        new GuiceServletContextListener() {
            //使用getInjector创建进样器的引用
          @Override
          protected Injector getInjector() {
              //将所有module放到一个Arrays中，传入一个一个module就可以
              Injector injector = Guice.createInjector(
                      //配置Servlet作用域，以便进行注入，请求响应对话等等
                      new ServletModule() {
                          @Override
                          protected void configureServlets() {
                              //使用这个名字匹配格式，比如说路径，或者.html文件
                              serve("/graphql").with(GraphQlServlet.class);
                          }
                      },
                      new DataLoaderModule(),
                      new SchemaProviderModule(), // Part of Rejoiner framework (Provides `@Schema
                      // GraphQLSchema`)
                      new ClientModule(), // Installs all of the client modules
                      new SchemaModule() // Installs all of the schema modules
              );
              return injector;
          }
        });
    //过滤器类   路径规范   调用过滤器调度类型
    context.addFilter(GuiceFilter.class, "/*", EnumSet.of(REQUEST, ASYNC));

    context.setBaseResource(
            new PathResource(new File("./src/main/resources").toPath().toRealPath()));
    context.addServlet(DefaultServlet.class, "/");
    //开启服务
    server.start();
    logger.info("Server running on port " + HTTP_PORT);
    //这个是从线程池中获取的
    server.join();
  }
}
