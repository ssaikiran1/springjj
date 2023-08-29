package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

		Employee emp = new Employee();
		emp.setEmpNo(resultSet.getInt("empNo"));
		emp.setEName(resultSet.getString("eName"));
		emp.setJob(resultSet.getString("job"));
		emp.setSalary(resultSet.getDouble("salary"));
		emp.setDeptNo(resultSet.getInt("deptNo"));
		return emp;
	}
}
