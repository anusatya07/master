package com.v2.lambda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2.lambda.model.Employee;
import com.v2.lambda.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee saveEmployee(Employee employyee) {
		return repo.save(employyee);
	}

	@Override
	public List<Employee> fetchEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee updateEmployyee(Employee employyee, Long empId) {
		Employee empUptade = new Employee();
		Optional<Employee> empOnj = repo.findById(empId);
		empUptade = empOnj.get();
		empUptade.setAddress(employyee.getAddress());
		empUptade.setEmpName(employyee.getEmpName());
		empUptade.setSal(employyee.getSal());
		return repo.save(empUptade);
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		Optional<Employee> emp = repo.findById(empId);
		if (emp.isPresent()) {
			Employee empObj = emp.get();
			repo.delete(empObj);
		}

	}

	
}
