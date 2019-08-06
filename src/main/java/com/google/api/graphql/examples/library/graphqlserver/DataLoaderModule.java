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

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.example.library.book.v1.Book;
import com.google.example.library.book.v1.BookServiceGrpc;
import com.google.example.library.book.v1.ListBooksRequest;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.javacrumbs.futureconverter.java8guava.FutureConverter;
import org.dataloader.BatchLoader;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;

import java.util.List;

final class DataLoaderModule extends AbstractModule {
    /**
     * 将加载器一起注册到一个地方
     * 作用：将需要查询的直接集结在一块，统一去坐查询，
     * 不然10条语句要发10次grpc，这样直接将这个dataloader放到grpc中，一次就可以全部解决
     * @param bookService，
     * @return
     */
    /**
     * 这个注释的作用应该是将当前方法和系统自带的方法做一个绑定，然后
     * 当我们调用dataLoaderRegistry的时候其实是调用的这里的
     * @param bookService
     * @return
     */

  @Provides
  DataLoaderRegistry dataLoaderRegistry(BookServiceGrpc.BookServiceFutureStub bookService) {

    // TODO: Use multibinder to modularize this, or automate this somehow
      //一个批处理加载程序函数将使用N个或者更多个键进行加载可以是单个对象
    BatchLoader<String, Book> bookBatchLoader =
        keys -> {
            ListenableFuture<List<Book>> listenableFuture =
                    Futures.transform(
                            bookService.listBooks(
                                    ListBooksRequest.newBuilder()
                                            .addAllIds(keys)
                                            .setPageSize(keys.size())
                                            .build()),
                            resp -> resp.getBooksList(),
                            MoreExecutors.directExecutor());
          return FutureConverter.toCompletableFuture(listenableFuture);
        };
    //将这个方法在查询的时候调用一下，那么下次再次调用的时候就会快特别多
      //可以写很多直接在查询的时候使用dataloader的对象直接将其注入，然后就会快特别多。
    DataLoaderRegistry registry = new DataLoaderRegistry();
    registry.register("books", new DataLoader<>(bookBatchLoader));
      System.out.println("dataLoader中的参数"+new DataLoader<>(bookBatchLoader).toString());

    return registry;
  }
}
