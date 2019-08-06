package io.grpc.examples.streaming;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: helloworld_streaming.proto")
public final class StreamingGreeterGrpc {

  private StreamingGreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.streaming.StreamingGreeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.streaming.HelloRequest,
      io.grpc.examples.streaming.HelloReply> METHOD_SAY_HELLO_STREAMING =
      io.grpc.MethodDescriptor.<io.grpc.examples.streaming.HelloRequest, io.grpc.examples.streaming.HelloReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "helloworld.streaming.StreamingGreeter", "SayHelloStreaming"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.streaming.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.streaming.HelloReply.getDefaultInstance()))
          .setSchemaDescriptor(new StreamingGreeterMethodDescriptorSupplier("SayHelloStreaming"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamingGreeterStub newStub(io.grpc.Channel channel) {
    return new StreamingGreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamingGreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamingGreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamingGreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamingGreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class StreamingGreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Streams a many greetings
     * </pre>
     */
    public void sayHelloStreaming(io.grpc.examples.streaming.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.streaming.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_STREAMING, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO_STREAMING,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.streaming.HelloRequest,
                io.grpc.examples.streaming.HelloReply>(
                  this, METHODID_SAY_HELLO_STREAMING)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class StreamingGreeterStub extends io.grpc.stub.AbstractStub<StreamingGreeterStub> {
    private StreamingGreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingGreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingGreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingGreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Streams a many greetings
     * </pre>
     */
    public void sayHelloStreaming(io.grpc.examples.streaming.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.streaming.HelloReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SAY_HELLO_STREAMING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class StreamingGreeterBlockingStub extends io.grpc.stub.AbstractStub<StreamingGreeterBlockingStub> {
    private StreamingGreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingGreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingGreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingGreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Streams a many greetings
     * </pre>
     */
    public java.util.Iterator<io.grpc.examples.streaming.HelloReply> sayHelloStreaming(
        io.grpc.examples.streaming.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SAY_HELLO_STREAMING, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class StreamingGreeterFutureStub extends io.grpc.stub.AbstractStub<StreamingGreeterFutureStub> {
    private StreamingGreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingGreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingGreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingGreeterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO_STREAMING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamingGreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamingGreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_STREAMING:
          serviceImpl.sayHelloStreaming((io.grpc.examples.streaming.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.streaming.HelloReply>) responseObserver);
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

  private static abstract class StreamingGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamingGreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.streaming.HelloStreamingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamingGreeter");
    }
  }

  private static final class StreamingGreeterFileDescriptorSupplier
      extends StreamingGreeterBaseDescriptorSupplier {
    StreamingGreeterFileDescriptorSupplier() {}
  }

  private static final class StreamingGreeterMethodDescriptorSupplier
      extends StreamingGreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamingGreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamingGreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamingGreeterFileDescriptorSupplier())
              .addMethod(METHOD_SAY_HELLO_STREAMING)
              .build();
        }
      }
    }
    return result;
  }
}
