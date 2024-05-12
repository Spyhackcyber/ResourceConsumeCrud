package com.crudemployee.crudemployee.utils;

import java.io.InputStream;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.crudemployee.crudemployee.entity.ExcelUploadEmployee;

public class ExcelUtils {

	
	//Check File is of Excel Type or not
public static boolean CheckExcelFormat(MultipartFile file) {
	
	String contentType=file.getContentType();
	if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
		return true;
	}else {
		return false;
	}
}

//Convert Excel to List of Employee
@SuppressWarnings("resource")
public static List<ExcelUploadEmployee> convertExceltoListofEmployee(InputStream is){
	
	List<ExcelUploadEmployee> Emplist=new ArrayList<>();
	
	try {
		
		XSSFWorkbook workbook =new XSSFWorkbook(is);
		//workbook.getSheetAt("data");
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rowNumber=0;
		
		Iterator<Row> iterator=sheet.iterator();
		while(iterator.hasNext()) {
			
			Row row= iterator.next();
			if(rowNumber==0) {
				rowNumber++;
				continue;
			}
			
		Iterator<Cell> cells=	row.iterator();
		
		int cid=0;
		
		ExcelUploadEmployee ExcelEmp=new ExcelUploadEmployee();
		
		while (cells.hasNext())
		{
			Cell cell =cells.next();
			
			System.out.println(cell);
			
			switch(cid) {
			case 0: ExcelEmp.setId((int)cell.getNumericCellValue());
			break;
			case 1: ExcelEmp.setEmp_name(cell.getStringCellValue());
			break;
			case 2: ExcelEmp.setEmp_email(cell.getStringCellValue());
			break;
			case 3: ExcelEmp.setEmp_phone(cell.getStringCellValue().toString());
			break;
			case 4: ExcelEmp.setEmp_location(cell.getStringCellValue());
			break;
			default:
				break;
			}
			cid++;
		
			ExcelEmp.setDelflag("Y");
			
		}
		
		Emplist.add(ExcelEmp);
		
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return Emplist;
}
	
}
