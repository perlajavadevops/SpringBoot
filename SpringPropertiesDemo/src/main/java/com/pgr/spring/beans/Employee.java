package com.pgr.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:config/application.properties")
public class Employee {

	
	private int empId;
	@Value(value="${url}")
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


	public void displayEmployee(){
		System.out.println("Employee Details are: ");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
	}

}
