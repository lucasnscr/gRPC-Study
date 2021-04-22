// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

/**
 * Protobuf type {@code blog.CreateBlogResponse}
 */
public  final class CreateBlogResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:blog.CreateBlogResponse)
    CreateBlogResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBlogResponse.newBuilder() to construct.
  private CreateBlogResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBlogResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateBlogResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.proto.blog.Blog.Builder subBuilder = null;
            if (blog_ != null) {
              subBuilder = blog_.toBuilder();
            }
            blog_ = input.readMessage(com.proto.blog.Blog.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blog_);
              blog_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.proto.blog.BlogOuterClass.internal_static_blog_CreateBlogResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.blog.BlogOuterClass.internal_static_blog_CreateBlogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.blog.CreateBlogResponse.class, com.proto.blog.CreateBlogResponse.Builder.class);
  }

  public static final int BLOG_FIELD_NUMBER = 1;
  private com.proto.blog.Blog blog_;
  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  public boolean hasBlog() {
    return blog_ != null;
  }
  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  public com.proto.blog.Blog getBlog() {
    return blog_ == null ? com.proto.blog.Blog.getDefaultInstance() : blog_;
  }
  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  public com.proto.blog.BlogOrBuilder getBlogOrBuilder() {
    return getBlog();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (blog_ != null) {
      output.writeMessage(1, getBlog());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlog());
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
    if (!(obj instanceof com.proto.blog.CreateBlogResponse)) {
      return super.equals(obj);
    }
    com.proto.blog.CreateBlogResponse other = (com.proto.blog.CreateBlogResponse) obj;

    boolean result = true;
    result = result && (hasBlog() == other.hasBlog());
    if (hasBlog()) {
      result = result && getBlog()
          .equals(other.getBlog());
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
    if (hasBlog()) {
      hash = (37 * hash) + BLOG_FIELD_NUMBER;
      hash = (53 * hash) + getBlog().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.blog.CreateBlogResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.blog.CreateBlogResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.blog.CreateBlogResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.blog.CreateBlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.blog.CreateBlogResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code blog.CreateBlogResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:blog.CreateBlogResponse)
      com.proto.blog.CreateBlogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.blog.BlogOuterClass.internal_static_blog_CreateBlogResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.blog.BlogOuterClass.internal_static_blog_CreateBlogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.blog.CreateBlogResponse.class, com.proto.blog.CreateBlogResponse.Builder.class);
    }

    // Construct using com.proto.blog.CreateBlogResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (blogBuilder_ == null) {
        blog_ = null;
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.blog.BlogOuterClass.internal_static_blog_CreateBlogResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.blog.CreateBlogResponse getDefaultInstanceForType() {
      return com.proto.blog.CreateBlogResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.blog.CreateBlogResponse build() {
      com.proto.blog.CreateBlogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.blog.CreateBlogResponse buildPartial() {
      com.proto.blog.CreateBlogResponse result = new com.proto.blog.CreateBlogResponse(this);
      if (blogBuilder_ == null) {
        result.blog_ = blog_;
      } else {
        result.blog_ = blogBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.blog.CreateBlogResponse) {
        return mergeFrom((com.proto.blog.CreateBlogResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.blog.CreateBlogResponse other) {
      if (other == com.proto.blog.CreateBlogResponse.getDefaultInstance()) return this;
      if (other.hasBlog()) {
        mergeBlog(other.getBlog());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.blog.CreateBlogResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.blog.CreateBlogResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.blog.Blog blog_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.blog.Blog, com.proto.blog.Blog.Builder, com.proto.blog.BlogOrBuilder> blogBuilder_;
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public boolean hasBlog() {
      return blogBuilder_ != null || blog_ != null;
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public com.proto.blog.Blog getBlog() {
      if (blogBuilder_ == null) {
        return blog_ == null ? com.proto.blog.Blog.getDefaultInstance() : blog_;
      } else {
        return blogBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder setBlog(com.proto.blog.Blog value) {
      if (blogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blog_ = value;
        onChanged();
      } else {
        blogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder setBlog(
        com.proto.blog.Blog.Builder builderForValue) {
      if (blogBuilder_ == null) {
        blog_ = builderForValue.build();
        onChanged();
      } else {
        blogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder mergeBlog(com.proto.blog.Blog value) {
      if (blogBuilder_ == null) {
        if (blog_ != null) {
          blog_ =
            com.proto.blog.Blog.newBuilder(blog_).mergeFrom(value).buildPartial();
        } else {
          blog_ = value;
        }
        onChanged();
      } else {
        blogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder clearBlog() {
      if (blogBuilder_ == null) {
        blog_ = null;
        onChanged();
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public com.proto.blog.Blog.Builder getBlogBuilder() {
      
      onChanged();
      return getBlogFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    public com.proto.blog.BlogOrBuilder getBlogOrBuilder() {
      if (blogBuilder_ != null) {
        return blogBuilder_.getMessageOrBuilder();
      } else {
        return blog_ == null ?
            com.proto.blog.Blog.getDefaultInstance() : blog_;
      }
    }
    /**
     * <pre>
     * Will return the id of Blog created in mongoDB
     * </pre>
     *
     * <code>.blog.Blog blog = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.blog.Blog, com.proto.blog.Blog.Builder, com.proto.blog.BlogOrBuilder> 
        getBlogFieldBuilder() {
      if (blogBuilder_ == null) {
        blogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.blog.Blog, com.proto.blog.Blog.Builder, com.proto.blog.BlogOrBuilder>(
                getBlog(),
                getParentForChildren(),
                isClean());
        blog_ = null;
      }
      return blogBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:blog.CreateBlogResponse)
  }

  // @@protoc_insertion_point(class_scope:blog.CreateBlogResponse)
  private static final com.proto.blog.CreateBlogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.blog.CreateBlogResponse();
  }

  public static com.proto.blog.CreateBlogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBlogResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateBlogResponse>() {
    @java.lang.Override
    public CreateBlogResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateBlogResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateBlogResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBlogResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.blog.CreateBlogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

