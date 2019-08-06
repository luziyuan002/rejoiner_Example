package com.google.example.library.shelf.v1;

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
 * This API represents a simple digital library.  It lets you manage Shelf
 * resources and Book resources in the library. It defines the following
 * resource model:
 * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
 *   resources, named `shelves/&#42;`
 * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
 *   resources, named `shelves/&#42;&#47;books/&#42;`
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: library/shelf_service.proto")
public final class ShelfServiceGrpc {

  private ShelfServiceGrpc() {}

  public static final String SERVICE_NAME = "google.example.library.shelf.v1.ShelfService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.shelf.v1.CreateShelfRequest,
      com.google.example.library.shelf.v1.Shelf> METHOD_CREATE_SHELF =
      io.grpc.MethodDescriptor.<com.google.example.library.shelf.v1.CreateShelfRequest, com.google.example.library.shelf.v1.Shelf>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.shelf.v1.ShelfService", "CreateShelf"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.CreateShelfRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.Shelf.getDefaultInstance()))
          .setSchemaDescriptor(new ShelfServiceMethodDescriptorSupplier("CreateShelf"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.shelf.v1.GetShelfRequest,
      com.google.example.library.shelf.v1.Shelf> METHOD_GET_SHELF =
      io.grpc.MethodDescriptor.<com.google.example.library.shelf.v1.GetShelfRequest, com.google.example.library.shelf.v1.Shelf>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.shelf.v1.ShelfService", "GetShelf"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.GetShelfRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.Shelf.getDefaultInstance()))
          .setSchemaDescriptor(new ShelfServiceMethodDescriptorSupplier("GetShelf"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.shelf.v1.ListShelvesRequest,
      com.google.example.library.shelf.v1.ListShelvesResponse> METHOD_LIST_SHELVES =
      io.grpc.MethodDescriptor.<com.google.example.library.shelf.v1.ListShelvesRequest, com.google.example.library.shelf.v1.ListShelvesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.shelf.v1.ShelfService", "ListShelves"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.ListShelvesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.ListShelvesResponse.getDefaultInstance()))
          .setSchemaDescriptor(new ShelfServiceMethodDescriptorSupplier("ListShelves"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.shelf.v1.DeleteShelfRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SHELF =
      io.grpc.MethodDescriptor.<com.google.example.library.shelf.v1.DeleteShelfRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.shelf.v1.ShelfService", "DeleteShelf"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.DeleteShelfRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setSchemaDescriptor(new ShelfServiceMethodDescriptorSupplier("DeleteShelf"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.shelf.v1.MergeShelvesRequest,
      com.google.example.library.shelf.v1.Shelf> METHOD_MERGE_SHELVES =
      io.grpc.MethodDescriptor.<com.google.example.library.shelf.v1.MergeShelvesRequest, com.google.example.library.shelf.v1.Shelf>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.example.library.shelf.v1.ShelfService", "MergeShelves"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.MergeShelvesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.example.library.shelf.v1.Shelf.getDefaultInstance()))
          .setSchemaDescriptor(new ShelfServiceMethodDescriptorSupplier("MergeShelves"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShelfServiceStub newStub(io.grpc.Channel channel) {
    return new ShelfServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShelfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShelfServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShelfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShelfServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static abstract class ShelfServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public void createShelf(com.google.example.library.shelf.v1.CreateShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void getShelf(com.google.example.library.shelf.v1.GetShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listShelves(com.google.example.library.shelf.v1.ListShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.ListShelvesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SHELVES, responseObserver);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void deleteShelf(com.google.example.library.shelf.v1.DeleteShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_id` to shelf `id`, and deletes
     * `other_shelf_id`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public void mergeShelves(com.google.example.library.shelf.v1.MergeShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MERGE_SHELVES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.shelf.v1.CreateShelfRequest,
                com.google.example.library.shelf.v1.Shelf>(
                  this, METHODID_CREATE_SHELF)))
          .addMethod(
            METHOD_GET_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.shelf.v1.GetShelfRequest,
                com.google.example.library.shelf.v1.Shelf>(
                  this, METHODID_GET_SHELF)))
          .addMethod(
            METHOD_LIST_SHELVES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.shelf.v1.ListShelvesRequest,
                com.google.example.library.shelf.v1.ListShelvesResponse>(
                  this, METHODID_LIST_SHELVES)))
          .addMethod(
            METHOD_DELETE_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.shelf.v1.DeleteShelfRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SHELF)))
          .addMethod(
            METHOD_MERGE_SHELVES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.shelf.v1.MergeShelvesRequest,
                com.google.example.library.shelf.v1.Shelf>(
                  this, METHODID_MERGE_SHELVES)))
          .build();
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class ShelfServiceStub extends io.grpc.stub.AbstractStub<ShelfServiceStub> {
    private ShelfServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShelfServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShelfServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShelfServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public void createShelf(com.google.example.library.shelf.v1.CreateShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void getShelf(com.google.example.library.shelf.v1.GetShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listShelves(com.google.example.library.shelf.v1.ListShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.ListShelvesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SHELVES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void deleteShelf(com.google.example.library.shelf.v1.DeleteShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_id` to shelf `id`, and deletes
     * `other_shelf_id`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public void mergeShelves(com.google.example.library.shelf.v1.MergeShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MERGE_SHELVES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class ShelfServiceBlockingStub extends io.grpc.stub.AbstractStub<ShelfServiceBlockingStub> {
    private ShelfServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShelfServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShelfServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShelfServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public com.google.example.library.shelf.v1.Shelf createShelf(com.google.example.library.shelf.v1.CreateShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.example.library.shelf.v1.Shelf getShelf(com.google.example.library.shelf.v1.GetShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.example.library.shelf.v1.ListShelvesResponse listShelves(com.google.example.library.shelf.v1.ListShelvesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SHELVES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deleteShelf(com.google.example.library.shelf.v1.DeleteShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_id` to shelf `id`, and deletes
     * `other_shelf_id`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public com.google.example.library.shelf.v1.Shelf mergeShelves(com.google.example.library.shelf.v1.MergeShelvesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MERGE_SHELVES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class ShelfServiceFutureStub extends io.grpc.stub.AbstractStub<ShelfServiceFutureStub> {
    private ShelfServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShelfServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShelfServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShelfServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.shelf.v1.Shelf> createShelf(
        com.google.example.library.shelf.v1.CreateShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.shelf.v1.Shelf> getShelf(
        com.google.example.library.shelf.v1.GetShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.shelf.v1.ListShelvesResponse> listShelves(
        com.google.example.library.shelf.v1.ListShelvesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SHELVES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteShelf(
        com.google.example.library.shelf.v1.DeleteShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_id` to shelf `id`, and deletes
     * `other_shelf_id`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.shelf.v1.Shelf> mergeShelves(
        com.google.example.library.shelf.v1.MergeShelvesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MERGE_SHELVES, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SHELF = 0;
  private static final int METHODID_GET_SHELF = 1;
  private static final int METHODID_LIST_SHELVES = 2;
  private static final int METHODID_DELETE_SHELF = 3;
  private static final int METHODID_MERGE_SHELVES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShelfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShelfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SHELF:
          serviceImpl.createShelf((com.google.example.library.shelf.v1.CreateShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf>) responseObserver);
          break;
        case METHODID_GET_SHELF:
          serviceImpl.getShelf((com.google.example.library.shelf.v1.GetShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf>) responseObserver);
          break;
        case METHODID_LIST_SHELVES:
          serviceImpl.listShelves((com.google.example.library.shelf.v1.ListShelvesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.ListShelvesResponse>) responseObserver);
          break;
        case METHODID_DELETE_SHELF:
          serviceImpl.deleteShelf((com.google.example.library.shelf.v1.DeleteShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MERGE_SHELVES:
          serviceImpl.mergeShelves((com.google.example.library.shelf.v1.MergeShelvesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.shelf.v1.Shelf>) responseObserver);
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

  private static abstract class ShelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShelfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.example.library.shelf.v1.ShelfServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShelfService");
    }
  }

  private static final class ShelfServiceFileDescriptorSupplier
      extends ShelfServiceBaseDescriptorSupplier {
    ShelfServiceFileDescriptorSupplier() {}
  }

  private static final class ShelfServiceMethodDescriptorSupplier
      extends ShelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShelfServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShelfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShelfServiceFileDescriptorSupplier())
              .addMethod(METHOD_CREATE_SHELF)
              .addMethod(METHOD_GET_SHELF)
              .addMethod(METHOD_LIST_SHELVES)
              .addMethod(METHOD_DELETE_SHELF)
              .addMethod(METHOD_MERGE_SHELVES)
              .build();
        }
      }
    }
    return result;
  }
}
