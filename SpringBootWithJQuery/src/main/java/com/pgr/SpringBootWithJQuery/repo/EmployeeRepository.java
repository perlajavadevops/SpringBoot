package com.pgr.SpringBootWithJQuery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgr.SpringBootWithJQuery.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
