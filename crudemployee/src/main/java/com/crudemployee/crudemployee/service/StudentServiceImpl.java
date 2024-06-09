package com.crudemployee.crudemployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudemployee.crudemployee.entity.Student;
import com.crudemployee.crudemployee.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	 private  StudentRepository stdRepo;
	 
		public StudentServiceImpl(StudentRepository stdRepo) {
	  
	  this.stdRepo = stdRepo; }
	 
	
	
	
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------------------");
		
		String qq="Amit";
		
		//List<String> emp12345=empRepo.getUserHeloo(qq);
		
	//	System.out.println("---------------------------emp12345"+emp12345);
		
		
		return stdRepo.findAll();
	}
	
	
	@Override
	public String addorUpdateStudent(Student std) {
		
		Long empid=std.getId();
		System.out.println(std);
		
		
		stdRepo.save(std);
		System.out.println(std);
		if (empid==null)
		{
		
		return "Record Inserted";}
		else{
		return "Record Updated";	
		}
	}
}
	