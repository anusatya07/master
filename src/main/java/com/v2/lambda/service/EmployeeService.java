package com.v2.lambda.service;

import java.util.List;

import com.v2.lambda.model.Employee;


public interface EmployeeService {

	void deleteEmployeeById(Long empId);

	Employee updateEmployyee(Employee employyee, Long departmentId);

	List<Employee> fetchEmployee();

	Employee saveEmployee(Employee employyee);

}
