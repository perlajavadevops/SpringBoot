package com.pgr.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp3 = (Employee) context.getBean("employee");
		System.out.println(emp3.hashCode());
		emp3.displayEmployee();
	}
}
