// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/release_target.proto

package com.estafette.ci.contracts.v1;

public interface ReleaseTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:estafette.ci.contracts.v1.ReleaseTarget)
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
   * <code>repeated .estafette.ci.manifest.v1.EstafetteReleaseAction actions = 2;</code>
   */
  java.util.List<com.estafette.ci.manifest.v1.EstafetteReleaseAction> 
      getActionsList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteReleaseAction actions = 2;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteReleaseAction getActions(int index);
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteReleaseAction actions = 2;</code>
   */
  int getActionsCount();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteReleaseAction actions = 2;</code>
   */
  java.util.List<? extends com.estafette.ci.manifest.v1.EstafetteReleaseActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteReleaseAction actions = 2;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteReleaseActionOrBuilder getActionsOrBuilder(
      int index);

  /**
   * <code>repeated .estafette.ci.contracts.v1.Release active_releases = 3;</code>
   */
  java.util.List<com.estafette.ci.contracts.v1.Release> 
      getActiveReleasesList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Release active_releases = 3;</code>
   */
  com.estafette.ci.contracts.v1.Release getActiveReleases(int index);
  /**
   * <code>repeated .estafette.ci.contracts.v1.Release active_releases = 3;</code>
   */
  int getActiveReleasesCount();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Release active_releases = 3;</code>
   */
  java.util.List<? extends com.estafette.ci.contracts.v1.ReleaseOrBuilder> 
      getActiveReleasesOrBuilderList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Release active_releases = 3;</code>
   */
  com.estafette.ci.contracts.v1.ReleaseOrBuilder getActiveReleasesOrBuilder(
      int index);
}
