package com.sparkle.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Document(collection="order")
@Data
public class Order {
  @Id
  @Field("_Id")
  String id;
  String customerName;
  long phnNumber;
  String email;
  String orderId;
  long trackingId;
  Date shipDate;
  Date deliveryDate;
  String shipAddress;
  String billingAddress;
  float totalPrice;
  String orderStatus;
  boolean deliveryStatus;
}



