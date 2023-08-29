package com.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Employee;

@Component
public interface EmpDAO {
	Employee getEmployeeByNo(Integer eno);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Employee e);

	boolean updateEmployee(Employee e);

	boolean createEmployee(Employee e);
}
