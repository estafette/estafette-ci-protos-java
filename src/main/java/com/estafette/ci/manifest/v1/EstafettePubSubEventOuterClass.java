// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_pub_sub_event.proto

package com.estafette.ci.manifest.v1;

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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafettePubSubEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafettePubSubEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6estafette/ci/manifest/v1/estafette_pub" +
      "_sub_event.proto\022\030estafette.ci.manifest." +
      "v1\"6\n\024EstafettePubSubEvent\022\017\n\007project\030\001 " +
      "\001(\t\022\r\n\005topic\030\002 \001(\tBx\n\034com.estafette.ci.m" +
      "anifest.v1P\001Z;github.com/estafette/estaf" +
      "ette-ci-protos-golang/manifest_v1\252\002\030Esta" +
      "fette.Ci.Manifest.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_estafette_ci_manifest_v1_EstafettePubSubEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafettePubSubEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafettePubSubEvent_descriptor,
        new java.lang.String[] { "Project", "Topic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}