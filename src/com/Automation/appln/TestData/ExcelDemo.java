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

public class ExcelDemo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream(Filepaths.excelFilepath);
	
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet=workbook.getSheet("Job_Details");
	
	for(int i=0;i<=sheet.getLastRowNum();i++) {
		Row row=sheet.getRow(i);
		
		for(int j=0;j<=row.getLastCellNum();j++) {
			Cell cell = row.getCell(j);
			
			if(cell.getCellType()==CellType.NUMERIC) {
				  String cellvalue= cell.getNumericCellValue()+" ";
				  System.out.println(cellvalue);
			  }
			  else
				  if(cell.getCellType()==CellType.BOOLEAN) {
					String cellvalue=  cell.getBooleanCellValue()+" ";
					System.out.println(cellvalue);
				  }
				  else 
					  
						  if(cell.getCellType()==CellType.STRING) {
							String cellvalue=  cell.getStringCellValue();
							System.out.println(cellvalue);
						  
				  }
			  
		}
	}
	
			
}
}
