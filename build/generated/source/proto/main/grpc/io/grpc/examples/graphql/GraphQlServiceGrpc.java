package io.grpc.examples.graphql;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: graphql_service.proto")
public final class GraphQlServiceGrpc {

  private GraphQlServiceGrpc() {}

  public static final String SERVICE_NAME = "GraphQlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.graphql.GraphQlRequest,
      io.grpc.examples.graphql.GraphQlResponse> METHOD_EXECUTE =
      io.grpc.MethodDescriptor.<io.grpc.examples.graphql.GraphQlRequest, io.grpc.examples.graphql.GraphQlResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "GraphQlService", "Execute"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.graphql.GraphQlRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.graphql.GraphQlResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GraphQlServiceMethodDescriptorSupplier("Execute"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GraphQlServiceStub newStub(io.grpc.Channel channel) {
    return new GraphQlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GraphQlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GraphQlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GraphQlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GraphQlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GraphQlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void execute(io.grpc.examples.graphql.GraphQlRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.graphql.GraphQlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXECUTE,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.graphql.GraphQlRequest,
                io.grpc.examples.graphql.GraphQlResponse>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class GraphQlServiceStub extends io.grpc.stub.AbstractStub<GraphQlServiceStub> {
    private GraphQlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GraphQlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphQlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphQlServiceStub(channel, callOptions);
    }

    /**
     */
    public void execute(io.grpc.examples.graphql.GraphQlRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.graphql.GraphQlResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GraphQlServiceBlockingStub extends io.grpc.stub.AbstractStub<GraphQlServiceBlockingStub> {
    private GraphQlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GraphQlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphQlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphQlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<io.grpc.examples.graphql.GraphQlResponse> execute(
        io.grpc.examples.graphql.GraphQlRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXECUTE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GraphQlServiceFutureStub extends io.grpc.stub.AbstractStub<GraphQlServiceFutureStub> {
    private GraphQlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GraphQlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GraphQlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphQlServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXECUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GraphQlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GraphQlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((io.grpc.examples.graphql.GraphQlRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.graphql.GraphQlResponse>) responseObserver);
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

  private static abstract class GraphQlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GraphQlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.graphql.GraphQlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GraphQlService");
    }
  }

  private static final class GraphQlServiceFileDescriptorSupplier
      extends GraphQlServiceBaseDescriptorSupplier {
    GraphQlServiceFileDescriptorSupplier() {}
  }

  private static final class GraphQlServiceMethodDescriptorSupplier
      extends GraphQlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GraphQlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GraphQlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GraphQlServiceFileDescriptorSupplier())
              .addMethod(METHOD_EXECUTE)
              .build();
        }
      }
    }
    return result;
  }
}
