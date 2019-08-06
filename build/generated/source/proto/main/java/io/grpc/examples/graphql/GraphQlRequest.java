// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphql_service.proto

package io.grpc.examples.graphql;

/**
 * Protobuf type {@code GraphQlRequest}
 */
public  final class GraphQlRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GraphQlRequest)
    GraphQlRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphQlRequest.newBuilder() to construct.
  private GraphQlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphQlRequest() {
    query_ = "";
    operationName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GraphQlRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (variables_ != null) {
              subBuilder = variables_.toBuilder();
            }
            variables_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(variables_);
              variables_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            operationName_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.graphql.GraphQlProto.internal_static_GraphQlRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.graphql.GraphQlProto.internal_static_GraphQlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.graphql.GraphQlRequest.class, io.grpc.examples.graphql.GraphQlRequest.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  private volatile java.lang.Object query_;
  /**
   * <code>string query = 1;</code>
   */
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <code>string query = 1;</code>
   */
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIABLES_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct variables_;
  /**
   * <code>.google.protobuf.Struct variables = 2;</code>
   */
  public boolean hasVariables() {
    return variables_ != null;
  }
  /**
   * <code>.google.protobuf.Struct variables = 2;</code>
   */
  public com.google.protobuf.Struct getVariables() {
    return variables_ == null ? com.google.protobuf.Struct.getDefaultInstance() : variables_;
  }
  /**
   * <code>.google.protobuf.Struct variables = 2;</code>
   */
  public com.google.protobuf.StructOrBuilder getVariablesOrBuilder() {
    return getVariables();
  }

  public static final int OPERATIONNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object operationName_;
  /**
   * <code>string operationName = 3;</code>
   */
  public java.lang.String getOperationName() {
    java.lang.Object ref = operationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationName_ = s;
      return s;
    }
  }
  /**
   * <code>string operationName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOperationNameBytes() {
    java.lang.Object ref = operationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
    }
    if (variables_ != null) {
      output.writeMessage(2, getVariables());
    }
    if (!getOperationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, operationName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
    }
    if (variables_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVariables());
    }
    if (!getOperationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, operationName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.examples.graphql.GraphQlRequest)) {
      return super.equals(obj);
    }
    io.grpc.examples.graphql.GraphQlRequest other = (io.grpc.examples.graphql.GraphQlRequest) obj;

    boolean result = true;
    result = result && getQuery()
        .equals(other.getQuery());
    result = result && (hasVariables() == other.hasVariables());
    if (hasVariables()) {
      result = result && getVariables()
          .equals(other.getVariables());
    }
    result = result && getOperationName()
        .equals(other.getOperationName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    if (hasVariables()) {
      hash = (37 * hash) + VARIABLES_FIELD_NUMBER;
      hash = (53 * hash) + getVariables().hashCode();
    }
    hash = (37 * hash) + OPERATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getOperationName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.graphql.GraphQlRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.graphql.GraphQlRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GraphQlRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GraphQlRequest)
      io.grpc.examples.graphql.GraphQlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.graphql.GraphQlProto.internal_static_GraphQlRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.graphql.GraphQlProto.internal_static_GraphQlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.graphql.GraphQlRequest.class, io.grpc.examples.graphql.GraphQlRequest.Builder.class);
    }

    // Construct using io.grpc.examples.graphql.GraphQlRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      query_ = "";

      if (variablesBuilder_ == null) {
        variables_ = null;
      } else {
        variables_ = null;
        variablesBuilder_ = null;
      }
      operationName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.graphql.GraphQlProto.internal_static_GraphQlRequest_descriptor;
    }

    public io.grpc.examples.graphql.GraphQlRequest getDefaultInstanceForType() {
      return io.grpc.examples.graphql.GraphQlRequest.getDefaultInstance();
    }

    public io.grpc.examples.graphql.GraphQlRequest build() {
      io.grpc.examples.graphql.GraphQlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.graphql.GraphQlRequest buildPartial() {
      io.grpc.examples.graphql.GraphQlRequest result = new io.grpc.examples.graphql.GraphQlRequest(this);
      result.query_ = query_;
      if (variablesBuilder_ == null) {
        result.variables_ = variables_;
      } else {
        result.variables_ = variablesBuilder_.build();
      }
      result.operationName_ = operationName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.graphql.GraphQlRequest) {
        return mergeFrom((io.grpc.examples.graphql.GraphQlRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.graphql.GraphQlRequest other) {
      if (other == io.grpc.examples.graphql.GraphQlRequest.getDefaultInstance()) return this;
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (other.hasVariables()) {
        mergeVariables(other.getVariables());
      }
      if (!other.getOperationName().isEmpty()) {
        operationName_ = other.operationName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.graphql.GraphQlRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.graphql.GraphQlRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <code>string query = 1;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string query = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string query = 1;</code>
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string query = 1;</code>
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <code>string query = 1;</code>
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct variables_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> variablesBuilder_;
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public boolean hasVariables() {
      return variablesBuilder_ != null || variables_ != null;
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public com.google.protobuf.Struct getVariables() {
      if (variablesBuilder_ == null) {
        return variables_ == null ? com.google.protobuf.Struct.getDefaultInstance() : variables_;
      } else {
        return variablesBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public Builder setVariables(com.google.protobuf.Struct value) {
      if (variablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        variables_ = value;
        onChanged();
      } else {
        variablesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public Builder setVariables(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (variablesBuilder_ == null) {
        variables_ = builderForValue.build();
        onChanged();
      } else {
        variablesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public Builder mergeVariables(com.google.protobuf.Struct value) {
      if (variablesBuilder_ == null) {
        if (variables_ != null) {
          variables_ =
            com.google.protobuf.Struct.newBuilder(variables_).mergeFrom(value).buildPartial();
        } else {
          variables_ = value;
        }
        onChanged();
      } else {
        variablesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public Builder clearVariables() {
      if (variablesBuilder_ == null) {
        variables_ = null;
        onChanged();
      } else {
        variables_ = null;
        variablesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getVariablesBuilder() {
      
      onChanged();
      return getVariablesFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getVariablesOrBuilder() {
      if (variablesBuilder_ != null) {
        return variablesBuilder_.getMessageOrBuilder();
      } else {
        return variables_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : variables_;
      }
    }
    /**
     * <code>.google.protobuf.Struct variables = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getVariablesFieldBuilder() {
      if (variablesBuilder_ == null) {
        variablesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getVariables(),
                getParentForChildren(),
                isClean());
        variables_ = null;
      }
      return variablesBuilder_;
    }

    private java.lang.Object operationName_ = "";
    /**
     * <code>string operationName = 3;</code>
     */
    public java.lang.String getOperationName() {
      java.lang.Object ref = operationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operationName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOperationNameBytes() {
      java.lang.Object ref = operationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operationName = 3;</code>
     */
    public Builder setOperationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operationName = 3;</code>
     */
    public Builder clearOperationName() {
      
      operationName_ = getDefaultInstance().getOperationName();
      onChanged();
      return this;
    }
    /**
     * <code>string operationName = 3;</code>
     */
    public Builder setOperationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GraphQlRequest)
  }

  // @@protoc_insertion_point(class_scope:GraphQlRequest)
  private static final io.grpc.examples.graphql.GraphQlRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.graphql.GraphQlRequest();
  }

  public static io.grpc.examples.graphql.GraphQlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphQlRequest>
      PARSER = new com.google.protobuf.AbstractParser<GraphQlRequest>() {
    public GraphQlRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GraphQlRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphQlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphQlRequest> getParserForType() {
    return PARSER;
  }

  public io.grpc.examples.graphql.GraphQlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
