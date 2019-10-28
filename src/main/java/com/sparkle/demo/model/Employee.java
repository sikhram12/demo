package com.sparkle.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "employee")
@Data
public class Employee {
	
	@Id
	@Field("_id")
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String experience;
	private long phone;
	private String streetAdress;
	private String city;
	private String state;
	private String zipcode;
	private int workingDays;
	private Date joinDate;

}
