package com.pgr.spring.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*List<String> names = new ArrayList<String>();
		names.add("Siri");
		names.add("Karthik");
		names.add("Teja");
		Employee emp = new Employee(101, "PerlaReddy", 2000.9, names);
		emp.displayStudent();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp3 = (Employee) context.getBean("employee");
		emp3.displayEmployee();
		
	}
}
