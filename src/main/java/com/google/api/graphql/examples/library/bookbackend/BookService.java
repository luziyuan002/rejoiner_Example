package com.google.api.graphql.examples.library.bookbackend;

import com.google.api.graphql.examples.mapper.BooksMapper;
import com.google.api.graphql.examples.mapper.UsersMapper;
import com.google.api.graphql.examples.model.Books;
import com.google.api.graphql.examples.model.BooksExample;
import com.google.common.collect.ImmutableList;
import com.google.example.library.book.v1.Book;
import com.google.example.library.book.v1.BookServiceGrpc;
import com.google.example.library.book.v1.CreateBookRequest;
import com.google.example.library.book.v1.DeleteBookRequest;
import com.google.example.library.book.v1.GetBookRequest;
import com.google.example.library.book.v1.ListBooksRequest;
import com.google.example.library.book.v1.ListBooksResponse;
import com.google.example.library.book.v1.UpdateBookRequest;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Resource;
import javax.annotation.concurrent.GuardedBy;

/**
 * 这个文件是不是必须的，在实战当中，因为在实战当中直接调用别的方法，这里是为了模拟数据
 */
public class BookService extends BookServiceGrpc.BookServiceImplBase {

  private static final long DEFAULT_PAGE_SIZE = 4;
  private final AtomicInteger bookIdCounter = new AtomicInteger(0);

  @GuardedBy("this")
  private final TreeMap<String, Book> booksById = new TreeMap<>();
  @Resource
  private BooksMapper booksMapper;

  //自己写的东西
BookService(){
//    List<Books> list = bookService.finallBooks();
//    for (Books book :list
//    ) {
//        this.booksById.put(book.getId().toString(),Book.newBuilder().setId(book.getId().toString()).setAuthor(book.getAuthor()).setTitle(book.getTitle()).build());
//    }

  this.booksById.put("1",Book.newBuilder().setId("1").setAuthor("lzy11").setRead(true).setTitle("gaghagagh").build());
  this.booksById.put("2",Book.newBuilder().setId("2").setAuthor("lzqy").setRead(true).setTitle("qwwqqw").build());
}


  @Override
  public synchronized void createBook(
          CreateBookRequest request, StreamObserver<Book> responseObserver) {
    String id = bookIdCounter.getAndIncrement() + "";
    booksById.put(id, request.getBook().toBuilder().setId(id).build());
    responseObserver.onNext(booksById.get(id));
    responseObserver.onCompleted();
  }

  @Override
  public synchronized void getBook(GetBookRequest request, StreamObserver<Book> responseObserver) {

        System.out.println("hehe");
        responseObserver.onNext(booksById.get(request.getId()));
        System.out.println(booksById.get(request.getId()));
        responseObserver.onCompleted();
    }

  @Override
  public synchronized void listBooks(
      ListBooksRequest request, StreamObserver<ListBooksResponse> responseObserver) {
//      com.google.api.graphql.examples.Service.BookService bookService = new com.google.api.graphql.examples.Service.BookService();
//
//    List<Books> list = bookService.finallBooks();
//      for (Books book :list
//           ) {
//          this.booksById.put(book.getId().toString(),Book.newBuilder().setId(book.getId().toString()).setAuthor(book.getAuthor()).setTitle(book.getTitle()).build());
//      }
    NavigableMap<String, Book> cursor = booksById;

    // Resume iteration from the page token.
    if (!request.getPageToken().isEmpty()) {
        //利用64位的解码方式去解决request发过来的Token
      String pageToken = decodePageToken(request.getPageToken());
      cursor = cursor.tailMap(pageToken, false);
    }

    ImmutableList<Book> books =
        cursor
            .values()
            .stream()
            .limit(request.getPageSize() > 0 ? request.getPageSize() : DEFAULT_PAGE_SIZE)
            .collect(ImmutableList.toImmutableList());

    // Return one page of results.
    ListBooksResponse.Builder responseBuilder = ListBooksResponse.newBuilder().addAllBooks(books);
    // Set next page token to resume iteration in the next request.
    if (cursor.values().size() > books.size()) {
      String nextPageToken = encodePageToken(books.get(books.size() - 1).getId());
      responseBuilder.setNextPageToken(nextPageToken);
    }

    responseObserver.onNext(responseBuilder.build());
    responseObserver.onCompleted();
  }

  @Override
  public synchronized void streamBooks(
      ListBooksRequest request, StreamObserver<ListBooksResponse> responseObserver) {

    NavigableMap<String, Book> cursor = booksById;

    // Resume iteration from the page token.
    if (!request.getPageToken().isEmpty()) {
      //请求解码
      String pageToken = decodePageToken(request.getPageToken());
        //返回此地图部分视图，其键大于pageToken  如果等于true的话前面可以等于
      cursor = cursor.tailMap(pageToken, false);
    }

    cursor
        .values()
        .stream()
        .limit(request.getPageSize() > 0 ? request.getPageSize() : DEFAULT_PAGE_SIZE)
        .forEach(
            book ->
                responseObserver.onNext(
                    ListBooksResponse.newBuilder()
                        .addBooks(book)
                        .setNextPageToken(encodePageToken(book.getId()))
                        .build()));
    responseObserver.onCompleted();
  }

  @Override
  public synchronized void deleteBook(
      DeleteBookRequest request, StreamObserver<Empty> responseObserver) {
    if (booksById.remove(request.getId()) == null) {
      throw new RuntimeException(String.format("Book with id=%s not found", request.getId()));
    }
  }

  @Override
    public synchronized void updateBook(
            UpdateBookRequest request, StreamObserver<Book> responseObserver) {
        if (booksById.replace(request.getId(), request.getBook()) == null) {
            throw new RuntimeException(String.format("Book with id=%s not found", request.getId()));
        }
    }

  /**
   *   优点：可以将二进制数据转换成可打印字符，方便传输数据；对数据进行简单的加密，肉眼安全。
   *
   *   缺点：内容编码后的体积会变大，编码和解码需要额外的工作量。
   * @param token
   * @return
   */
  //返回一个Base 64编码方式
  private static String encodePageToken(String token) {
    return new String(Base64.getEncoder().encode(token.getBytes()));
  }
  //返回一个Base 64解码方式
  private static String decodePageToken(String encodedToken) {
    return new String(Base64.getDecoder().decode(encodedToken.getBytes()));
  }
}
