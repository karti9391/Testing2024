package com.Automation.appln.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Automation.PageObject.Gmail_Home_Page;
import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.base.BaseTest;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class Flipkart extends ActionEngine {

	@Test()
	
	public void flipkartTest() throws IOException, FrameworkException {
		
		/*
		 * FileInputStream fip = new FileInputStream(
		 * "C:\\\\Users\\\\k.karthik\\\\OneDrive\\\\Desktop\\\\kksoft123\\\\TESTING2024\\\\config.properties"
		 * ); Properties prop = new Properties(); prop.load(fip);
		 */
		
		//String url =PojoReader.getprconf().getpropertyvalue("flipkart_url");
		
		//String url=prop.getProperty("flipkart_url");
		//getDriver().get(url);
		//getExtenttest().log(LogStatus.PASS, "Entered the url as: "+url);
		/*
		 * FileInputStream fip1 = new FileInputStream(
		 * "C:\\\\Users\\\\k.karthik\\\\OneDrive\\\\Desktop\\\\kksoft123\\\\TESTING2024\\\\src\\\\com\\\\Automation\\\\ObjectRepository\\\\or.properties"
		 * ); Properties prop1 = new Properties(); prop1.load(fip);
		 */
		
		enterUrl(PojoReader.getprconf().getvalue("flipkart_url"));
		
		String flipkart_id_value=PojoReader.getpror().getpropertyvalue("flipkart_id");
		getExtenttest().log(LogStatus.INFO, "Entered the Flipkart ID is: "+flipkart_id_value);
		
		//String flipkart_id_value = prop.getProperty("flipkart_id");
		
		
		getDriver().findElement(By.id(flipkart_id_value)).sendKeys("mobiles");
		getExtenttest().log(LogStatus.INFO, "Entered the mobiles");

	}
	
}
