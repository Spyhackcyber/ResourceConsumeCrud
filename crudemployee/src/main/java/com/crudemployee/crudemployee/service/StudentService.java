package com.crudemployee.crudemployee.service;

import java.util.List;

import com.crudemployee.crudemployee.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	
	public String addorUpdateStudent(Student std);
	
}
