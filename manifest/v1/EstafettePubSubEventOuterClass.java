// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manifest.v1/estafette_pub_sub_event.proto

package manifest.v1;

public final class EstafettePubSubEventOuterClass {
  private EstafettePubSubEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafettePubSubEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafettePubSubEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string project = 1;</code>
     */
    java.lang.String getProject();
    /**
     * <code>string project = 1;</code>
     */
    com.google.protobuf.ByteString
        getProjectBytes();

    /**
     * <code>string topic = 2;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>string topic = 2;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafettePubSubEvent}
   */
  public  static final class EstafettePubSubEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafettePubSubEvent)
      EstafettePubSubEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafettePubSubEvent.newBuilder() to construct.
    private EstafettePubSubEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafettePubSubEvent() {
      project_ = "";
      topic_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafettePubSubEvent(
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

              project_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              topic_ = s;
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
      return manifest.v1.EstafettePubSubEventOuterClass.internal_static_manifest_v1_EstafettePubSubEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return manifest.v1.EstafettePubSubEventOuterClass.internal_static_manifest_v1_EstafettePubSubEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.class, manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.Builder.class);
    }

    public static final int PROJECT_FIELD_NUMBER = 1;
    private volatile java.lang.Object project_;
    /**
     * <code>string project = 1;</code>
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      }
    }
    /**
     * <code>string project = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOPIC_FIELD_NUMBER = 2;
    private volatile java.lang.Object topic_;
    /**
     * <code>string topic = 2;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      }
    }
    /**
     * <code>string topic = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
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
      if (!getProjectBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, project_);
      }
      if (!getTopicBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topic_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getProjectBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, project_);
      }
      if (!getTopicBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topic_);
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
      if (!(obj instanceof manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent)) {
        return super.equals(obj);
      }
      manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent other = (manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent) obj;

      boolean result = true;
      result = result && getProject()
          .equals(other.getProject());
      result = result && getTopic()
          .equals(other.getTopic());
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
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parseFrom(
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
    public static Builder newBuilder(manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent prototype) {
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
     * Protobuf type {@code manifest.v1.EstafettePubSubEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafettePubSubEvent)
        manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return manifest.v1.EstafettePubSubEventOuterClass.internal_static_manifest_v1_EstafettePubSubEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return manifest.v1.EstafettePubSubEventOuterClass.internal_static_manifest_v1_EstafettePubSubEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.class, manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.Builder.class);
      }

      // Construct using manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.newBuilder()
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
        project_ = "";

        topic_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return manifest.v1.EstafettePubSubEventOuterClass.internal_static_manifest_v1_EstafettePubSubEvent_descriptor;
      }

      @java.lang.Override
      public manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent getDefaultInstanceForType() {
        return manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.getDefaultInstance();
      }

      @java.lang.Override
      public manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent build() {
        manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent buildPartial() {
        manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent result = new manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent(this);
        result.project_ = project_;
        result.topic_ = topic_;
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
        if (other instanceof manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent) {
          return mergeFrom((manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent other) {
        if (other == manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent.getDefaultInstance()) return this;
        if (!other.getProject().isEmpty()) {
          project_ = other.project_;
          onChanged();
        }
        if (!other.getTopic().isEmpty()) {
          topic_ = other.topic_;
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
        manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object project_ = "";
      /**
       * <code>string project = 1;</code>
       */
      public java.lang.String getProject() {
        java.lang.Object ref = project_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          project_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string project = 1;</code>
       */
      public com.google.protobuf.ByteString
          getProjectBytes() {
        java.lang.Object ref = project_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          project_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string project = 1;</code>
       */
      public Builder setProject(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        project_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string project = 1;</code>
       */
      public Builder clearProject() {
        
        project_ = getDefaultInstance().getProject();
        onChanged();
        return this;
      }
      /**
       * <code>string project = 1;</code>
       */
      public Builder setProjectBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        project_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object topic_ = "";
      /**
       * <code>string topic = 2;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string topic = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string topic = 2;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 2;</code>
       */
      public Builder clearTopic() {
        
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 2;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        topic_ = value;
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafettePubSubEvent)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafettePubSubEvent)
    private static final manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent();
    }

    public static manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafettePubSubEvent>
        PARSER = new com.google.protobuf.AbstractParser<EstafettePubSubEvent>() {
      @java.lang.Override
      public EstafettePubSubEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafettePubSubEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafettePubSubEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafettePubSubEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public manifest.v1.EstafettePubSubEventOuterClass.EstafettePubSubEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafettePubSubEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafettePubSubEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)manifest.v1/estafette_pub_sub_event.pr" +
      "oto\022\013manifest.v1\"6\n\024EstafettePubSubEvent" +
      "\022\017\n\007project\030\001 \001(\t\022\r\n\005topic\030\002 \001(\tB[Z>gith" +
      "ub.com/estafette/estafette-ci-contracts-" +
      "golang/manifest_v1\252\002\030Estafette.CI.Manife" +
      "st.V1b\006proto3"
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
    internal_static_manifest_v1_EstafettePubSubEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafettePubSubEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafettePubSubEvent_descriptor,
        new java.lang.String[] { "Project", "Topic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
