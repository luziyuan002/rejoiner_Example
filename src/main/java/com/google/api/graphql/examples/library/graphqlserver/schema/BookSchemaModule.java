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

package com.google.api.graphql.examples.library.graphqlserver.schema;

import com.google.api.graphql.rejoiner.Mutation;
import com.google.api.graphql.rejoiner.Query;
import com.google.api.graphql.rejoiner.RelayNode;
import com.google.api.graphql.rejoiner.SchemaModule;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.example.library.book.v1.*;
import graphql.schema.DataFetchingEnvironment;
import net.javacrumbs.futureconverter.java8guava.FutureConverter;
import org.dataloader.DataLoaderRegistry;
/**
 * 这里相当于schema文件写入方法
 */

/** A GraphQL {@link SchemaModule} backed by a gRPC service. */
final class BookSchemaModule extends SchemaModule {

  @Query("getBook")
  //返回具有中继接口结点的类型
  @RelayNode
  ListenableFuture<Book> getBook(
      GetBookRequest request, DataFetchingEnvironment dataFetchingEnvironment) {
    return FutureConverter.toListenableFuture(
        dataFetchingEnvironment
                //返回一个上下文对象，用于返回数据
            .<DataLoaderRegistry>getContext()
                //返回在指定键下注册的dataload
            .<String, Book>getDataLoader("books")
                //请求以异步的方式加载具有指定键的数据，并返回结果值
            .load(request.getId()));
  }

  @Query("listBooks")
  ListenableFuture<ListBooksResponse> listBooks(
      ListBooksRequest request, BookServiceGrpc.BookServiceFutureStub client) {
    return client.listBooks(request);
  }

  @Mutation("createBook")
  ListenableFuture<Book> createBook(
      CreateBookRequest request, BookServiceGrpc.BookServiceFutureStub client) {
    return client.createBook(request);
  }
  @Mutation("updateBook")
  ListenableFuture<Book> updateBook(
      UpdateBookRequest request, BookServiceGrpc.BookServiceFutureStub client) {
      return client.updateBook(request);
    }
}
