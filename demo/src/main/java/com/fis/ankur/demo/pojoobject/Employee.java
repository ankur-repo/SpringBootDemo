package com.fis.ankur.demo.pojoobject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String empId;
	private String empName;
	private String empCompany;
	private String empSalary;
	
	public Employee() {
		
	}
	public Employee(String empId, String empName, String empCompany, String empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
		this.empSalary = empSalary;
	}
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
