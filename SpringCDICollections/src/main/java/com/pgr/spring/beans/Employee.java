package com.pgr.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List<String> namesList;
	private Set<String> namesSet;
	private Map<String, Integer> namesMap;


	public Employee(List<String> namesList, Set<String> namesSet, Map<String, Integer> namesMap) {
		System.out.println("Hi 3-arg con");
		this.namesList = namesList;
		this.namesSet = namesSet;
		this.namesMap = namesMap;
	}
	
	public void displayStudent(){
		System.out.println("Student Details are: ");
		System.out.println(namesList);
		System.out.println(namesSet);
		System.out.println(namesMap);
	}

	
}
