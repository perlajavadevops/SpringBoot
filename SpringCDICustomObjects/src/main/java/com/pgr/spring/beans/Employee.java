package com.pgr.spring.beans;

import java.util.List;

public class Employee {

	private int empId;
	private String name;
	private Address address;
	
	public Employee() {
		System.out.println("Hi 0-arg con");
	}
	
	


	public Employee(int empId, String name, Address address) {
		System.out.println("Hi 3-arg con");
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	public void displayStudent(){
		System.out.println("Student Details are: ");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(address);
	}

	
}
