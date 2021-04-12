package com.pgr.spring.beans;

public class Employee {

	private int empId;
	private String name;
	private Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayEmployee() {
		System.out.println("Employee Details are: ");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(address);
	}

}
