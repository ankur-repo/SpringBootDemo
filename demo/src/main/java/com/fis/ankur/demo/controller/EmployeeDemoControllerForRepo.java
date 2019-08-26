package com.fis.ankur.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fis.ankur.demo.exception.RecordNotFoundException;
import com.fis.ankur.demo.pojoobject.Employee;
import com.fis.ankur.demo.service.EmployeeDemoService;

@RestController
@RequestMapping("repocontroller")
public class EmployeeDemoControllerForRepo {
	
	@Autowired
	@Qualifier("EmployeeDemoServiceForRepoImpl")
	EmployeeDemoService employeeService;
	
	@RequestMapping(value = "/repoemployees")
	public List<Employee> getEmployeeList() {
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(value = "/repoemployee/{empId}")
	public Employee getEmployee(@PathVariable String empId) throws RecordNotFoundException {
		return employeeService.getEmployee(empId);
	}
	
	@RequestMapping(value="/repoemployee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}
	
	@RequestMapping(value="/updaterepoemployee/{id}", method= RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee emp, @PathVariable String id) {
		employeeService.updateEmployee(emp, id);
	}
	
	@RequestMapping(value="/removeemployee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}

}
