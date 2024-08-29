package com.Automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Automation.Utilites.Filepaths;
import com.Automation.customisedException.FrameworkException;

public class ExcelReader {
	private String filepath;
	private FileInputStream fip ;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private int index;
	private String value;
	
	
	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath=filepath;
		 fip = new FileInputStream(Filepaths.excelFilepath);
		 workbook=WorkbookFactory.create(fip);
	}
	
	public Sheet getsheetobj(String how,String value) throws FrameworkException {
		if(workbook!=null) {
			if(how.equalsIgnoreCase("sheetName")) {
				 sheet=workbook.getSheet(value);
			}
			else 
			if(how.equalsIgnoreCase("index")) {
				 index=Integer.parseInt(value);
				sheet= workbook.getSheetAt(index);
			}
			else {
				// throw exception
				FrameworkException exception = new FrameworkException("Workbook is pointing to null");
				System.out.println(exception);
				throw exception;
			}
		}
		return sheet;
	}
	
	// get the cell data from Excel
	
	public String getcellData(String how, String value, int cellNum) throws FrameworkException {
		sheet=getsheetobj(how, value);
		if(sheet!=null) {
			 row=sheet.getRow(cellNum);
		}
		if(row!=null) {
			cell=row.getCell(cellNum);
		}
		if(cell!=null) {
			if(cell.getCellType()==CellType.NUMERIC) {
				value = cell.getNumericCellValue()+" ";
			}
			else {
				if(cell.getCellType()==CellType.BOOLEAN) {
					value = cell.getBooleanCellValue()+" ";
				}
				else {
					if(cell.getCellType()==CellType.STRING) {
						value = cell.getStringCellValue()+" ";
					}
				
			
					else {
						System.out.println("cell is pointing to null");
					}
					
						
					
				}
				
				 System.out.println("row is pointing to null");
			}
			}
			else {
				//throw exception
				FrameworkException exception = new FrameworkException("Sheet is pointing to null");
				System.out.println(exception);
				throw exception;
			}
			
					
		
      return value;
			
	}
	
	// i want to get the row Data from Excel
	public List<String> getRowData(String how,String value, int rowNum) throws FrameworkException {
		List<String> rowData = new ArrayList<String>();
     Sheet sheet=getsheetobj(how, value);
     Row row=sheet.getRow(rowNum);
     for(int i=0;i<=row.getLastCellNum();i++) {
    	 Cell cell=row.getCell(i);
    	 if(cell.getCellType()==CellType.BOOLEAN) {
    		  value=cell.getBooleanCellValue()+" ";
    		  rowData.add(value);
    	 }
    	 else if(cell.getCellType()==CellType.NUMERIC) {
    		 value=cell.getNumericCellValue()+" ";
    		 rowData.add(value);
    	 }
    	 else if(cell.getCellType()==CellType.STRING) {
    		 value=cell.getStringCellValue();
    		 rowData.add(value);
    	 }
     }
     return rowData;
	}
	
	public List<String> getsheetData(String how, String value) throws FrameworkException {
		List<String> sheetData = new ArrayList<String>();
		Sheet sheet = getsheetobj(how, value);
		for(int i=0;i<sheet.getLastRowNum();i++) {
			row=sheet.getRow(i);
			for(int j=0;j<=row.getLastCellNum();j++) {
				cell=row.getCell(j);
				
				if(cell.getCellType()==CellType.BOOLEAN) {
		    		  value=cell.getBooleanCellValue()+" ";
		    		  sheetData.add(value);
		    	 }
		    	 else if(cell.getCellType()==CellType.NUMERIC) {
		    		 value=cell.getNumericCellValue()+" ";
		    		 sheetData.add(value);
		    	 }
		    	 else if(cell.getCellType()==CellType.STRING) {
		    		 value=cell.getStringCellValue();
		    		 sheetData.add(value);
		    	 }
			}
			
		}
		return sheetData;
	}

	public String getcellData(String how, String value, int cellNum, int cellNum1) throws FrameworkException {
		sheet=getsheetobj(how, value);
		if(sheet!=null) {
			 row=sheet.getRow(cellNum);
		}
		if(row!=null) {
			cell=row.getCell(cellNum);
		}
		if(cell!=null) {
			if(cell.getCellType()==CellType.NUMERIC) {
				value = cell.getNumericCellValue()+" ";
			}
			else {
				if(cell.getCellType()==CellType.BOOLEAN) {
					value = cell.getBooleanCellValue()+" ";
				}
				else {
					if(cell.getCellType()==CellType.STRING) {
						value = cell.getStringCellValue()+" ";
					}
				
			
					else {
						System.out.println("cell is pointing to null");
					}
					
						
					
				}
				
				 System.out.println("row is pointing to null");
			}
			}
			else {
				//throw exception
				FrameworkException exception = new FrameworkException("Sheet is pointing to null");
				System.out.println(exception);
				throw exception;
			}
			
					
		
      return value;
			
	}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

	
	
	

