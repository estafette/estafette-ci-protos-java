// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_release_event.proto

package com.estafette.ci.manifest.v1;

/**
 * Protobuf type {@code estafette.ci.manifest.v1.EstafetteReleaseEvent}
 */
public  final class EstafetteReleaseEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.manifest.v1.EstafetteReleaseEvent)
    EstafetteReleaseEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstafetteReleaseEvent.newBuilder() to construct.
  private EstafetteReleaseEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstafetteReleaseEvent() {
    releaseVersion_ = "";
    repoSource_ = "";
    repoOwner_ = "";
    repoName_ = "";
    target_ = "";
    status_ = "";
    event_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EstafetteReleaseEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstafetteReleaseEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            releaseVersion_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            repoSource_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            repoOwner_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            repoName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            target_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            event_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.estafette.ci.manifest.v1.EstafetteReleaseEventOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteReleaseEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.manifest.v1.EstafetteReleaseEventOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteReleaseEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.manifest.v1.EstafetteReleaseEvent.class, com.estafette.ci.manifest.v1.EstafetteReleaseEvent.Builder.class);
  }

  public static final int RELEASE_VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object releaseVersion_;
  /**
   * <code>string release_version = 1;</code>
   */
  public java.lang.String getReleaseVersion() {
    java.lang.Object ref = releaseVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      releaseVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string release_version = 1;</code>
   */
  public com.google.protobuf.ByteString
      getReleaseVersionBytes() {
    java.lang.Object ref = releaseVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      releaseVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPO_SOURCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object repoSource_;
  /**
   * <code>string repo_source = 2;</code>
   */
  public java.lang.String getRepoSource() {
    java.lang.Object ref = repoSource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repoSource_ = s;
      return s;
    }
  }
  /**
   * <code>string repo_source = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRepoSourceBytes() {
    java.lang.Object ref = repoSource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repoSource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPO_OWNER_FIELD_NUMBER = 3;
  private volatile java.lang.Object repoOwner_;
  /**
   * <code>string repo_owner = 3;</code>
   */
  public java.lang.String getRepoOwner() {
    java.lang.Object ref = repoOwner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repoOwner_ = s;
      return s;
    }
  }
  /**
   * <code>string repo_owner = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRepoOwnerBytes() {
    java.lang.Object ref = repoOwner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repoOwner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPO_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object repoName_;
  /**
   * <code>string repo_name = 4;</code>
   */
  public java.lang.String getRepoName() {
    java.lang.Object ref = repoName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repoName_ = s;
      return s;
    }
  }
  /**
   * <code>string repo_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRepoNameBytes() {
    java.lang.Object ref = repoName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repoName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_FIELD_NUMBER = 5;
  private volatile java.lang.Object target_;
  /**
   * <code>string target = 5;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <code>string target = 5;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 6;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 6;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_FIELD_NUMBER = 7;
  private volatile java.lang.Object event_;
  /**
   * <code>string event = 7;</code>
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
   * <code>string event = 7;</code>
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
    if (!getReleaseVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, releaseVersion_);
    }
    if (!getRepoSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, repoSource_);
    }
    if (!getRepoOwnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, repoOwner_);
    }
    if (!getRepoNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, repoName_);
    }
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, target_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, status_);
    }
    if (!getEventBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, event_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReleaseVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, releaseVersion_);
    }
    if (!getRepoSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, repoSource_);
    }
    if (!getRepoOwnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, repoOwner_);
    }
    if (!getRepoNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, repoName_);
    }
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, target_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, status_);
    }
    if (!getEventBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, event_);
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
    if (!(obj instanceof com.estafette.ci.manifest.v1.EstafetteReleaseEvent)) {
      return super.equals(obj);
    }
    com.estafette.ci.manifest.v1.EstafetteReleaseEvent other = (com.estafette.ci.manifest.v1.EstafetteReleaseEvent) obj;

    if (!getReleaseVersion()
        .equals(other.getReleaseVersion())) return false;
    if (!getRepoSource()
        .equals(other.getRepoSource())) return false;
    if (!getRepoOwner()
        .equals(other.getRepoOwner())) return false;
    if (!getRepoName()
        .equals(other.getRepoName())) return false;
    if (!getTarget()
        .equals(other.getTarget())) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!getEvent()
        .equals(other.getEvent())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RELEASE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getReleaseVersion().hashCode();
    hash = (37 * hash) + REPO_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getRepoSource().hashCode();
    hash = (37 * hash) + REPO_OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getRepoOwner().hashCode();
    hash = (37 * hash) + REPO_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRepoName().hashCode();
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getEvent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent parseFrom(
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
  public static Builder newBuilder(com.estafette.ci.manifest.v1.EstafetteReleaseEvent prototype) {
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
   * Protobuf type {@code estafette.ci.manifest.v1.EstafetteReleaseEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.manifest.v1.EstafetteReleaseEvent)
      com.estafette.ci.manifest.v1.EstafetteReleaseEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.manifest.v1.EstafetteReleaseEventOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteReleaseEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.manifest.v1.EstafetteReleaseEventOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteReleaseEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.manifest.v1.EstafetteReleaseEvent.class, com.estafette.ci.manifest.v1.EstafetteReleaseEvent.Builder.class);
    }

    // Construct using com.estafette.ci.manifest.v1.EstafetteReleaseEvent.newBuilder()
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
      releaseVersion_ = "";

      repoSource_ = "";

      repoOwner_ = "";

      repoName_ = "";

      target_ = "";

      status_ = "";

      event_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.manifest.v1.EstafetteReleaseEventOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteReleaseEvent_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteReleaseEvent getDefaultInstanceForType() {
      return com.estafette.ci.manifest.v1.EstafetteReleaseEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteReleaseEvent build() {
      com.estafette.ci.manifest.v1.EstafetteReleaseEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteReleaseEvent buildPartial() {
      com.estafette.ci.manifest.v1.EstafetteReleaseEvent result = new com.estafette.ci.manifest.v1.EstafetteReleaseEvent(this);
      result.releaseVersion_ = releaseVersion_;
      result.repoSource_ = repoSource_;
      result.repoOwner_ = repoOwner_;
      result.repoName_ = repoName_;
      result.target_ = target_;
      result.status_ = status_;
      result.event_ = event_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.estafette.ci.manifest.v1.EstafetteReleaseEvent) {
        return mergeFrom((com.estafette.ci.manifest.v1.EstafetteReleaseEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.manifest.v1.EstafetteReleaseEvent other) {
      if (other == com.estafette.ci.manifest.v1.EstafetteReleaseEvent.getDefaultInstance()) return this;
      if (!other.getReleaseVersion().isEmpty()) {
        releaseVersion_ = other.releaseVersion_;
        onChanged();
      }
      if (!other.getRepoSource().isEmpty()) {
        repoSource_ = other.repoSource_;
        onChanged();
      }
      if (!other.getRepoOwner().isEmpty()) {
        repoOwner_ = other.repoOwner_;
        onChanged();
      }
      if (!other.getRepoName().isEmpty()) {
        repoName_ = other.repoName_;
        onChanged();
      }
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getEvent().isEmpty()) {
        event_ = other.event_;
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
      com.estafette.ci.manifest.v1.EstafetteReleaseEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.manifest.v1.EstafetteReleaseEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object releaseVersion_ = "";
    /**
     * <code>string release_version = 1;</code>
     */
    public java.lang.String getReleaseVersion() {
      java.lang.Object ref = releaseVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        releaseVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string release_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReleaseVersionBytes() {
      java.lang.Object ref = releaseVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        releaseVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string release_version = 1;</code>
     */
    public Builder setReleaseVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      releaseVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string release_version = 1;</code>
     */
    public Builder clearReleaseVersion() {
      
      releaseVersion_ = getDefaultInstance().getReleaseVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string release_version = 1;</code>
     */
    public Builder setReleaseVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      releaseVersion_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object repoSource_ = "";
    /**
     * <code>string repo_source = 2;</code>
     */
    public java.lang.String getRepoSource() {
      java.lang.Object ref = repoSource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repoSource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string repo_source = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRepoSourceBytes() {
      java.lang.Object ref = repoSource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repoSource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string repo_source = 2;</code>
     */
    public Builder setRepoSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      repoSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string repo_source = 2;</code>
     */
    public Builder clearRepoSource() {
      
      repoSource_ = getDefaultInstance().getRepoSource();
      onChanged();
      return this;
    }
    /**
     * <code>string repo_source = 2;</code>
     */
    public Builder setRepoSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      repoSource_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object repoOwner_ = "";
    /**
     * <code>string repo_owner = 3;</code>
     */
    public java.lang.String getRepoOwner() {
      java.lang.Object ref = repoOwner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repoOwner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string repo_owner = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRepoOwnerBytes() {
      java.lang.Object ref = repoOwner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repoOwner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string repo_owner = 3;</code>
     */
    public Builder setRepoOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      repoOwner_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string repo_owner = 3;</code>
     */
    public Builder clearRepoOwner() {
      
      repoOwner_ = getDefaultInstance().getRepoOwner();
      onChanged();
      return this;
    }
    /**
     * <code>string repo_owner = 3;</code>
     */
    public Builder setRepoOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      repoOwner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object repoName_ = "";
    /**
     * <code>string repo_name = 4;</code>
     */
    public java.lang.String getRepoName() {
      java.lang.Object ref = repoName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repoName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string repo_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRepoNameBytes() {
      java.lang.Object ref = repoName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repoName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string repo_name = 4;</code>
     */
    public Builder setRepoName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      repoName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string repo_name = 4;</code>
     */
    public Builder clearRepoName() {
      
      repoName_ = getDefaultInstance().getRepoName();
      onChanged();
      return this;
    }
    /**
     * <code>string repo_name = 4;</code>
     */
    public Builder setRepoNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      repoName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <code>string target = 5;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target = 5;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target = 5;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <code>string target = 5;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 6;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 6;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 6;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 6;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 6;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object event_ = "";
    /**
     * <code>string event = 7;</code>
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
     * <code>string event = 7;</code>
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
     * <code>string event = 7;</code>
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
     * <code>string event = 7;</code>
     */
    public Builder clearEvent() {
      
      event_ = getDefaultInstance().getEvent();
      onChanged();
      return this;
    }
    /**
     * <code>string event = 7;</code>
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
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:estafette.ci.manifest.v1.EstafetteReleaseEvent)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.manifest.v1.EstafetteReleaseEvent)
  private static final com.estafette.ci.manifest.v1.EstafetteReleaseEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.manifest.v1.EstafetteReleaseEvent();
  }

  public static com.estafette.ci.manifest.v1.EstafetteReleaseEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstafetteReleaseEvent>
      PARSER = new com.google.protobuf.AbstractParser<EstafetteReleaseEvent>() {
    @java.lang.Override
    public EstafetteReleaseEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstafetteReleaseEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstafetteReleaseEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstafetteReleaseEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.manifest.v1.EstafetteReleaseEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

