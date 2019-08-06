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

package com.google.api.graphql.examples.streaming.graphqlserver;

import com.google.inject.AbstractModule;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.grpc.examples.streaming.StreamingGreeterGrpc;

import java.util.concurrent.TimeUnit;

final class HelloWorldClientModule extends AbstractModule {

  private static final String HOST = "localhost";
  private static final int PORT = 50051;
  private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;

  @Override
  protected void configure() {
    ManagedChannel channel =
            ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext(true).build();
    bind(StreamingGreeterGrpc.StreamingGreeterStub.class)
            .toInstance(StreamingGreeterGrpc.newStub(channel));
  }


}
