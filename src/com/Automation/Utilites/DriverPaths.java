package com.Automation.Utilites;

import com.Automation.base.BaseTest;

public interface DriverPaths {

	String chromekey ="webdriver.chrome.driver";
	String chromevalue = BaseTest.getCurDir()+"\\Driver\\chromedriver.exe";
	
	String iekey ="webdriver.ie.driver ";
	String ievalue = BaseTest.getCurDir()+"\\Driver\\iedriver.exe";
	
	String edgekey ="webdriver.edge.driver";
	String edgevalue = BaseTest.getCurDir()+"\\Driver\\edgedriver.exe";
	
}
