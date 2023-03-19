package com.spring.jdbc.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

private Long id;
	
	private String name;
	
	private String location;
	
	private Date dateOfBirth;
	
	private String department;
	
	public Employee(String name,String location,Date dateOfBirth){
		this.name=name;
		this.location=location;
		this.dateOfBirth=dateOfBirth;
	}
}
