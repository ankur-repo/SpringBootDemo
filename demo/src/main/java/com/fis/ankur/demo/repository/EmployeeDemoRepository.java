package com.fis.ankur.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fis.ankur.demo.pojoobject.Employee;

@Repository
public interface EmployeeDemoRepository extends CrudRepository<Employee, String>{

}
