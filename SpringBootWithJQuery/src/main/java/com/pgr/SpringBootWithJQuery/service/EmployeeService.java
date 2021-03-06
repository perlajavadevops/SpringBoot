package com.pgr.SpringBootWithJQuery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgr.SpringBootWithJQuery.entity.Employee;
import com.pgr.SpringBootWithJQuery.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployeeList() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();
	}

	public void saveOrUpdateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}

}