// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/build_log_step_docker_image.proto

package com.estafette.ci.contracts.v1;

public final class BuildLogStepDockerImageOuterClass {
  private BuildLogStepDockerImageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_contracts_v1_BuildLogStepDockerImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_contracts_v1_BuildLogStepDockerImage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;estafette/ci/contracts/v1/build_log_st" +
      "ep_docker_image.proto\022\031estafette.ci.cont" +
      "racts.v1\032\036google/protobuf/duration.proto" +
      "\"\260\001\n\027BuildLogStepDockerImage\022\014\n\004name\030\001 \001" +
      "(\t\022\013\n\003tag\030\002 \001(\t\022\021\n\tis_pulled\030\003 \001(\010\022\022\n\nim" +
      "age_size\030\004 \001(\003\0220\n\rpull_duration\030\005 \001(\0132\031." +
      "google.protobuf.Duration\022\r\n\005error\030\006 \001(\t\022" +
      "\022\n\nis_trusted\030\007 \001(\010B{\n\035com.estafette.ci." +
      "contracts.v1P\001Z<github.com/estafette/est" +
      "afette-ci-protos-golang/contracts/v1\252\002\031E" +
      "stafette.Ci.Contracts.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_estafette_ci_contracts_v1_BuildLogStepDockerImage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_contracts_v1_BuildLogStepDockerImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_contracts_v1_BuildLogStepDockerImage_descriptor,
        new java.lang.String[] { "Name", "Tag", "IsPulled", "ImageSize", "PullDuration", "Error", "IsTrusted", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
