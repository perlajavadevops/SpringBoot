package com.pgr.spring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pgr.spring.beans.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveEmployee(Employee employee) {
		// insert into emp values(103,'Siri',9000);
		String saveQuery = "insert into employee values" + "(" + employee.getEmpno() + ",'" + employee.getName() + "',"
				+ employee.getSalary() + ")";
		jdbcTemplate.update(saveQuery);
	}

	public boolean udpateEmployeePS(Employee employee) {
		// insert into emp values(103,'Siri',9000);
		String updateQuery = "update employee set name=?, salary=? where empno=?";
		return jdbcTemplate.execute(updateQuery, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, employee.getName());
				ps.setDouble(2, employee.getSalary());
				ps.setInt(3, employee.getEmpno());
				return ps.execute();

			}
		});
	}
	
	public boolean deleteEmployeePS(int empno) {
		// insert into emp values(103,'Siri',9000);
		String updateQuery = "delete from employee where empno=?";
		return jdbcTemplate.execute(updateQuery, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, empno);
				return ps.execute();

			}
		});
	}

	public boolean saveEmployeeByPS(Employee employee) {

		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, employee.getEmpno());
				ps.setString(2, employee.getName());
				ps.setDouble(3, employee.getSalary());

				return ps.execute();

			}
		});
	}

	public List<Employee> getAllEmployees() {

		String selectQuery = "select * from employee";
		return jdbcTemplate.query(selectQuery, new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Employee> employees = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
					employees.add(emp);
				}

				return employees;

			}

		});
	}
	
	public List<Employee> getEmployeeById(int empno) {

		String selectQuery = "select * from employee where empno = "+empno;
		return jdbcTemplate.query(selectQuery, new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Employee> employees = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
					employees.add(emp);
				}

				return employees;

			}

		});
	}

}
