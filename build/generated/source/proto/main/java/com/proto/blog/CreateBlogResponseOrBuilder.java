// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

public interface CreateBlogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blog.CreateBlogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  boolean hasBlog();
  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  com.proto.blog.Blog getBlog();
  /**
   * <pre>
   * Will return the id of Blog created in mongoDB
   * </pre>
   *
   * <code>.blog.Blog blog = 1;</code>
   */
  com.proto.blog.BlogOrBuilder getBlogOrBuilder();
}
