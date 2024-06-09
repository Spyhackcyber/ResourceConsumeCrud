package com.crudemployee.crudemployee.service;

import java.util.List;

import com.crudemployee.crudemployee.entity.Employee;
import com.crudemployee.crudemployee.entity.Student;

public interface EmployeeService {

	public String addorUpdateEmployee(Employee emp);
	
	public List<Employee> getAllBooks();
	
	//public String updateBook(Employee emp) ;
	
	public String  delete(Integer id);
	

}
