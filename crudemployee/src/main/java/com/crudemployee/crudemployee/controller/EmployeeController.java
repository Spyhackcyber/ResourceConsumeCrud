package com.crudemployee.crudemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudemployee.crudemployee.entity.Employee;
import com.crudemployee.crudemployee.entity.Student;
import com.crudemployee.crudemployee.service.EmployeeService;
import com.crudemployee.crudemployee.service.StudentService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@Autowired
	private StudentService stdservice;
	
	
	
	@PostMapping("/emp")
	public ResponseEntity<String> addEmployee (@RequestBody Employee emp){
		
		String msg =empservice.addorUpdateEmployee(emp);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/std")
	public ResponseEntity<String> addStudent (@RequestBody Student Std){
		
		String msg =stdservice.addorUpdateStudent(Std);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> getAllBooks(){
		List<Employee> allEmployee=empservice.getAllBooks();
		return new ResponseEntity<>(allEmployee, HttpStatus.OK);
	}
	
	
	@GetMapping("/std")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> allStudent=stdservice.getAllStudent();
		return new ResponseEntity<>(allStudent, HttpStatus.OK);
	}
	
	
	@PutMapping("/emp")
	public ResponseEntity<String> updateEmployee (@RequestBody Employee emp){ 
	
		String msg =empservice.addorUpdateEmployee(emp);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{empId}")
	public ResponseEntity<String> deleteEmployee (@PathVariable Integer empId){ 
	
		String msg=empservice.delete(empId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
}
