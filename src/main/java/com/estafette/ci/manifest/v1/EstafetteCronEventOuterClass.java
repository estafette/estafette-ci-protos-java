// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_cron_event.proto

package com.estafette.ci.manifest.v1;

public final class EstafetteCronEventOuterClass {
  private EstafetteCronEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteCronEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteCronEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3estafette/ci/manifest/v1/estafette_cro" +
      "n_event.proto\022\030estafette.ci.manifest.v1\032" +
      "\037google/protobuf/timestamp.proto\">\n\022Esta" +
      "fetteCronEvent\022(\n\004time\030\001 \001(\0132\032.google.pr" +
      "otobuf.TimestampBx\n\034com.estafette.ci.man" +
      "ifest.v1P\001Z;github.com/estafette/estafet" +
      "te-ci-protos-golang/manifest_v1\252\002\030Estafe" +
      "tte.Ci.Manifest.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_estafette_ci_manifest_v1_EstafetteCronEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteCronEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteCronEvent_descriptor,
        new java.lang.String[] { "Time", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
