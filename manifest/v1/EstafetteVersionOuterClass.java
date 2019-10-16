// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manifest.v1/estafette_version.proto

package manifest.v1;

public final class EstafetteVersionOuterClass {
  private EstafetteVersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafetteVersionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafetteVersion)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    boolean hasSemver();
    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion getSemver();
    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder getSemverOrBuilder();

    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    boolean hasCustom();
    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion getCustom();
    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder getCustomOrBuilder();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafetteVersion}
   */
  public  static final class EstafetteVersion extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafetteVersion)
      EstafetteVersionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafetteVersion.newBuilder() to construct.
    private EstafetteVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafetteVersion() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafetteVersion(
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
              manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder subBuilder = null;
              if (semver_ != null) {
                subBuilder = semver_.toBuilder();
              }
              semver_ = input.readMessage(manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(semver_);
                semver_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder subBuilder = null;
              if (custom_ != null) {
                subBuilder = custom_.toBuilder();
              }
              custom_ = input.readMessage(manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(custom_);
                custom_ = subBuilder.buildPartial();
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
      return manifest.v1.EstafetteVersionOuterClass.internal_static_manifest_v1_EstafetteVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return manifest.v1.EstafetteVersionOuterClass.internal_static_manifest_v1_EstafetteVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.class, manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.Builder.class);
    }

    public static final int SEMVER_FIELD_NUMBER = 1;
    private manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion semver_;
    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    public boolean hasSemver() {
      return semver_ != null;
    }
    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    public manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion getSemver() {
      return semver_ == null ? manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.getDefaultInstance() : semver_;
    }
    /**
     * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
     */
    public manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder getSemverOrBuilder() {
      return getSemver();
    }

    public static final int CUSTOM_FIELD_NUMBER = 2;
    private manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion custom_;
    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    public boolean hasCustom() {
      return custom_ != null;
    }
    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    public manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion getCustom() {
      return custom_ == null ? manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.getDefaultInstance() : custom_;
    }
    /**
     * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
     */
    public manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder getCustomOrBuilder() {
      return getCustom();
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
      if (semver_ != null) {
        output.writeMessage(1, getSemver());
      }
      if (custom_ != null) {
        output.writeMessage(2, getCustom());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (semver_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSemver());
      }
      if (custom_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCustom());
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
      if (!(obj instanceof manifest.v1.EstafetteVersionOuterClass.EstafetteVersion)) {
        return super.equals(obj);
      }
      manifest.v1.EstafetteVersionOuterClass.EstafetteVersion other = (manifest.v1.EstafetteVersionOuterClass.EstafetteVersion) obj;

      boolean result = true;
      result = result && (hasSemver() == other.hasSemver());
      if (hasSemver()) {
        result = result && getSemver()
            .equals(other.getSemver());
      }
      result = result && (hasCustom() == other.hasCustom());
      if (hasCustom()) {
        result = result && getCustom()
            .equals(other.getCustom());
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
      if (hasSemver()) {
        hash = (37 * hash) + SEMVER_FIELD_NUMBER;
        hash = (53 * hash) + getSemver().hashCode();
      }
      if (hasCustom()) {
        hash = (37 * hash) + CUSTOM_FIELD_NUMBER;
        hash = (53 * hash) + getCustom().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parseFrom(
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
    public static Builder newBuilder(manifest.v1.EstafetteVersionOuterClass.EstafetteVersion prototype) {
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
     * Protobuf type {@code manifest.v1.EstafetteVersion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafetteVersion)
        manifest.v1.EstafetteVersionOuterClass.EstafetteVersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return manifest.v1.EstafetteVersionOuterClass.internal_static_manifest_v1_EstafetteVersion_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return manifest.v1.EstafetteVersionOuterClass.internal_static_manifest_v1_EstafetteVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.class, manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.Builder.class);
      }

      // Construct using manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.newBuilder()
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
        if (semverBuilder_ == null) {
          semver_ = null;
        } else {
          semver_ = null;
          semverBuilder_ = null;
        }
        if (customBuilder_ == null) {
          custom_ = null;
        } else {
          custom_ = null;
          customBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return manifest.v1.EstafetteVersionOuterClass.internal_static_manifest_v1_EstafetteVersion_descriptor;
      }

      @java.lang.Override
      public manifest.v1.EstafetteVersionOuterClass.EstafetteVersion getDefaultInstanceForType() {
        return manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.getDefaultInstance();
      }

      @java.lang.Override
      public manifest.v1.EstafetteVersionOuterClass.EstafetteVersion build() {
        manifest.v1.EstafetteVersionOuterClass.EstafetteVersion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public manifest.v1.EstafetteVersionOuterClass.EstafetteVersion buildPartial() {
        manifest.v1.EstafetteVersionOuterClass.EstafetteVersion result = new manifest.v1.EstafetteVersionOuterClass.EstafetteVersion(this);
        if (semverBuilder_ == null) {
          result.semver_ = semver_;
        } else {
          result.semver_ = semverBuilder_.build();
        }
        if (customBuilder_ == null) {
          result.custom_ = custom_;
        } else {
          result.custom_ = customBuilder_.build();
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
        if (other instanceof manifest.v1.EstafetteVersionOuterClass.EstafetteVersion) {
          return mergeFrom((manifest.v1.EstafetteVersionOuterClass.EstafetteVersion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(manifest.v1.EstafetteVersionOuterClass.EstafetteVersion other) {
        if (other == manifest.v1.EstafetteVersionOuterClass.EstafetteVersion.getDefaultInstance()) return this;
        if (other.hasSemver()) {
          mergeSemver(other.getSemver());
        }
        if (other.hasCustom()) {
          mergeCustom(other.getCustom());
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
        manifest.v1.EstafetteVersionOuterClass.EstafetteVersion parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (manifest.v1.EstafetteVersionOuterClass.EstafetteVersion) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion semver_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder> semverBuilder_;
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public boolean hasSemver() {
        return semverBuilder_ != null || semver_ != null;
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion getSemver() {
        if (semverBuilder_ == null) {
          return semver_ == null ? manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.getDefaultInstance() : semver_;
        } else {
          return semverBuilder_.getMessage();
        }
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public Builder setSemver(manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion value) {
        if (semverBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          semver_ = value;
          onChanged();
        } else {
          semverBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public Builder setSemver(
          manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder builderForValue) {
        if (semverBuilder_ == null) {
          semver_ = builderForValue.build();
          onChanged();
        } else {
          semverBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public Builder mergeSemver(manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion value) {
        if (semverBuilder_ == null) {
          if (semver_ != null) {
            semver_ =
              manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.newBuilder(semver_).mergeFrom(value).buildPartial();
          } else {
            semver_ = value;
          }
          onChanged();
        } else {
          semverBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public Builder clearSemver() {
        if (semverBuilder_ == null) {
          semver_ = null;
          onChanged();
        } else {
          semver_ = null;
          semverBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder getSemverBuilder() {
        
        onChanged();
        return getSemverFieldBuilder().getBuilder();
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      public manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder getSemverOrBuilder() {
        if (semverBuilder_ != null) {
          return semverBuilder_.getMessageOrBuilder();
        } else {
          return semver_ == null ?
              manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.getDefaultInstance() : semver_;
        }
      }
      /**
       * <code>.manifest.v1.EstafetteSemverVersion semver = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder> 
          getSemverFieldBuilder() {
        if (semverBuilder_ == null) {
          semverBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersion.Builder, manifest.v1.EstafetteSemverVersionOuterClass.EstafetteSemverVersionOrBuilder>(
                  getSemver(),
                  getParentForChildren(),
                  isClean());
          semver_ = null;
        }
        return semverBuilder_;
      }

      private manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion custom_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder> customBuilder_;
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public boolean hasCustom() {
        return customBuilder_ != null || custom_ != null;
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion getCustom() {
        if (customBuilder_ == null) {
          return custom_ == null ? manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.getDefaultInstance() : custom_;
        } else {
          return customBuilder_.getMessage();
        }
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public Builder setCustom(manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion value) {
        if (customBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          custom_ = value;
          onChanged();
        } else {
          customBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public Builder setCustom(
          manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder builderForValue) {
        if (customBuilder_ == null) {
          custom_ = builderForValue.build();
          onChanged();
        } else {
          customBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public Builder mergeCustom(manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion value) {
        if (customBuilder_ == null) {
          if (custom_ != null) {
            custom_ =
              manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.newBuilder(custom_).mergeFrom(value).buildPartial();
          } else {
            custom_ = value;
          }
          onChanged();
        } else {
          customBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public Builder clearCustom() {
        if (customBuilder_ == null) {
          custom_ = null;
          onChanged();
        } else {
          custom_ = null;
          customBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder getCustomBuilder() {
        
        onChanged();
        return getCustomFieldBuilder().getBuilder();
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      public manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder getCustomOrBuilder() {
        if (customBuilder_ != null) {
          return customBuilder_.getMessageOrBuilder();
        } else {
          return custom_ == null ?
              manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.getDefaultInstance() : custom_;
        }
      }
      /**
       * <code>.manifest.v1.EstafetteCustomVersion custom = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder> 
          getCustomFieldBuilder() {
        if (customBuilder_ == null) {
          customBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersion.Builder, manifest.v1.EstafetteCustomVersionOuterClass.EstafetteCustomVersionOrBuilder>(
                  getCustom(),
                  getParentForChildren(),
                  isClean());
          custom_ = null;
        }
        return customBuilder_;
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafetteVersion)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafetteVersion)
    private static final manifest.v1.EstafetteVersionOuterClass.EstafetteVersion DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new manifest.v1.EstafetteVersionOuterClass.EstafetteVersion();
    }

    public static manifest.v1.EstafetteVersionOuterClass.EstafetteVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafetteVersion>
        PARSER = new com.google.protobuf.AbstractParser<EstafetteVersion>() {
      @java.lang.Override
      public EstafetteVersion parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafetteVersion(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafetteVersion> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafetteVersion> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public manifest.v1.EstafetteVersionOuterClass.EstafetteVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafetteVersion_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafetteVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#manifest.v1/estafette_version.proto\022\013m" +
      "anifest.v1\032*manifest.v1/estafette_semver" +
      "_version.proto\032*manifest.v1/estafette_cu" +
      "stom_version.proto\"|\n\020EstafetteVersion\0223" +
      "\n\006semver\030\001 \001(\0132#.manifest.v1.EstafetteSe" +
      "mverVersion\0223\n\006custom\030\002 \001(\0132#.manifest.v" +
      "1.EstafetteCustomVersionB@Z>github.com/e" +
      "stafette/estafette-ci-contracts-golang/m" +
      "anifest_v1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          manifest.v1.EstafetteSemverVersionOuterClass.getDescriptor(),
          manifest.v1.EstafetteCustomVersionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_manifest_v1_EstafetteVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafetteVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafetteVersion_descriptor,
        new java.lang.String[] { "Semver", "Custom", });
    manifest.v1.EstafetteSemverVersionOuterClass.getDescriptor();
    manifest.v1.EstafetteCustomVersionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
