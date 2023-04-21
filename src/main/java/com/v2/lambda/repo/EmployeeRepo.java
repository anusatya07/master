package com.v2.lambda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.v2.lambda.model.Employee;

@Repository
public interface EmployeeRepo extends  JpaRepository<Employee, Long>   {

}
