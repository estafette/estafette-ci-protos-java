// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contracts.v1/credential_config.proto

package contracts.v1;

public final class CredentialConfigOuterClass {
  private CredentialConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CredentialConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:contracts.v1.CredentialConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string type = 2;</code>
     */
    java.lang.String getType();
    /**
     * <code>string type = 2;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */
    int getAdditionalPropertiesCount();
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */
    boolean containsAdditionalProperties(
        java.lang.String key);
    /**
     * Use {@link #getAdditionalPropertiesMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.google.protobuf.Any>
    getAdditionalProperties();
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */
    java.util.Map<java.lang.String, com.google.protobuf.Any>
    getAdditionalPropertiesMap();
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    com.google.protobuf.Any getAdditionalPropertiesOrDefault(
        java.lang.String key,
        com.google.protobuf.Any defaultValue);
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    com.google.protobuf.Any getAdditionalPropertiesOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code contracts.v1.CredentialConfig}
   */
  public  static final class CredentialConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:contracts.v1.CredentialConfig)
      CredentialConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CredentialConfig.newBuilder() to construct.
    private CredentialConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CredentialConfig() {
      name_ = "";
      type_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CredentialConfig(
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

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                additionalProperties_ = com.google.protobuf.MapField.newMapField(
                    AdditionalPropertiesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000004;
              }
              com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
              additionalProperties__ = input.readMessage(
                  AdditionalPropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              additionalProperties_.getMutableMap().put(
                  additionalProperties__.getKey(), additionalProperties__.getValue());
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
      return contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetAdditionalProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              contracts.v1.CredentialConfigOuterClass.CredentialConfig.class, contracts.v1.CredentialConfigOuterClass.CredentialConfig.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private volatile java.lang.Object type_;
    /**
     * <code>string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDITIONAL_PROPERTIES_FIELD_NUMBER = 3;
    private static final class AdditionalPropertiesDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, com.google.protobuf.Any> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, com.google.protobuf.Any>newDefaultInstance(
                  contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  com.google.protobuf.Any.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Any> additionalProperties_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
    internalGetAdditionalProperties() {
      if (additionalProperties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AdditionalPropertiesDefaultEntryHolder.defaultEntry);
      }
      return additionalProperties_;
    }

    public int getAdditionalPropertiesCount() {
      return internalGetAdditionalProperties().getMap().size();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    public boolean containsAdditionalProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAdditionalProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAdditionalPropertiesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Any> getAdditionalProperties() {
      return getAdditionalPropertiesMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    public java.util.Map<java.lang.String, com.google.protobuf.Any> getAdditionalPropertiesMap() {
      return internalGetAdditionalProperties().getMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    public com.google.protobuf.Any getAdditionalPropertiesOrDefault(
        java.lang.String key,
        com.google.protobuf.Any defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetAdditionalProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
     */

    public com.google.protobuf.Any getAdditionalPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetAdditionalProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetAdditionalProperties(),
          AdditionalPropertiesDefaultEntryHolder.defaultEntry,
          3);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
      }
      for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Any> entry
           : internalGetAdditionalProperties().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
        additionalProperties__ = AdditionalPropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, additionalProperties__);
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
      if (!(obj instanceof contracts.v1.CredentialConfigOuterClass.CredentialConfig)) {
        return super.equals(obj);
      }
      contracts.v1.CredentialConfigOuterClass.CredentialConfig other = (contracts.v1.CredentialConfigOuterClass.CredentialConfig) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && getType()
          .equals(other.getType());
      result = result && internalGetAdditionalProperties().equals(
          other.internalGetAdditionalProperties());
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      if (!internalGetAdditionalProperties().getMap().isEmpty()) {
        hash = (37 * hash) + ADDITIONAL_PROPERTIES_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAdditionalProperties().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig parseFrom(
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
    public static Builder newBuilder(contracts.v1.CredentialConfigOuterClass.CredentialConfig prototype) {
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
     * Protobuf type {@code contracts.v1.CredentialConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:contracts.v1.CredentialConfig)
        contracts.v1.CredentialConfigOuterClass.CredentialConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetAdditionalProperties();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableAdditionalProperties();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                contracts.v1.CredentialConfigOuterClass.CredentialConfig.class, contracts.v1.CredentialConfigOuterClass.CredentialConfig.Builder.class);
      }

      // Construct using contracts.v1.CredentialConfigOuterClass.CredentialConfig.newBuilder()
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
        name_ = "";

        type_ = "";

        internalGetMutableAdditionalProperties().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return contracts.v1.CredentialConfigOuterClass.internal_static_contracts_v1_CredentialConfig_descriptor;
      }

      @java.lang.Override
      public contracts.v1.CredentialConfigOuterClass.CredentialConfig getDefaultInstanceForType() {
        return contracts.v1.CredentialConfigOuterClass.CredentialConfig.getDefaultInstance();
      }

      @java.lang.Override
      public contracts.v1.CredentialConfigOuterClass.CredentialConfig build() {
        contracts.v1.CredentialConfigOuterClass.CredentialConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public contracts.v1.CredentialConfigOuterClass.CredentialConfig buildPartial() {
        contracts.v1.CredentialConfigOuterClass.CredentialConfig result = new contracts.v1.CredentialConfigOuterClass.CredentialConfig(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.name_ = name_;
        result.type_ = type_;
        result.additionalProperties_ = internalGetAdditionalProperties();
        result.additionalProperties_.makeImmutable();
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof contracts.v1.CredentialConfigOuterClass.CredentialConfig) {
          return mergeFrom((contracts.v1.CredentialConfigOuterClass.CredentialConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(contracts.v1.CredentialConfigOuterClass.CredentialConfig other) {
        if (other == contracts.v1.CredentialConfigOuterClass.CredentialConfig.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        internalGetMutableAdditionalProperties().mergeFrom(
            other.internalGetAdditionalProperties());
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
        contracts.v1.CredentialConfigOuterClass.CredentialConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (contracts.v1.CredentialConfigOuterClass.CredentialConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>string type = 2;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string type = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string type = 2;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string type = 2;</code>
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>string type = 2;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.String, com.google.protobuf.Any> additionalProperties_;
      private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
      internalGetAdditionalProperties() {
        if (additionalProperties_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AdditionalPropertiesDefaultEntryHolder.defaultEntry);
        }
        return additionalProperties_;
      }
      private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
      internalGetMutableAdditionalProperties() {
        onChanged();;
        if (additionalProperties_ == null) {
          additionalProperties_ = com.google.protobuf.MapField.newMapField(
              AdditionalPropertiesDefaultEntryHolder.defaultEntry);
        }
        if (!additionalProperties_.isMutable()) {
          additionalProperties_ = additionalProperties_.copy();
        }
        return additionalProperties_;
      }

      public int getAdditionalPropertiesCount() {
        return internalGetAdditionalProperties().getMap().size();
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public boolean containsAdditionalProperties(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetAdditionalProperties().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAdditionalPropertiesMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, com.google.protobuf.Any> getAdditionalProperties() {
        return getAdditionalPropertiesMap();
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public java.util.Map<java.lang.String, com.google.protobuf.Any> getAdditionalPropertiesMap() {
        return internalGetAdditionalProperties().getMap();
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public com.google.protobuf.Any getAdditionalPropertiesOrDefault(
          java.lang.String key,
          com.google.protobuf.Any defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, com.google.protobuf.Any> map =
            internalGetAdditionalProperties().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public com.google.protobuf.Any getAdditionalPropertiesOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, com.google.protobuf.Any> map =
            internalGetAdditionalProperties().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAdditionalProperties() {
        internalGetMutableAdditionalProperties().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public Builder removeAdditionalProperties(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableAdditionalProperties().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, com.google.protobuf.Any>
      getMutableAdditionalProperties() {
        return internalGetMutableAdditionalProperties().getMutableMap();
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */
      public Builder putAdditionalProperties(
          java.lang.String key,
          com.google.protobuf.Any value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableAdditionalProperties().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, .google.protobuf.Any&gt; additional_properties = 3;</code>
       */

      public Builder putAllAdditionalProperties(
          java.util.Map<java.lang.String, com.google.protobuf.Any> values) {
        internalGetMutableAdditionalProperties().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:contracts.v1.CredentialConfig)
    }

    // @@protoc_insertion_point(class_scope:contracts.v1.CredentialConfig)
    private static final contracts.v1.CredentialConfigOuterClass.CredentialConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new contracts.v1.CredentialConfigOuterClass.CredentialConfig();
    }

    public static contracts.v1.CredentialConfigOuterClass.CredentialConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CredentialConfig>
        PARSER = new com.google.protobuf.AbstractParser<CredentialConfig>() {
      @java.lang.Override
      public CredentialConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CredentialConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CredentialConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CredentialConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public contracts.v1.CredentialConfigOuterClass.CredentialConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contracts_v1_CredentialConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contracts_v1_CredentialConfig_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$contracts.v1/credential_config.proto\022\014" +
      "contracts.v1\032\031google/protobuf/any.proto\"" +
      "\332\001\n\020CredentialConfig\022\014\n\004name\030\001 \001(\t\022\014\n\004ty" +
      "pe\030\002 \001(\t\022W\n\025additional_properties\030\003 \003(\0132" +
      "8.contracts.v1.CredentialConfig.Addition" +
      "alPropertiesEntry\032Q\n\031AdditionalPropertie" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022#\n\005value\030\002 \001(\0132\024.goo" +
      "gle.protobuf.Any:\0028\001BAZ?github.com/estaf" +
      "ette/estafette-ci-contracts-golang/contr" +
      "acts_v1b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_contracts_v1_CredentialConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contracts_v1_CredentialConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contracts_v1_CredentialConfig_descriptor,
        new java.lang.String[] { "Name", "Type", "AdditionalProperties", });
    internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_descriptor =
      internal_static_contracts_v1_CredentialConfig_descriptor.getNestedTypes().get(0);
    internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contracts_v1_CredentialConfig_AdditionalPropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
