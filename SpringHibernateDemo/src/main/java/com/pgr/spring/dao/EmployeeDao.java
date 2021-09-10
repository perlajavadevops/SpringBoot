package com.pgr.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pgr.spring.beans.Employee;

@Transactional
public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveEmployee(Employee employee) {
		hibernateTemplate.save(employee);
	}

	public void deleteEmployee(int empno) {
		Employee emp = hibernateTemplate.get(Employee.class, empno);
		hibernateTemplate.delete(emp);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		
		return hibernateTemplate.execute(new HibernateCallback<List<Employee>>() {

			@Override
			public List<Employee> doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery("from Employee");//select * from emp;
		        List<Employee> list = query.list();
		        return list;
			}
		});

	}
	
	public Employee getEmployeeById(int empno) {
		Employee emp = hibernateTemplate.get(Employee.class, empno);
		return emp;
		
	}

}
