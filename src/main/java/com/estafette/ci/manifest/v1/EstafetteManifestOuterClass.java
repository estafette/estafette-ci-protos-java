// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_manifest.proto

package com.estafette.ci.manifest.v1;

public final class EstafetteManifestOuterClass {
  private EstafetteManifestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteManifest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_GlobalEnvVarsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteManifest_GlobalEnvVarsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1estafette/ci/manifest/v1/estafette_man" +
      "ifest.proto\022\030estafette.ci.manifest.v1\0320e" +
      "stafette/ci/manifest/v1/estafette_builde" +
      "r.proto\0320estafette/ci/manifest/v1/estafe" +
      "tte_release.proto\032.estafette/ci/manifest" +
      "/v1/estafette_stage.proto\0320estafette/ci/" +
      "manifest/v1/estafette_trigger.proto\0320est" +
      "afette/ci/manifest/v1/estafette_version." +
      "proto\"\312\004\n\021EstafetteManifest\022;\n\007builder\030\001" +
      " \001(\0132*.estafette.ci.manifest.v1.Estafett" +
      "eBuilder\022G\n\006labels\030\002 \003(\01327.estafette.ci." +
      "manifest.v1.EstafetteManifest.LabelsEntr" +
      "y\022;\n\007version\030\003 \001(\0132*.estafette.ci.manife" +
      "st.v1.EstafetteVersion\022W\n\017global_env_var" +
      "s\030\004 \003(\0132>.estafette.ci.manifest.v1.Estaf" +
      "etteManifest.GlobalEnvVarsEntry\022<\n\010trigg" +
      "ers\030\005 \003(\0132*.estafette.ci.manifest.v1.Est" +
      "afetteTrigger\0228\n\006stages\030\006 \003(\0132(.estafett" +
      "e.ci.manifest.v1.EstafetteStage\022<\n\010relea" +
      "ses\030\007 \003(\0132*.estafette.ci.manifest.v1.Est" +
      "afetteRelease\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\0324\n\022GlobalEnvVarsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001Bx\n\034co" +
      "m.estafette.ci.manifest.v1P\001Z;github.com" +
      "/estafette/estafette-ci-protos-golang/ma" +
      "nifest_v1\252\002\030Estafette.Ci.Manifest.V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.estafette.ci.manifest.v1.EstafetteBuilderOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteReleaseOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteStageOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteVersionOuterClass.getDescriptor(),
        });
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteManifest_descriptor,
        new java.lang.String[] { "Builder", "Labels", "Version", "GlobalEnvVars", "Triggers", "Stages", "Releases", });
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_LabelsEntry_descriptor =
      internal_static_estafette_ci_manifest_v1_EstafetteManifest_descriptor.getNestedTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteManifest_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_GlobalEnvVarsEntry_descriptor =
      internal_static_estafette_ci_manifest_v1_EstafetteManifest_descriptor.getNestedTypes().get(1);
    internal_static_estafette_ci_manifest_v1_EstafetteManifest_GlobalEnvVarsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteManifest_GlobalEnvVarsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.estafette.ci.manifest.v1.EstafetteBuilderOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteReleaseOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteStageOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteVersionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
