// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.javaman.grpc.route;

/**
 * <pre>
 * A RouteNote is a message sent while at a given point.
 * </pre>
 *
 * Protobuf type {@code routeguide.RouteNote}
 */
public  final class RouteNote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.RouteNote)
    RouteNoteOrBuilder {
  // Use RouteNote.newBuilder() to construct.
  private RouteNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteNote() {
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RouteNote(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.javaman.grpc.route.Point.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.javaman.grpc.route.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.javaman.grpc.route.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.javaman.grpc.route.RouteGuideProto.internal_static_routeguide_RouteNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.javaman.grpc.route.RouteNote.class, com.javaman.grpc.route.RouteNote.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.javaman.grpc.route.Point location_;
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  public com.javaman.grpc.route.Point getLocation() {
    return location_ == null ? com.javaman.grpc.route.Point.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  public com.javaman.grpc.route.PointOrBuilder getLocationOrBuilder() {
    return getLocation();
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (location_ != null) {
      output.writeMessage(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.javaman.grpc.route.RouteNote)) {
      return super.equals(obj);
    }
    com.javaman.grpc.route.RouteNote other = (com.javaman.grpc.route.RouteNote) obj;

    boolean result = true;
    result = result && (hasLocation() == other.hasLocation());
    if (hasLocation()) {
      result = result && getLocation()
          .equals(other.getLocation());
    }
    result = result && getMessage()
        .equals(other.getMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.javaman.grpc.route.RouteNote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.javaman.grpc.route.RouteNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.javaman.grpc.route.RouteNote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.javaman.grpc.route.RouteNote parseFrom(
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
  public static Builder newBuilder(com.javaman.grpc.route.RouteNote prototype) {
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
   * <pre>
   * A RouteNote is a message sent while at a given point.
   * </pre>
   *
   * Protobuf type {@code routeguide.RouteNote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.RouteNote)
      com.javaman.grpc.route.RouteNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.javaman.grpc.route.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.javaman.grpc.route.RouteGuideProto.internal_static_routeguide_RouteNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.javaman.grpc.route.RouteNote.class, com.javaman.grpc.route.RouteNote.Builder.class);
    }

    // Construct using com.javaman.grpc.route.RouteNote.newBuilder()
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
      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.javaman.grpc.route.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
    }

    public com.javaman.grpc.route.RouteNote getDefaultInstanceForType() {
      return com.javaman.grpc.route.RouteNote.getDefaultInstance();
    }

    public com.javaman.grpc.route.RouteNote build() {
      com.javaman.grpc.route.RouteNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.javaman.grpc.route.RouteNote buildPartial() {
      com.javaman.grpc.route.RouteNote result = new com.javaman.grpc.route.RouteNote(this);
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.message_ = message_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.javaman.grpc.route.RouteNote) {
        return mergeFrom((com.javaman.grpc.route.RouteNote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.javaman.grpc.route.RouteNote other) {
      if (other == com.javaman.grpc.route.RouteNote.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
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
      com.javaman.grpc.route.RouteNote parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.javaman.grpc.route.RouteNote) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.javaman.grpc.route.Point location_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.javaman.grpc.route.Point, com.javaman.grpc.route.Point.Builder, com.javaman.grpc.route.PointOrBuilder> locationBuilder_;
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public com.javaman.grpc.route.Point getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.javaman.grpc.route.Point.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public Builder setLocation(com.javaman.grpc.route.Point value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public Builder setLocation(
        com.javaman.grpc.route.Point.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public Builder mergeLocation(com.javaman.grpc.route.Point value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.javaman.grpc.route.Point.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public com.javaman.grpc.route.Point.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    public com.javaman.grpc.route.PointOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.javaman.grpc.route.Point.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>.routeguide.Point location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.javaman.grpc.route.Point, com.javaman.grpc.route.Point.Builder, com.javaman.grpc.route.PointOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.javaman.grpc.route.Point, com.javaman.grpc.route.Point.Builder, com.javaman.grpc.route.PointOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:routeguide.RouteNote)
  }

  // @@protoc_insertion_point(class_scope:routeguide.RouteNote)
  private static final com.javaman.grpc.route.RouteNote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.javaman.grpc.route.RouteNote();
  }

  public static com.javaman.grpc.route.RouteNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteNote>
      PARSER = new com.google.protobuf.AbstractParser<RouteNote>() {
    public RouteNote parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RouteNote(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteNote> getParserForType() {
    return PARSER;
  }

  public com.javaman.grpc.route.RouteNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

