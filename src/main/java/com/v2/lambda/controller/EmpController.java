package com.v2.lambda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2.lambda.model.Employee;
import com.v2.lambda.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	private EmployeeService empService;

	// Save operation
	@PostMapping("/emp")
	public Employee saveEmployyee(@RequestBody Employee employyee) {
		return empService.saveEmployee(employyee);
	}

	// Read operation
	@GetMapping("/emp")
	public List<Employee> fetchEmployyeeList() {
		return empService.fetchEmployee();
	}

	// Update operation
	@PutMapping("/emp/{id}")
	public Employee updateDepartment(@RequestBody Employee employyee, @PathVariable("id") Long empId) {
		return empService.updateEmployyee(employyee, empId);
	}

	// Delete operation
	@DeleteMapping("/emp/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long empId) {
		empService.deleteEmployeeById(empId);
		return "Deleted Successfully";
	}

}
