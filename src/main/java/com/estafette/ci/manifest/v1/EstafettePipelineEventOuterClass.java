// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_pipeline_event.proto

package com.estafette.ci.manifest.v1;

public final class EstafettePipelineEventOuterClass {
  private EstafettePipelineEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafettePipelineEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafettePipelineEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7estafette/ci/manifest/v1/estafette_pip" +
      "eline_event.proto\022\030estafette.ci.manifest" +
      ".v1\"\237\001\n\026EstafettePipelineEvent\022\025\n\rbuild_" +
      "version\030\001 \001(\t\022\023\n\013repo_source\030\002 \001(\t\022\022\n\nre" +
      "po_owner\030\003 \001(\t\022\021\n\trepo_name\030\004 \001(\t\022\023\n\013rep" +
      "o_branch\030\005 \001(\t\022\016\n\006status\030\006 \001(\t\022\r\n\005event\030" +
      "\007 \001(\tBx\n\034com.estafette.ci.manifest.v1P\001Z" +
      ";github.com/estafette/estafette-ci-proto" +
      "s-golang/manifest_v1\252\002\030Estafette.Ci.Mani" +
      "fest.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_estafette_ci_manifest_v1_EstafettePipelineEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafettePipelineEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafettePipelineEvent_descriptor,
        new java.lang.String[] { "BuildVersion", "RepoSource", "RepoOwner", "RepoName", "RepoBranch", "Status", "Event", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
