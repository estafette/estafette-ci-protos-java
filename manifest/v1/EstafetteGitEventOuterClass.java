// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manifest.v1/estafette_git_event.proto

package manifest.v1;

public final class EstafetteGitEventOuterClass {
  private EstafetteGitEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafetteGitEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafetteGitEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string event = 1;</code>
     */
    java.lang.String getEvent();
    /**
     * <code>string event = 1;</code>
     */
    com.google.protobuf.ByteString
        getEventBytes();

    /**
     * <code>string repository = 2;</code>
     */
    java.lang.String getRepository();
    /**
     * <code>string repository = 2;</code>
     */
    com.google.protobuf.ByteString
        getRepositoryBytes();

    /**
     * <code>string branch = 3;</code>
     */
    java.lang.String getBranch();
    /**
     * <code>string branch = 3;</code>
     */
    com.google.protobuf.ByteString
        getBranchBytes();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafetteGitEvent}
   */
  public  static final class EstafetteGitEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafetteGitEvent)
      EstafetteGitEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafetteGitEvent.newBuilder() to construct.
    private EstafetteGitEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafetteGitEvent() {
      event_ = "";
      repository_ = "";
      branch_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafetteGitEvent(
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
              java.lang.String s = input.readStringRequireUtf8();

              event_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              repository_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              branch_ = s;
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
      return manifest.v1.EstafetteGitEventOuterClass.internal_static_manifest_v1_EstafetteGitEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return manifest.v1.EstafetteGitEventOuterClass.internal_static_manifest_v1_EstafetteGitEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.class, manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.Builder.class);
    }

    public static final int EVENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object event_;
    /**
     * <code>string event = 1;</code>
     */
    public java.lang.String getEvent() {
      java.lang.Object ref = event_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        event_ = s;
        return s;
      }
    }
    /**
     * <code>string event = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventBytes() {
      java.lang.Object ref = event_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        event_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REPOSITORY_FIELD_NUMBER = 2;
    private volatile java.lang.Object repository_;
    /**
     * <code>string repository = 2;</code>
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      }
    }
    /**
     * <code>string repository = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BRANCH_FIELD_NUMBER = 3;
    private volatile java.lang.Object branch_;
    /**
     * <code>string branch = 3;</code>
     */
    public java.lang.String getBranch() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        branch_ = s;
        return s;
      }
    }
    /**
     * <code>string branch = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBranchBytes() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        branch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getEventBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, event_);
      }
      if (!getRepositoryBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, repository_);
      }
      if (!getBranchBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, branch_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEventBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, event_);
      }
      if (!getRepositoryBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, repository_);
      }
      if (!getBranchBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, branch_);
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
      if (!(obj instanceof manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent)) {
        return super.equals(obj);
      }
      manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent other = (manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent) obj;

      boolean result = true;
      result = result && getEvent()
          .equals(other.getEvent());
      result = result && getRepository()
          .equals(other.getRepository());
      result = result && getBranch()
          .equals(other.getBranch());
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
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
      hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
      hash = (53 * hash) + getRepository().hashCode();
      hash = (37 * hash) + BRANCH_FIELD_NUMBER;
      hash = (53 * hash) + getBranch().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parseFrom(
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
    public static Builder newBuilder(manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent prototype) {
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
     * Protobuf type {@code manifest.v1.EstafetteGitEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafetteGitEvent)
        manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return manifest.v1.EstafetteGitEventOuterClass.internal_static_manifest_v1_EstafetteGitEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return manifest.v1.EstafetteGitEventOuterClass.internal_static_manifest_v1_EstafetteGitEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.class, manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.Builder.class);
      }

      // Construct using manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.newBuilder()
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
        event_ = "";

        repository_ = "";

        branch_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return manifest.v1.EstafetteGitEventOuterClass.internal_static_manifest_v1_EstafetteGitEvent_descriptor;
      }

      @java.lang.Override
      public manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent getDefaultInstanceForType() {
        return manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.getDefaultInstance();
      }

      @java.lang.Override
      public manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent build() {
        manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent buildPartial() {
        manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent result = new manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent(this);
        result.event_ = event_;
        result.repository_ = repository_;
        result.branch_ = branch_;
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
        if (other instanceof manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent) {
          return mergeFrom((manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent other) {
        if (other == manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent.getDefaultInstance()) return this;
        if (!other.getEvent().isEmpty()) {
          event_ = other.event_;
          onChanged();
        }
        if (!other.getRepository().isEmpty()) {
          repository_ = other.repository_;
          onChanged();
        }
        if (!other.getBranch().isEmpty()) {
          branch_ = other.branch_;
          onChanged();
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
        manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object event_ = "";
      /**
       * <code>string event = 1;</code>
       */
      public java.lang.String getEvent() {
        java.lang.Object ref = event_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          event_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string event = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEventBytes() {
        java.lang.Object ref = event_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          event_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder setEvent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        event_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder clearEvent() {
        
        event_ = getDefaultInstance().getEvent();
        onChanged();
        return this;
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder setEventBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        event_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object repository_ = "";
      /**
       * <code>string repository = 2;</code>
       */
      public java.lang.String getRepository() {
        java.lang.Object ref = repository_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          repository_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string repository = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRepositoryBytes() {
        java.lang.Object ref = repository_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          repository_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string repository = 2;</code>
       */
      public Builder setRepository(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        repository_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string repository = 2;</code>
       */
      public Builder clearRepository() {
        
        repository_ = getDefaultInstance().getRepository();
        onChanged();
        return this;
      }
      /**
       * <code>string repository = 2;</code>
       */
      public Builder setRepositoryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        repository_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object branch_ = "";
      /**
       * <code>string branch = 3;</code>
       */
      public java.lang.String getBranch() {
        java.lang.Object ref = branch_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          branch_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string branch = 3;</code>
       */
      public com.google.protobuf.ByteString
          getBranchBytes() {
        java.lang.Object ref = branch_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          branch_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string branch = 3;</code>
       */
      public Builder setBranch(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        branch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 3;</code>
       */
      public Builder clearBranch() {
        
        branch_ = getDefaultInstance().getBranch();
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 3;</code>
       */
      public Builder setBranchBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        branch_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafetteGitEvent)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafetteGitEvent)
    private static final manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent();
    }

    public static manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafetteGitEvent>
        PARSER = new com.google.protobuf.AbstractParser<EstafetteGitEvent>() {
      @java.lang.Override
      public EstafetteGitEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafetteGitEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafetteGitEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafetteGitEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public manifest.v1.EstafetteGitEventOuterClass.EstafetteGitEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafetteGitEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafetteGitEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%manifest.v1/estafette_git_event.proto\022" +
      "\013manifest.v1\"F\n\021EstafetteGitEvent\022\r\n\005eve" +
      "nt\030\001 \001(\t\022\022\n\nrepository\030\002 \001(\t\022\016\n\006branch\030\003" +
      " \001(\tB@Z>github.com/estafette/estafette-c" +
      "i-contracts-golang/manifest_v1b\006proto3"
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
        }, assigner);
    internal_static_manifest_v1_EstafetteGitEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafetteGitEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafetteGitEvent_descriptor,
        new java.lang.String[] { "Event", "Repository", "Branch", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
