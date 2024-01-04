package com.sparkle.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection="student")
@Data
public class Student {
   @Id
   @Field("_id")
   private String id;
   private String fname;
   private String lname;
   private String gender;
   private long phnNo;
   private String address;
   private String course;
   private int sec;
   private String profName;
   private boolean enrolled_status;
   private String intake;
   private int year;
   
}

