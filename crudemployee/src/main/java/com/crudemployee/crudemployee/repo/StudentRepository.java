package com.crudemployee.crudemployee.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.crudemployee.crudemployee.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Serializable>{

}
