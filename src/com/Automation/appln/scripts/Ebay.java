package com.Automation.appln.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Automation.Utilites.Filepaths;
import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.base.BaseTest;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class Ebay extends ActionEngine{

	@Test
	
	public void ebayTest() throws IOException, FrameworkException {
		
		//String url=PojoReader.getprconf().getpropertyvalue("ebay_url");
		/*
		 * FileInputStream fip = new FileInputStream(Filepaths.configFilepath);
		 * Properties prop = new Properties(); prop.load(fip);
		 * 
		 * String url=prop.getProperty("ebay_url");
		 */		//getDriver().get(url);
		
		enterUrl(PojoReader.getprconf().getvalue("Ebay_url"));
		getExtenttest().log(LogStatus.PASS, "Entered the url as: ");
		 
		 String search_id_value =PojoReader.getpror().getpropertyvalue("search_id");
		 getExtenttest().log(LogStatus.INFO, "Entered the search ID: "+search_id_value);
		 
		 
		 
		 String btn_value=PojoReader.getpror().getpropertyvalue("search_btn");
		 getExtenttest().log(LogStatus.INFO, "Entered the search button: "+btn_value);
			/*
			 * FileInputStream fip1 = new FileInputStream(Filepaths.orFilepath); Properties
			 * prop1 = new Properties(); prop1.load(fip); String
			 * search_id_value=prop.getProperty("search_id"); String btn_value =
			 * prop.getProperty("search_btn");
			 */
		getDriver().findElement(By.id(search_id_value)).sendKeys("earbuds");
		getExtenttest().log(LogStatus.PASS, "Entered the earbuds in search box");
		getDriver().findElement(By.id(btn_value)).click();
		getExtenttest().log(LogStatus.PASS, "click on the search button");
	}
}
