// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

public interface FeatureDatabaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:routeguide.FeatureDatabase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .routeguide.Feature feature = 1;</code>
   */
  java.util.List<Feature>
      getFeatureList();
  /**
   * <code>repeated .routeguide.Feature feature = 1;</code>
   */
  Feature getFeature(int index);
  /**
   * <code>repeated .routeguide.Feature feature = 1;</code>
   */
  int getFeatureCount();
  /**
   * <code>repeated .routeguide.Feature feature = 1;</code>
   */
  java.util.List<? extends FeatureOrBuilder>
      getFeatureOrBuilderList();
  /**
   * <code>repeated .routeguide.Feature feature = 1;</code>
   */
  FeatureOrBuilder getFeatureOrBuilder(
      int index);
}
