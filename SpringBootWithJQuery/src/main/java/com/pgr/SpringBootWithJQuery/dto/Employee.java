package com.pgr.SpringBootWithJQuery.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer id;

	private String name;

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private Double salary;

	private Boolean status;

}

