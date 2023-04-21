package com.v2.lambda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "employee")   
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  empId;
	private String empName;
	private String address;
	private String sal;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String address, String sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", sal=" + sal + "]";
	}
}
