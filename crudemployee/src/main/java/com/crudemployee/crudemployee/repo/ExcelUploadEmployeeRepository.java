package com.crudemployee.crudemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudemployee.crudemployee.entity.ExcelUploadEmployee;

public interface ExcelUploadEmployeeRepository extends JpaRepository<ExcelUploadEmployee, Integer> {

}
