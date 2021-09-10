package com.pgr.spring.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee23")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
	
	
	private String name;
	private double salary;

	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	/*public Employee() {

	}*/
	
	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
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

	public void displayEmployee() {
		System.out.println("Employee Details are: ");
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary);
	}

}
