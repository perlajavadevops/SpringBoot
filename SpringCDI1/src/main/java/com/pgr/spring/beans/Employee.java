package com.pgr.spring.beans;

public class Employee {

	private int empId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Hi 0-arg con");
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empId, String name, double salary) {
		System.out.println("Hi 3-arg con");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void displayStudent() {
		System.out.println("Student Details are: ");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
	}

}
