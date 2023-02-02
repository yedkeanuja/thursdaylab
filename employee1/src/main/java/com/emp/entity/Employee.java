package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private long empId;
	private String name;
	private double salary;
	
	//entity refrence
	Address address;//HAS-Arelationship
	
}
