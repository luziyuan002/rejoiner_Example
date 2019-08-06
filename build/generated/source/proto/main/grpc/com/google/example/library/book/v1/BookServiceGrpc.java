package com.google.example.library.book.v1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * This API represents a simple book repository.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: library/book_service.proto")
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "google.example.library.book.v1.BookService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.CreateBookRequest,
      com.google.example.library.book.v1.Book> METHOD_CREATE_BOOK =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.CreateBookRequest, com.google.example.library.book.v1.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "CreateBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.CreateBookRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.Book.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("CreateBook"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.GetBookRequest,
      com.google.example.library.book.v1.Book> METHOD_GET_BOOK =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.GetBookRequest, com.google.example.library.book.v1.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "GetBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.GetBookRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.Book.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBook"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.ListBooksRequest,
      com.google.example.library.book.v1.ListBooksResponse> METHOD_LIST_BOOKS =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.ListBooksRequest, com.google.example.library.book.v1.ListBooksResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "ListBooks"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.ListBooksRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.ListBooksResponse.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("ListBooks"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.ListBooksRequest,
      com.google.example.library.book.v1.ListBooksResponse> METHOD_STREAM_BOOKS =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.ListBooksRequest, com.google.example.library.book.v1.ListBooksResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "StreamBooks"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.ListBooksRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.ListBooksResponse.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("StreamBooks"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.DeleteBookRequest,
      com.google.protobuf.Empty> METHOD_DELETE_BOOK =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.DeleteBookRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "DeleteBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.DeleteBookRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("DeleteBook"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.book.v1.UpdateBookRequest,
      com.google.example.library.book.v1.Book> METHOD_UPDATE_BOOK =
      io.grpc.MethodDescriptor.<com.google.example.library.book.v1.UpdateBookRequest, com.google.example.library.book.v1.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.book.v1.BookService", "UpdateBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.UpdateBookRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.book.v1.Book.getDefaultInstance()))
          .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("UpdateBook"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    return new BookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This API represents a simple book repository.
   * </pre>
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public void createBook(com.google.example.library.book.v1.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void getBook(com.google.example.library.book.v1.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Lists all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listBooks(com.google.example.library.book.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BOOKS, responseObserver);
    }

    /**
     * <pre>
     * Stream all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public void streamBooks(com.google.example.library.book.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STREAM_BOOKS, responseObserver);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void deleteBook(com.google.example.library.book.v1.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the id of the book
     * is non-empty and does equal the previous id.
     * </pre>
     */
    public void updateBook(com.google.example.library.book.v1.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BOOK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.book.v1.CreateBookRequest,
                com.google.example.library.book.v1.Book>(
                  this, METHODID_CREATE_BOOK)))
          .addMethod(
            METHOD_GET_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.book.v1.GetBookRequest,
                com.google.example.library.book.v1.Book>(
                  this, METHODID_GET_BOOK)))
          .addMethod(
            METHOD_LIST_BOOKS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.book.v1.ListBooksRequest,
                com.google.example.library.book.v1.ListBooksResponse>(
                  this, METHODID_LIST_BOOKS)))
          .addMethod(
            METHOD_STREAM_BOOKS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.example.library.book.v1.ListBooksRequest,
                com.google.example.library.book.v1.ListBooksResponse>(
                  this, METHODID_STREAM_BOOKS)))
          .addMethod(
            METHOD_DELETE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.book.v1.DeleteBookRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BOOK)))
          .addMethod(
            METHOD_UPDATE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.book.v1.UpdateBookRequest,
                com.google.example.library.book.v1.Book>(
                  this, METHODID_UPDATE_BOOK)))
          .build();
    }
  }

  /**
   * <pre>
   * This API represents a simple book repository.
   * </pre>
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractStub<BookServiceStub> {
    private BookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public void createBook(com.google.example.library.book.v1.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void getBook(com.google.example.library.book.v1.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listBooks(com.google.example.library.book.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BOOKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public void streamBooks(com.google.example.library.book.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_STREAM_BOOKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void deleteBook(com.google.example.library.book.v1.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the id of the book
     * is non-empty and does equal the previous id.
     * </pre>
     */
    public void updateBook(com.google.example.library.book.v1.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This API represents a simple book repository.
   * </pre>
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public com.google.example.library.book.v1.Book createBook(com.google.example.library.book.v1.CreateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.example.library.book.v1.Book getBook(com.google.example.library.book.v1.GetBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.example.library.book.v1.ListBooksResponse listBooks(com.google.example.library.book.v1.ListBooksRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BOOKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public java.util.Iterator<com.google.example.library.book.v1.ListBooksResponse> streamBooks(
        com.google.example.library.book.v1.ListBooksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_STREAM_BOOKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBook(com.google.example.library.book.v1.DeleteBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the id of the book
     * is non-empty and does equal the previous id.
     * </pre>
     */
    public com.google.example.library.book.v1.Book updateBook(com.google.example.library.book.v1.UpdateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BOOK, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This API represents a simple book repository.
   * </pre>
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractStub<BookServiceFutureStub> {
    private BookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.book.v1.Book> createBook(
        com.google.example.library.book.v1.CreateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.book.v1.Book> getBook(
        com.google.example.library.book.v1.GetBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all books. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.book.v1.ListBooksResponse> listBooks(
        com.google.example.library.book.v1.ListBooksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BOOKS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBook(
        com.google.example.library.book.v1.DeleteBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the id of the book
     * is non-empty and does equal the previous id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.book.v1.Book> updateBook(
        com.google.example.library.book.v1.UpdateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOK = 0;
  private static final int METHODID_GET_BOOK = 1;
  private static final int METHODID_LIST_BOOKS = 2;
  private static final int METHODID_STREAM_BOOKS = 3;
  private static final int METHODID_DELETE_BOOK = 4;
  private static final int METHODID_UPDATE_BOOK = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((com.google.example.library.book.v1.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book>) responseObserver);
          break;
        case METHODID_GET_BOOK:
          serviceImpl.getBook((com.google.example.library.book.v1.GetBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book>) responseObserver);
          break;
        case METHODID_LIST_BOOKS:
          serviceImpl.listBooks((com.google.example.library.book.v1.ListBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse>) responseObserver);
          break;
        case METHODID_STREAM_BOOKS:
          serviceImpl.streamBooks((com.google.example.library.book.v1.ListBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.book.v1.ListBooksResponse>) responseObserver);
          break;
        case METHODID_DELETE_BOOK:
          serviceImpl.deleteBook((com.google.example.library.book.v1.DeleteBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BOOK:
          serviceImpl.updateBook((com.google.example.library.book.v1.UpdateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.book.v1.Book>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.example.library.book.v1.BookServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(METHOD_CREATE_BOOK)
              .addMethod(METHOD_GET_BOOK)
              .addMethod(METHOD_LIST_BOOKS)
              .addMethod(METHOD_STREAM_BOOKS)
              .addMethod(METHOD_DELETE_BOOK)
              .addMethod(METHOD_UPDATE_BOOK)
              .build();
        }
      }
    }
    return result;
  }
}
