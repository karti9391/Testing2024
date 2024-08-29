package com.Automation.Reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo {
public static void main(String[] args) {
	
	ExtentReports reports=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\report.html");
	Map<String, String> map=new HashMap<String, String>();
	
	map.put("url", "https://www.gmail.com");
	map.put("username", "karthik@gmail.com");
	map.put("pwd", "dohardwork");
	map.put(null, null);
	map.put("pwd", "hardwork");
	//map.put(null, null);
	
	reports.addSystemInfo(map);
	System.out.println(map);
	 
	   ExtentTest test= reports.startTest("demo");
	   test.log(LogStatus.PASS, "Enter the url");
	   test.log(LogStatus.PASS, "username as entered");
	   test.log(LogStatus.PASS, "Entered the pwd");
	   
	   reports.endTest(test);
	   reports.flush();
	   reports.close();
	   
	
	
	
	
	
	
	
}
}
