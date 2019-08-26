package com.fis.ankur.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fis.ankur.demo.pojoobject.Employee;
import com.fis.ankur.demo.repository.EmployeeDemoRepository;

@Service
@Qualifier("EmployeeDemoServiceImpl")
public class EmployeeDemoServiceImpl implements EmployeeDemoService {
	
	

	List<Employee> empList = new ArrayList(Arrays.asList(new Employee("FIS100", "Ankur", "FIS", "1000"),
			new Employee("FIS200", "Ravi", "FIS", "5000"), new Employee("FIS300", "Kolla", "FIS", "8000"),
			new Employee("FIS400", "Anil", "FIS", "6000")));

	public List<Employee> getAllEmployee() {
		return empList;
	}
	
	public Employee getEmployee(String empId) {
		for(Employee e : empList) {
			if(e.getEmpId().equals(empId)) {
				return e;
			}
		}
		return null;
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
		
	}

	public void updateEmployee(Employee emp, String id) {
		for(int i=0; i<empList.size();i++) {
			if(empList.get(i).getEmpId().equals(id)) {
				empList.set(i,  emp);
			}
		}
		
	}
	
	public void deleteEmployee(String id) {
		empList.removeIf((e)->e.getEmpId().equals(id));
	}

}
