package com.Automation.appln.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.base.BaseTest;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class Meesho extends ActionEngine {

	@Test
	public void meeshoTest() throws IOException, FrameworkException {
		
		/*
		 * FileInputStream fip = new FileInputStream(
		 * "C:\\\\Users\\\\k.karthik\\\\OneDrive\\\\Desktop\\\\kksoft123\\\\TESTING2024\\\\config.properties"
		 * ); Properties prop = new Properties(); prop.load(fip);
		 */
		//String url = prop.getProperty("meesho_url");
		/*
		 * String url = PojoReader.getprconf().getpropertyvalue("meesho_url");
		 * getDriver().get(url);
		 */
		
		enterUrl(PojoReader.getprconf().getvalue("meesho_url"));
		
getExtenttest().log(LogStatus.PASS, "entered the url is: ");
	}
	
}
