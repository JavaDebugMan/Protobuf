// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.rayvision.rpc.dto.user;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userService_RequestUserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userService_RequestUserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userService_ResponseUserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userService_ResponseUserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\013userService\"!\n\017RequestUser" +
      "Info\022\016\n\006userId\030\001 \001(\003\"4\n\020ResponseUserInfo" +
      "\022\016\n\006userId\030\001 \001(\003\022\020\n\010userName\030\002 \001(\t2[\n\013Us" +
      "erSerivce\022L\n\013GetUserInfo\022\034.userService.R" +
      "equestUserInfo\032\035.userService.ResponseUse" +
      "rInfo\"\000B*\n\032com.rayvision.rpc.dto.userB\004U" +
      "serP\001\242\002\003RTGb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_userService_RequestUserInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_userService_RequestUserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userService_RequestUserInfo_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_userService_ResponseUserInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_userService_ResponseUserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userService_ResponseUserInfo_descriptor,
        new java.lang.String[] { "UserId", "UserName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
