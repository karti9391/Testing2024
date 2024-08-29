package com.Automation.appln.scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Automation.Utilites.Filepaths;
import com.Automation.Utilites.PojoReader;
import com.Automation.base.BaseTest;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest{

	@Test
	
	public void loginTest() throws IOException, FrameworkException {
		
		String unData =" ";
		String url=PojoReader.getprconf().getpropertyvalue("qa_url");
		getDriver().get(url);
		getExtenttest().log(LogStatus.PASS, "Enter the url as: "+url);
		
		String unId = PojoReader.getpror().getpropertyvalue("un_id");
		getExtenttest().log(LogStatus.INFO, "UserName ID is: "+unId);
		
		String nxtId=PojoReader.getpror().getpropertyvalue("nxt_id");
		getExtenttest().log(LogStatus.INFO, "UserName Next is: "+nxtId);
		
		FileInputStream fip = new FileInputStream(Filepaths.excelFilepath);
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Job_Details");
		Row row0=sheet.getRow(0);
		Cell cell00=row0.getCell(0);
		
		if(cell00.getCellType()==CellType.NUMERIC) {
			  unData
			  = cell00.getNumericCellValue()+" ";
			  
		  }
		  else
			  if(cell00.getCellType()==CellType.BOOLEAN) {
				unData=  cell00.getBooleanCellValue()+" ";
				
			  }
			  else 
				  
					  if(cell00.getCellType()==CellType.STRING) {
						unData=  cell00.getStringCellValue()+" ";
						
			  }
		  
		  
		
		
		
		
		
		
		
		WebElement un = getDriver().findElement(By.id(unId));
		un.sendKeys("karthik@gmail.com");
		WebElement nxt = getDriver().findElement(By.id(nxtId));
		nxt.click();

	}
}
