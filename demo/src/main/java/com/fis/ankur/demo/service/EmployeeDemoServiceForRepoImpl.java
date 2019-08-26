package com.fis.ankur.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fis.ankur.demo.exception.RecordNotFoundException;
import com.fis.ankur.demo.pojoobject.Employee;
import com.fis.ankur.demo.repository.EmployeeDemoRepository;

@Service
@Qualifier("EmployeeDemoServiceForRepoImpl")
public class EmployeeDemoServiceForRepoImpl implements EmployeeDemoService{
	
	@Autowired
	EmployeeDemoRepository repository;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		repository.findAll().forEach(empList::add);
		return empList;
	}

	@Override
	public Employee getEmployee(String empId) throws RecordNotFoundException {
		Optional<Employee> empObj = repository.findById(empId);
		if(!empObj.isPresent()) {
			throw new RecordNotFoundException(" Employee id is not valid: " +empId);
		}
		return empObj.get(); 
	}

	@Override
	public void addEmployee(Employee emp) {
		repository.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, String Id) {
		
		
	}

	@Override
	public void deleteEmployee(String id) {
		//repository.delete(arg0);
		
	}

}
