// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/release.proto

package com.estafette.ci.contracts.v1;

public interface ReleaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:estafette.ci.contracts.v1.Release)
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
   * <code>string action = 2;</code>
   */
  java.lang.String getAction();
  /**
   * <code>string action = 2;</code>
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <code>string id = 3;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 3;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string repo_source = 4;</code>
   */
  java.lang.String getRepoSource();
  /**
   * <code>string repo_source = 4;</code>
   */
  com.google.protobuf.ByteString
      getRepoSourceBytes();

  /**
   * <code>string repo_owner = 5;</code>
   */
  java.lang.String getRepoOwner();
  /**
   * <code>string repo_owner = 5;</code>
   */
  com.google.protobuf.ByteString
      getRepoOwnerBytes();

  /**
   * <code>string release_version = 6;</code>
   */
  java.lang.String getReleaseVersion();
  /**
   * <code>string release_version = 6;</code>
   */
  com.google.protobuf.ByteString
      getReleaseVersionBytes();

  /**
   * <code>string release_status = 7;</code>
   */
  java.lang.String getReleaseStatus();
  /**
   * <code>string release_status = 7;</code>
   */
  com.google.protobuf.ByteString
      getReleaseStatusBytes();

  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 8;</code>
   */
  java.util.List<com.estafette.ci.manifest.v1.EstafetteEvent> 
      getEventsList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 8;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteEvent getEvents(int index);
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 8;</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 8;</code>
   */
  java.util.List<? extends com.estafette.ci.manifest.v1.EstafetteEventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 8;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteEventOrBuilder getEventsOrBuilder(
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

  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 10;</code>
   */
  boolean hasUpdatedAtTime();
  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 10;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAtTime();
  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtTimeOrBuilder();

  /**
   * <code>.google.protobuf.Duration duration = 11;</code>
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 11;</code>
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 11;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}
