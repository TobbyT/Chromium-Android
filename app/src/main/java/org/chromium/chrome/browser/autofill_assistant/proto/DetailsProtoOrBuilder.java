// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DetailsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string title = 1;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 1;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string url = 2;</code>
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 2;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 2;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional .autofill_assistant.DateTimeProto datetime = 3;</code>
   */
  boolean hasDatetime();
  /**
   * <code>optional .autofill_assistant.DateTimeProto datetime = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getDatetime();

  /**
   * <code>optional string description = 4;</code>
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Mid that comes from Knowledge Graph. Uniquely identify the object that this
   * proto describes.
   * </pre>
   *
   * <code>optional string m_id = 5;</code>
   */
  boolean hasMId();
  /**
   * <pre>
   * Mid that comes from Knowledge Graph. Uniquely identify the object that this
   * proto describes.
   * </pre>
   *
   * <code>optional string m_id = 5;</code>
   */
  java.lang.String getMId();
  /**
   * <pre>
   * Mid that comes from Knowledge Graph. Uniquely identify the object that this
   * proto describes.
   * </pre>
   *
   * <code>optional string m_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getMIdBytes();

  /**
   * <pre>
   * Price label containing the total amount and the currency to pay, formatted
   * in the client's locale (e.g., $123.00).
   * </pre>
   *
   * <code>optional string total_price = 6;</code>
   */
  boolean hasTotalPrice();
  /**
   * <pre>
   * Price label containing the total amount and the currency to pay, formatted
   * in the client's locale (e.g., $123.00).
   * </pre>
   *
   * <code>optional string total_price = 6;</code>
   */
  java.lang.String getTotalPrice();
  /**
   * <pre>
   * Price label containing the total amount and the currency to pay, formatted
   * in the client's locale (e.g., $123.00).
   * </pre>
   *
   * <code>optional string total_price = 6;</code>
   */
  com.google.protobuf.ByteString
      getTotalPriceBytes();
}
