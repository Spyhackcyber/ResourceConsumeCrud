package com.crudemployee.crudemployee.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.crudemployee.crudemployee.entity.ExcelUploadEmployee;
import com.crudemployee.crudemployee.repo.ExcelUploadEmployeeRepository;
import com.crudemployee.crudemployee.utils.ExcelUtils;

@Service
public class ExcelUploadEmployeeService {

	@Autowired
	private ExcelUploadEmployeeRepository ExcelEmpRepo;
	
	public void save(MultipartFile file) {
		
		try {
			List<ExcelUploadEmployee> ExcelEmp=ExcelUtils.convertExceltoListofEmployee(file.getInputStream());
			this.ExcelEmpRepo.saveAll(ExcelEmp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<ExcelUploadEmployee> getAllEmploye(){
		return this.ExcelEmpRepo.findAll();
		
	}

}
