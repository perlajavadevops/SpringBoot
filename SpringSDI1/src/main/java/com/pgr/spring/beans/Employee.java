package com.pgr.spring.beans;

public class Employee {

	private int empId;
	private String name;
	private double salary;

	
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void displayStudent(){
		System.out.println("Student Details are: ");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
	}

}
