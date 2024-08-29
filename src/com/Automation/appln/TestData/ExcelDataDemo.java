package com.Automation.appln.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Automation.Utilites.Filepaths;

public class ExcelDataDemo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip =new FileInputStream(Filepaths.excelFilepath);
	Workbook workbook=WorkbookFactory.create(fip);
	int activesheet=workbook.getActiveSheetIndex();
	System.out.println(activesheet);
	
	int noofsheets=workbook.getNumberOfSheets();
	System.out.println(noofsheets);
	
  Sheet sheet=workbook.getSheet("Job_Details");
  
  Row row0=sheet.getRow(0);
  int row0cellcount=row0.getLastCellNum();
  System.out.println(row0cellcount);
  
  Cell cell00=row0.getCell(0);
  if(cell00.getCellType()==CellType.NUMERIC) {
	  String cell00value= cell00.getNumericCellValue()+" ";
	  System.out.println(cell00value);
  }
  else
	  if(cell00.getCellType()==CellType.BOOLEAN) {
		String cell00value=  cell00.getBooleanCellValue()+" ";
		System.out.println(cell00value);
	  }
	  else 
		  
			  if(cell00.getCellType()==CellType.STRING) {
				String cell00value=  cell00.getStringCellValue()+" ";
				System.out.println(cell00value);
			  
	  }
  
  Cell cell01=row0.getCell(1);
  if(cell01.getCellType()==CellType.NUMERIC) {
	  String cell01value= cell01.getNumericCellValue()+" ";
	  System.out.println(cell01value);
  }
  else
	  if(cell01.getCellType()==CellType.BOOLEAN) {
		String cell01value=  cell01.getBooleanCellValue()+" ";
		System.out.println(cell01value);
	  }
	  else 
		  
			  if(cell01.getCellType()==CellType.STRING) {
				String cell01value=  cell01.getStringCellValue()+" ";
				System.out.println(cell01value);
			  
	  }
  
  
  Row row1=sheet.getRow(1);
 int row1cellcount= row1.getLastCellNum();
 System.out.println(row1cellcount);
 
 Cell cell10=row1.getCell(0);
 if(cell10.getCellType()==CellType.NUMERIC) {
	  String cell10value= cell10.getNumericCellValue()+" ";
	  System.out.println(cell10value);
 }
 else
	  if(cell10.getCellType()==CellType.BOOLEAN) {
		String cell10value=  cell10.getBooleanCellValue()+" ";
		System.out.println(cell10value);
	  }
	  else 
		  
			  if(cell10.getCellType()==CellType.STRING) {
				String cell10value=  cell10.getStringCellValue()+" ";
				System.out.println(cell10value);
			  
	  }
 
 Cell cell11=row1.getCell(1);
 if(cell11.getCellType()==CellType.NUMERIC) {
	  String cell11value= cell11.getNumericCellValue()+" ";
	  System.out.println(cell11value);
 }
 else
	  if(cell11.getCellType()==CellType.BOOLEAN) {
		String cell11value=  cell11.getBooleanCellValue()+" ";
		System.out.println(cell11value);
	  }
	  else 
		  
			  if(cell11.getCellType()==CellType.STRING) {
				String cell11value=  cell11.getStringCellValue()+" ";
				System.out.println(cell11value);
			  
	  }
  
}
}
