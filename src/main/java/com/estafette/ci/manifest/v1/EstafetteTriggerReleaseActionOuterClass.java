// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_trigger_release_action.proto

package com.estafette.ci.manifest.v1;

public final class EstafetteTriggerReleaseActionOuterClass {
  private EstafetteTriggerReleaseActionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?estafette/ci/manifest/v1/estafette_tri" +
      "gger_release_action.proto\022\030estafette.ci." +
      "manifest.v1\"P\n\035EstafetteTriggerReleaseAc" +
      "tion\022\016\n\006target\030\001 \001(\t\022\016\n\006action\030\002 \001(\t\022\017\n\007" +
      "version\030\003 \001(\tBx\n\034com.estafette.ci.manife" +
      "st.v1P\001Z;github.com/estafette/estafette-" +
      "ci-protos-golang/manifest_v1\252\002\030Estafette" +
      ".Ci.Manifest.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor,
        new java.lang.String[] { "Target", "Action", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
