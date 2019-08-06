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
import com.google.api.graphql.rejoiner.SchemaModule;
import com.google.common.collect.ImmutableList;
import com.google.example.library.book.v1.Book;
import com.google.example.library.book.v1.BookServiceGrpc;
import com.google.example.library.book.v1.CreateBookRequest;
import com.google.example.library.shelf.v1.CreateShelfRequest;
import com.google.example.library.shelf.v1.Shelf;
import com.google.example.library.shelf.v1.ShelfServiceGrpc;
import com.google.protobuf.Empty;
/**
 * 为什么这里用BookServiceBlockingStub的client创建的东西可以添加可以直接添加到数据当中
 * 其实，这个案例在初始化数据的时候，就是继承了 BookServiceBlockingStub并且重写了里面的方法并且将之放到
 * map当中，所以可以查到，这里的话，我们直接调用重写的方法当然是可以直接查到的
 *
 *
/** A GraphQL {@link SchemaModule} backed by a gRPC service. */
final class SeedLibrarySchemaModule extends SchemaModule {
    //这里调用方法之后因为调用方法直接调用的是重写的方法，直接存到map中，所以可以保存进去
  @Mutation("seed")
  Empty seed(
      ShelfServiceGrpc.ShelfServiceBlockingStub shelfClient,
      BookServiceGrpc.BookServiceBlockingStub bookClient) {
        String greatExpectations =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("Charles Dickens")
                            .setTitle("Great Expectations")
                            .setRead(false))
                    .build())
            .getId();
    String thinkingFastAndSlow =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("Daniel Kahnemann")
                            .setTitle("Thinking, Fast and Slow")
                            .setRead(true))
                    .build())
            .getId();
    String theCatcherInTheRye =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("J. D. Salinger")
                            .setTitle("The Catcher in the Rye")
                            .setRead(false))
                    .build())
            .getId();
    String huckleberryFinn =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("Mark Twain")
                            .setTitle("The Adventures of Huckleberry Finn")
                            .setRead(false))
                    .build())
            .getId();
    String masterAndMargarita =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("Mikhail Bulgakov")
                            .setTitle("The Master and Margarita")
                            .setRead(false))
                    .build())
            .getId();
    String warAndPeace =
        bookClient
            .createBook(
                CreateBookRequest.newBuilder()
                    .setBook(
                        Book.newBuilder()
                            .setAuthor("Leo Tolstoy")
                            .setTitle("War and Peace")
                            .setRead(true))
                    .build())
            .getId();

    shelfClient.createShelf(
        CreateShelfRequest.newBuilder()
            .setShelf(
                Shelf.newBuilder()
                    .setTheme("Satire")
                    .addAllBookIds(ImmutableList.of(greatExpectations, thinkingFastAndSlow))
                    .build())
            .build());
    shelfClient.createShelf(
        CreateShelfRequest.newBuilder()
            .setShelf(
                Shelf.newBuilder()
                    .setTheme("Classics")
                    .addAllBookIds(ImmutableList.of(theCatcherInTheRye, huckleberryFinn))
                    .build())
            .build());
    shelfClient.createShelf(
        CreateShelfRequest.newBuilder()
            .setShelf(
                Shelf.newBuilder()
                    .setTheme("Russian")
                    .addAllBookIds(ImmutableList.of(masterAndMargarita, warAndPeace))
                    .build())
            .build());
    return Empty.getDefaultInstance();
  }
}
