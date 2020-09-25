// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/build_log.proto

package com.estafette.ci.contracts.v1;

public interface BuildLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:estafette.ci.contracts.v1.BuildLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string repo_source = 2;</code>
   */
  java.lang.String getRepoSource();
  /**
   * <code>string repo_source = 2;</code>
   */
  com.google.protobuf.ByteString
      getRepoSourceBytes();

  /**
   * <code>string repo_owner = 3;</code>
   */
  java.lang.String getRepoOwner();
  /**
   * <code>string repo_owner = 3;</code>
   */
  com.google.protobuf.ByteString
      getRepoOwnerBytes();

  /**
   * <code>string repo_name = 4;</code>
   */
  java.lang.String getRepoName();
  /**
   * <code>string repo_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getRepoNameBytes();

  /**
   * <code>string repo_branch = 5;</code>
   */
  java.lang.String getRepoBranch();
  /**
   * <code>string repo_branch = 5;</code>
   */
  com.google.protobuf.ByteString
      getRepoBranchBytes();

  /**
   * <code>string repo_revision = 6;</code>
   */
  java.lang.String getRepoRevision();
  /**
   * <code>string repo_revision = 6;</code>
   */
  com.google.protobuf.ByteString
      getRepoRevisionBytes();

  /**
   * <code>string build_id = 7;</code>
   */
  java.lang.String getBuildId();
  /**
   * <code>string build_id = 7;</code>
   */
  com.google.protobuf.ByteString
      getBuildIdBytes();

  /**
   * <code>repeated .estafette.ci.contracts.v1.BuildLogStep steps = 8;</code>
   */
  java.util.List<com.estafette.ci.contracts.v1.BuildLogStep> 
      getStepsList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.BuildLogStep steps = 8;</code>
   */
  com.estafette.ci.contracts.v1.BuildLogStep getSteps(int index);
  /**
   * <code>repeated .estafette.ci.contracts.v1.BuildLogStep steps = 8;</code>
   */
  int getStepsCount();
  /**
   * <code>repeated .estafette.ci.contracts.v1.BuildLogStep steps = 8;</code>
   */
  java.util.List<? extends com.estafette.ci.contracts.v1.BuildLogStepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.BuildLogStep steps = 8;</code>
   */
  com.estafette.ci.contracts.v1.BuildLogStepOrBuilder getStepsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 9;</code>
   */
  boolean hasInsertedAtTime();
  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 9;</code>
   */
  com.google.protobuf.Timestamp getInsertedAtTime();
  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInsertedAtTimeOrBuilder();
}