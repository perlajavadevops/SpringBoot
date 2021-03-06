package com.pgr.SpringBootWithJQuery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(initialValue = 1, name = "emp_seq", sequenceName = "employee_sequence")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "dop")
	private String dop;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "status")
	private Boolean status;

}
