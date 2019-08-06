// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library/book_service.proto

package com.google.example.library.book.v1;

/**
 * Protobuf type {@code google.example.library.book.v1.CreateBookRequest}
 */
public  final class CreateBookRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.example.library.book.v1.CreateBookRequest)
    CreateBookRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBookRequest.newBuilder() to construct.
  private CreateBookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBookRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateBookRequest(
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
          case 18: {
            com.google.example.library.book.v1.Book.Builder subBuilder = null;
            if (book_ != null) {
              subBuilder = book_.toBuilder();
            }
            book_ = input.readMessage(com.google.example.library.book.v1.Book.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(book_);
              book_ = subBuilder.buildPartial();
            }

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
    return com.google.example.library.book.v1.BookServiceProto.internal_static_google_example_library_book_v1_CreateBookRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.example.library.book.v1.BookServiceProto.internal_static_google_example_library_book_v1_CreateBookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.example.library.book.v1.CreateBookRequest.class, com.google.example.library.book.v1.CreateBookRequest.Builder.class);
  }

  public static final int BOOK_FIELD_NUMBER = 2;
  private com.google.example.library.book.v1.Book book_;
  /**
   * <pre>
   * The book to create.
   * </pre>
   *
   * <code>.google.example.library.book.v1.Book book = 2;</code>
   */
  public boolean hasBook() {
    return book_ != null;
  }
  /**
   * <pre>
   * The book to create.
   * </pre>
   *
   * <code>.google.example.library.book.v1.Book book = 2;</code>
   */
  public com.google.example.library.book.v1.Book getBook() {
    return book_ == null ? com.google.example.library.book.v1.Book.getDefaultInstance() : book_;
  }
  /**
   * <pre>
   * The book to create.
   * </pre>
   *
   * <code>.google.example.library.book.v1.Book book = 2;</code>
   */
  public com.google.example.library.book.v1.BookOrBuilder getBookOrBuilder() {
    return getBook();
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
    if (book_ != null) {
      output.writeMessage(2, getBook());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (book_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBook());
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
    if (!(obj instanceof com.google.example.library.book.v1.CreateBookRequest)) {
      return super.equals(obj);
    }
    com.google.example.library.book.v1.CreateBookRequest other = (com.google.example.library.book.v1.CreateBookRequest) obj;

    boolean result = true;
    result = result && (hasBook() == other.hasBook());
    if (hasBook()) {
      result = result && getBook()
          .equals(other.getBook());
    }
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
    if (hasBook()) {
      hash = (37 * hash) + BOOK_FIELD_NUMBER;
      hash = (53 * hash) + getBook().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.book.v1.CreateBookRequest parseFrom(
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
  public static Builder newBuilder(com.google.example.library.book.v1.CreateBookRequest prototype) {
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
   * Protobuf type {@code google.example.library.book.v1.CreateBookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.example.library.book.v1.CreateBookRequest)
      com.google.example.library.book.v1.CreateBookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.example.library.book.v1.BookServiceProto.internal_static_google_example_library_book_v1_CreateBookRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.example.library.book.v1.BookServiceProto.internal_static_google_example_library_book_v1_CreateBookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.example.library.book.v1.CreateBookRequest.class, com.google.example.library.book.v1.CreateBookRequest.Builder.class);
    }

    // Construct using com.google.example.library.book.v1.CreateBookRequest.newBuilder()
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
      if (bookBuilder_ == null) {
        book_ = null;
      } else {
        book_ = null;
        bookBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.example.library.book.v1.BookServiceProto.internal_static_google_example_library_book_v1_CreateBookRequest_descriptor;
    }

    public com.google.example.library.book.v1.CreateBookRequest getDefaultInstanceForType() {
      return com.google.example.library.book.v1.CreateBookRequest.getDefaultInstance();
    }

    public com.google.example.library.book.v1.CreateBookRequest build() {
      com.google.example.library.book.v1.CreateBookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.example.library.book.v1.CreateBookRequest buildPartial() {
      com.google.example.library.book.v1.CreateBookRequest result = new com.google.example.library.book.v1.CreateBookRequest(this);
      if (bookBuilder_ == null) {
        result.book_ = book_;
      } else {
        result.book_ = bookBuilder_.build();
      }
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
      if (other instanceof com.google.example.library.book.v1.CreateBookRequest) {
        return mergeFrom((com.google.example.library.book.v1.CreateBookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.example.library.book.v1.CreateBookRequest other) {
      if (other == com.google.example.library.book.v1.CreateBookRequest.getDefaultInstance()) return this;
      if (other.hasBook()) {
        mergeBook(other.getBook());
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
      com.google.example.library.book.v1.CreateBookRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.example.library.book.v1.CreateBookRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.example.library.book.v1.Book book_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.example.library.book.v1.Book, com.google.example.library.book.v1.Book.Builder, com.google.example.library.book.v1.BookOrBuilder> bookBuilder_;
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public boolean hasBook() {
      return bookBuilder_ != null || book_ != null;
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public com.google.example.library.book.v1.Book getBook() {
      if (bookBuilder_ == null) {
        return book_ == null ? com.google.example.library.book.v1.Book.getDefaultInstance() : book_;
      } else {
        return bookBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public Builder setBook(com.google.example.library.book.v1.Book value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        book_ = value;
        onChanged();
      } else {
        bookBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public Builder setBook(
        com.google.example.library.book.v1.Book.Builder builderForValue) {
      if (bookBuilder_ == null) {
        book_ = builderForValue.build();
        onChanged();
      } else {
        bookBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public Builder mergeBook(com.google.example.library.book.v1.Book value) {
      if (bookBuilder_ == null) {
        if (book_ != null) {
          book_ =
            com.google.example.library.book.v1.Book.newBuilder(book_).mergeFrom(value).buildPartial();
        } else {
          book_ = value;
        }
        onChanged();
      } else {
        bookBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public Builder clearBook() {
      if (bookBuilder_ == null) {
        book_ = null;
        onChanged();
      } else {
        book_ = null;
        bookBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public com.google.example.library.book.v1.Book.Builder getBookBuilder() {
      
      onChanged();
      return getBookFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    public com.google.example.library.book.v1.BookOrBuilder getBookOrBuilder() {
      if (bookBuilder_ != null) {
        return bookBuilder_.getMessageOrBuilder();
      } else {
        return book_ == null ?
            com.google.example.library.book.v1.Book.getDefaultInstance() : book_;
      }
    }
    /**
     * <pre>
     * The book to create.
     * </pre>
     *
     * <code>.google.example.library.book.v1.Book book = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.example.library.book.v1.Book, com.google.example.library.book.v1.Book.Builder, com.google.example.library.book.v1.BookOrBuilder> 
        getBookFieldBuilder() {
      if (bookBuilder_ == null) {
        bookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.example.library.book.v1.Book, com.google.example.library.book.v1.Book.Builder, com.google.example.library.book.v1.BookOrBuilder>(
                getBook(),
                getParentForChildren(),
                isClean());
        book_ = null;
      }
      return bookBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.example.library.book.v1.CreateBookRequest)
  }

  // @@protoc_insertion_point(class_scope:google.example.library.book.v1.CreateBookRequest)
  private static final com.google.example.library.book.v1.CreateBookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.example.library.book.v1.CreateBookRequest();
  }

  public static com.google.example.library.book.v1.CreateBookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBookRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBookRequest>() {
    public CreateBookRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateBookRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateBookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBookRequest> getParserForType() {
    return PARSER;
  }

  public com.google.example.library.book.v1.CreateBookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
