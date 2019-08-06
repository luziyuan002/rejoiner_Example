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

package com.google.api.graphql.examples.helloworld.backend;



import io.grpc.Server;
import io.grpc.ServerBuilder;

import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Logger;
/**
 * {
 *   sayHello{
 *     message
 *   }
 * }
 */

/** Server that manages startup/shutdown of a {@code Greeter} server. */
public class HelloWorldServer {
  //打印对象的实际类
  private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50051;
    //实例工厂                                       给服务中添加一个方法  创建实例运行
    server = ServerBuilder.forPort(port).addService(new GreeterImpl()).build().start();
    logger.info("Server started, listening on " + port);
    //返回与当前java应用程序关联的运行时对象
    Runtime.getRuntime()
            //注册一个新的虚拟机，关机挂钩
        .addShutdownHook(
            new Thread() {
              @Override
              public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
              }
            });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /** Await termination on the main thread since the grpc library uses daemon threads. */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      //等待服务器终止
      server.awaitTermination();
    }
  }

  /** Main launches the server from the command line. */
  public static void main(String[] args) throws IOException, InterruptedException {
    final HelloWorldServer server = new HelloWorldServer();
    server.start();
    server.blockUntilShutdown();
  }

  static class GreeterImpl extends GreeterGrpc.GreeterImplBase {

    //只有在客户端请求的时候，才会执行这个方法
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
      HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
      System.out.println("heheheheheh");
      System.out.println(reply);
      //服务器接受到请求作出响应，
      responseObserver.onNext(reply);
      //收到完成流的通知，必须是最后一个调用的方法，如果抛出异常，那么就不会继续执行
      responseObserver.onCompleted();

    }
  }
}
