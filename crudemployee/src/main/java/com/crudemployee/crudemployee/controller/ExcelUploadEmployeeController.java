package com.crudemployee.crudemployee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.crudemployee.crudemployee.entity.Employee;
import com.crudemployee.crudemployee.entity.ExcelUploadEmployee;
import com.crudemployee.crudemployee.service.ExcelUploadEmployeeService;
import com.crudemployee.crudemployee.utils.ExcelUtils;


@RestController
@CrossOrigin("*")
public class ExcelUploadEmployeeController {

	@Autowired
	private ExcelUploadEmployeeService excelempservice;
	
	@PostMapping("/emp/upload")
	public ResponseEntity<?> UploadExcel (@RequestParam("file") MultipartFile file){
		
		if(ExcelUtils.CheckExcelFormat(file)) {
			this.excelempservice.save(file);
			return ResponseEntity.ok(Map.of("message","File is Uploaded successfully and Saved in Database"));
		}
		
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please Upload Excel File Only");
	}
	
	@GetMapping("/emp/uploadedData")
	public List<ExcelUploadEmployee> getAllProduct(){
		return this.excelempservice.getAllEmploye();
		
	}
	
}
