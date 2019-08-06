// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library/book_service.proto

package com.google.example.library.book.v1;

public interface ListBooksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.example.library.book.v1.ListBooksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.book.v1.Book books = 1;</code>
   */
  java.util.List<com.google.example.library.book.v1.Book> 
      getBooksList();
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.book.v1.Book books = 1;</code>
   */
  com.google.example.library.book.v1.Book getBooks(int index);
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.book.v1.Book books = 1;</code>
   */
  int getBooksCount();
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.book.v1.Book books = 1;</code>
   */
  java.util.List<? extends com.google.example.library.book.v1.BookOrBuilder> 
      getBooksOrBuilderList();
  /**
   * <pre>
   * The list of books.
   * </pre>
   *
   * <code>repeated .google.example.library.book.v1.Book books = 1;</code>
   */
  com.google.example.library.book.v1.BookOrBuilder getBooksOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass this value in the
   * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
   * field in the subsequent call to `ListBooks` method to retrieve the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass this value in the
   * [ListBooksRequest.page_token][google.example.library.v1.ListBooksRequest.page_token]
   * field in the subsequent call to `ListBooks` method to retrieve the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
