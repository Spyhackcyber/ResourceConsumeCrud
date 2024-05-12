package com.crudemployee.crudemployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudemployee.crudemployee.entity.Employee;
import com.crudemployee.crudemployee.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	 private  EmployeeRepository empRepo;
	 
	
	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		
		this.empRepo = empRepo;
	}

	@Override
	public String addorUpdateEmployee(Employee emp) {
		
		Long empid=emp.getId();
		System.out.println(emp);
		
		
		empRepo.save(emp);
		System.out.println(emp);
		if (empid==null)
		{
		
		return "Record Inserted";}
		else{
		return "Record Updated";	
		}
	}

	@Override
	public List<Employee> getAllBooks() {
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------------------");
		
		String qq="Amit";
		
		List<String> emp12345=empRepo.getUserHeloo(qq);
		
		System.out.println("---------------------------emp12345"+emp12345);
		
		
		return empRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		return "Book Deleted";
	}

}
