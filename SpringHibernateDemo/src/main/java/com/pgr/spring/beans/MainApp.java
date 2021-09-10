package com.pgr.spring.beans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pgr.spring.dao.EmployeeDao;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		//employeeDao.saveEmployee(new Employee(4, "Dhatrika", 1000));
		/*boolean flag = employeeDao.saveEmployeeByPS(new Employee(104, "Mahesh", 90000));
		System.out.println(flag);*/
		
		List<Employee> list = employeeDao.getAllEmployees();
		//System.out.println(employeeDao.getEmployeeById(102));
		for(Employee emp : list) {
			System.out.println(emp);
		}
		//System.out.println(list);
		
		//employeeDao.udpateEmployeePS(new Employee(103, "Sai", 20000));
		
		//employeeDao.deleteEmployee(102);
	}//save, retreiving,( delete, update)
	
}
