package com.fis.ankur.demo.service;

import java.util.List;

import com.fis.ankur.demo.exception.RecordNotFoundException;
import com.fis.ankur.demo.pojoobject.Employee;

public interface EmployeeDemoService {

	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(String empId) throws RecordNotFoundException;
	
	public void addEmployee(Employee emp);
	
	public void updateEmployee(Employee emp, String Id);
	
	public void deleteEmployee(String id);
}
