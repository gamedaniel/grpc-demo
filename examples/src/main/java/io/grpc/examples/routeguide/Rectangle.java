// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

/**
 * <pre>
 * A latitude-longitude rectangle, represented as two diagonally opposite
 * points "lo" and "hi".
 * </pre>
 *
 * Protobuf type {@code routeguide.Rectangle}
 */
public final class Rectangle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.Rectangle)
    RectangleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rectangle.newBuilder() to construct.
  private Rectangle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rectangle() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rectangle();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Rectangle.class, Builder.class);
  }

  public static final int LO_FIELD_NUMBER = 1;
  private Point lo_;
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   * @return Whether the lo field is set.
   */
  @Override
  public boolean hasLo() {
    return lo_ != null;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   * @return The lo.
   */
  @Override
  public Point getLo() {
    return lo_ == null ? Point.getDefaultInstance() : lo_;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  @Override
  public PointOrBuilder getLoOrBuilder() {
    return lo_ == null ? Point.getDefaultInstance() : lo_;
  }

  public static final int HI_FIELD_NUMBER = 2;
  private Point hi_;
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   * @return Whether the hi field is set.
   */
  @Override
  public boolean hasHi() {
    return hi_ != null;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   * @return The hi.
   */
  @Override
  public Point getHi() {
    return hi_ == null ? Point.getDefaultInstance() : hi_;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  @Override
  public PointOrBuilder getHiOrBuilder() {
    return hi_ == null ? Point.getDefaultInstance() : hi_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (lo_ != null) {
      output.writeMessage(1, getLo());
    }
    if (hi_ != null) {
      output.writeMessage(2, getHi());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLo());
    }
    if (hi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHi());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Rectangle)) {
      return super.equals(obj);
    }
    Rectangle other = (Rectangle) obj;

    if (hasLo() != other.hasLo()) return false;
    if (hasLo()) {
      if (!getLo()
          .equals(other.getLo())) return false;
    }
    if (hasHi() != other.hasHi()) return false;
    if (hasHi()) {
      if (!getHi()
          .equals(other.getHi())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLo()) {
      hash = (37 * hash) + LO_FIELD_NUMBER;
      hash = (53 * hash) + getLo().hashCode();
    }
    if (hasHi()) {
      hash = (37 * hash) + HI_FIELD_NUMBER;
      hash = (53 * hash) + getHi().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Rectangle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rectangle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rectangle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rectangle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rectangle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rectangle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rectangle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Rectangle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Rectangle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Rectangle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Rectangle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A latitude-longitude rectangle, represented as two diagonally opposite
   * points "lo" and "hi".
   * </pre>
   *
   * Protobuf type {@code routeguide.Rectangle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Rectangle)
      RectangleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Rectangle.class, Builder.class);
    }

    // Construct using io.grpc.examples.routeguide.Rectangle.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      lo_ = null;
      if (loBuilder_ != null) {
        loBuilder_.dispose();
        loBuilder_ = null;
      }
      hi_ = null;
      if (hiBuilder_ != null) {
        hiBuilder_.dispose();
        hiBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    @Override
    public Rectangle getDefaultInstanceForType() {
      return Rectangle.getDefaultInstance();
    }

    @Override
    public Rectangle build() {
      Rectangle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Rectangle buildPartial() {
      Rectangle result = new Rectangle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Rectangle result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lo_ = loBuilder_ == null
            ? lo_
            : loBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hi_ = hiBuilder_ == null
            ? hi_
            : hiBuilder_.build();
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Rectangle) {
        return mergeFrom((Rectangle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Rectangle other) {
      if (other == Rectangle.getDefaultInstance()) return this;
      if (other.hasLo()) {
        mergeLo(other.getLo());
      }
      if (other.hasHi()) {
        mergeHi(other.getHi());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getLoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getHiFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Point lo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Point, Point.Builder, PointOrBuilder> loBuilder_;
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     * @return Whether the lo field is set.
     */
    public boolean hasLo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     * @return The lo.
     */
    public Point getLo() {
      if (loBuilder_ == null) {
        return lo_ == null ? Point.getDefaultInstance() : lo_;
      } else {
        return loBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(Point value) {
      if (loBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lo_ = value;
      } else {
        loBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(
        Point.Builder builderForValue) {
      if (loBuilder_ == null) {
        lo_ = builderForValue.build();
      } else {
        loBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder mergeLo(Point value) {
      if (loBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          lo_ != null &&
          lo_ != Point.getDefaultInstance()) {
          getLoBuilder().mergeFrom(value);
        } else {
          lo_ = value;
        }
      } else {
        loBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder clearLo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lo_ = null;
      if (loBuilder_ != null) {
        loBuilder_.dispose();
        loBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Point.Builder getLoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public PointOrBuilder getLoOrBuilder() {
      if (loBuilder_ != null) {
        return loBuilder_.getMessageOrBuilder();
      } else {
        return lo_ == null ?
            Point.getDefaultInstance() : lo_;
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Point, Point.Builder, PointOrBuilder>
        getLoFieldBuilder() {
      if (loBuilder_ == null) {
        loBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Point, Point.Builder, PointOrBuilder>(
                getLo(),
                getParentForChildren(),
                isClean());
        lo_ = null;
      }
      return loBuilder_;
    }

    private Point hi_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Point, Point.Builder, PointOrBuilder> hiBuilder_;
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     * @return Whether the hi field is set.
     */
    public boolean hasHi() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     * @return The hi.
     */
    public Point getHi() {
      if (hiBuilder_ == null) {
        return hi_ == null ? Point.getDefaultInstance() : hi_;
      } else {
        return hiBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(Point value) {
      if (hiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hi_ = value;
      } else {
        hiBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(
        Point.Builder builderForValue) {
      if (hiBuilder_ == null) {
        hi_ = builderForValue.build();
      } else {
        hiBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder mergeHi(Point value) {
      if (hiBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          hi_ != null &&
          hi_ != Point.getDefaultInstance()) {
          getHiBuilder().mergeFrom(value);
        } else {
          hi_ = value;
        }
      } else {
        hiBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder clearHi() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hi_ = null;
      if (hiBuilder_ != null) {
        hiBuilder_.dispose();
        hiBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Point.Builder getHiBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHiFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public PointOrBuilder getHiOrBuilder() {
      if (hiBuilder_ != null) {
        return hiBuilder_.getMessageOrBuilder();
      } else {
        return hi_ == null ?
            Point.getDefaultInstance() : hi_;
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Point, Point.Builder, PointOrBuilder>
        getHiFieldBuilder() {
      if (hiBuilder_ == null) {
        hiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Point, Point.Builder, PointOrBuilder>(
                getHi(),
                getParentForChildren(),
                isClean());
        hi_ = null;
      }
      return hiBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:routeguide.Rectangle)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Rectangle)
  private static final Rectangle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Rectangle();
  }

  public static Rectangle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rectangle>
      PARSER = new com.google.protobuf.AbstractParser<Rectangle>() {
    @Override
    public Rectangle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Rectangle> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Rectangle> getParserForType() {
    return PARSER;
  }

  @Override
  public Rectangle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

