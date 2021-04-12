package com.pgr.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*Employee emp = new Employee(101, "PerlaReddy", 2000.9);
		emp.displayStudent();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp3 = (Employee) context.getBean("employee");
		System.out.println(emp3.hashCode());
		emp3.displayStudent();
	}
}
