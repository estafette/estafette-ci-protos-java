// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/builder_config.proto

package com.estafette.ci.contracts.v1;

public final class BuilderConfigOuterClass {
  private BuilderConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_contracts_v1_BuilderConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_contracts_v1_BuilderConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.estafette/ci/contracts/v1/builder_conf" +
      "ig.proto\022\031estafette.ci.contracts.v1\0323est" +
      "afette/ci/contracts/v1/build_params_conf" +
      "ig.proto\0324estafette/ci/contracts/v1/buil" +
      "d_version_config.proto\0320estafette/ci/con" +
      "tracts/v1/ci_server_config.proto\0321estafe" +
      "tte/ci/contracts/v1/credential_config.pr" +
      "oto\032*estafette/ci/contracts/v1/git_confi" +
      "g.proto\0325estafette/ci/contracts/v1/relea" +
      "se_params_config.proto\0324estafette/ci/con" +
      "tracts/v1/trusted_image_config.proto\032.es" +
      "tafette/ci/manifest/v1/estafette_event.p" +
      "roto\0321estafette/ci/manifest/v1/estafette" +
      "_manifest.proto\"\317\005\n\rBuilderConfig\022\016\n\006act" +
      "ion\030\001 \001(\t\022\r\n\005track\030\002 \001(\t\022\027\n\017registry_mir" +
      "ror\030\003 \001(\t\022\031\n\021docker_daemon_mtu\030\004 \001(\t\022=\n\010" +
      "manifest\030\005 \001(\0132+.estafette.ci.manifest.v" +
      "1.EstafetteManifest\022\020\n\010job_name\030\006 \001(\t\022\024\n" +
      "\014release_name\030\007 \001(\t\0228\n\006events\030\010 \003(\0132(.es" +
      "tafette.ci.manifest.v1.EstafetteEvent\022<\n" +
      "\tci_server\030\t \001(\0132).estafette.ci.contract" +
      "s.v1.CiServerConfig\022B\n\014build_params\030\n \001(" +
      "\0132,.estafette.ci.contracts.v1.BuildParam" +
      "sConfig\022F\n\016release_params\030\013 \001(\0132..estafe" +
      "tte.ci.contracts.v1.ReleaseParamsConfig\022" +
      "1\n\003git\030\014 \001(\0132$.estafette.ci.contracts.v1" +
      ".GitConfig\022D\n\rbuild_version\030\r \001(\0132-.esta" +
      "fette.ci.contracts.v1.BuildVersionConfig" +
      "\022@\n\013credentials\030\016 \003(\0132+.estafette.ci.con" +
      "tracts.v1.CredentialConfig\022E\n\016trusted_im" +
      "ages\030\017 \003(\0132-.estafette.ci.contracts.v1.T" +
      "rustedImageConfigB{\n\035com.estafette.ci.co" +
      "ntracts.v1P\001Z<github.com/estafette/estaf" +
      "ette-ci-protos-golang/contracts/v1\252\002\031Est" +
      "afette.Ci.Contracts.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.estafette.ci.contracts.v1.BuildParamsConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.BuildVersionConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.CiServerConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.CredentialConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.GitConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.ReleaseParamsConfigOuterClass.getDescriptor(),
          com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteEventOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteManifestOuterClass.getDescriptor(),
        });
    internal_static_estafette_ci_contracts_v1_BuilderConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_contracts_v1_BuilderConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_contracts_v1_BuilderConfig_descriptor,
        new java.lang.String[] { "Action", "Track", "RegistryMirror", "DockerDaemonMtu", "Manifest", "JobName", "ReleaseName", "Events", "CiServer", "BuildParams", "ReleaseParams", "Git", "BuildVersion", "Credentials", "TrustedImages", });
    com.estafette.ci.contracts.v1.BuildParamsConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.BuildVersionConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.CiServerConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.CredentialConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.GitConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.ReleaseParamsConfigOuterClass.getDescriptor();
    com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteEventOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteManifestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
