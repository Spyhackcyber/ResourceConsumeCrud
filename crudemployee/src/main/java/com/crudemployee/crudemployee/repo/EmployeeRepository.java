package com.crudemployee.crudemployee.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.crudemployee.crudemployee.entity.Employee;


//public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

		         
	
@Query(nativeQuery = true,value="SELECT emp_name FROM employee where emp_name like :n")
public List<String> getUserHeloo(@Param("n") String name);
	
}
