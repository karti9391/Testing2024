package com.Automation.appln.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderDemo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\Automation\\appln\\TestData\\TestData (2).xlsx");
	
	Workbook workbook=WorkbookFactory.create(fip);
	
	int activesheet=workbook.getActiveSheetIndex();
	System.out.println("Active sheet name is: "+activesheet);
	
	int numofsheets=workbook.getNumberOfSheets();
	System.out.println("get num of sheets are: "+numofsheets);
	
	Sheet sheet=workbook.getSheet("Job_Details");
	
	// get the data from excel sheet
	
	Row row0=sheet.getRow(0);
	int cellsInrow0=row0.getLastCellNum();
	System.out.println("no of cells in Rows: "+cellsInrow0);
	
	Cell cell00=row0.getCell(0);
	String cell00value=cell00.getStringCellValue();
	System.out.println("0th row & 0th cell : "+cell00value);
	
	Cell cell01=row0.getCell(1);
	String cell01value=cell01.getStringCellValue();
	System.out.println("0th row & 1st cell : "+cell01value);
	
	Cell cell02=row0.getCell(2);
	String cell02value=cell02.getStringCellValue();
	System.out.println("0th row & 2nd cell : "+cell02value);
	
	Row row1=sheet.getRow(1);
	int cellsInRow1=row1.getLastCellNum();
	System.out.println("cells in row1 is: "+cellsInRow1);
	
	Cell cell10=row1.getCell(0);
	String cell10value=cell10.getStringCellValue();
	System.out.println("1st row & 0th cell: "+cell10value);
	
	Cell cell11=row1.getCell(1);
	String cell11value=cell11.getStringCellValue();
	System.out.println("1st row & 1st cell: "+cell11value);
	
	Cell cell12=row1.getCell(2);
	String cell12value=cell12.getStringCellValue();
	System.out.println("1st row & 2nd cell: "+cell12value);
	
	
	Row row2=sheet.getRow(2);
	int cellsInRow2=row2.getLastCellNum();
	System.out.println("cells in row2 is: "+cellsInRow2);
	
	Cell cell20=row2.getCell(0);
	String cell20value=cell20.getStringCellValue();
	System.out.println("2nd row & 0th cell: "+cell20value);
	
	Cell cell21=row2.getCell(1);
	String cell21value=cell21.getStringCellValue();
	System.out.println("2nd row & 1st cell: "+cell11value);
	
	Cell cell22=row2.getCell(2);
	String cell22value=cell22.getStringCellValue();
	System.out.println("2nd row & 2nd cell: "+cell22value);
	
	
}
}
