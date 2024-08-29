package com.Automation.Utilites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Automation.base.BaseTest;

public interface ScreenshotUtility {

 public static String TakesScreenshot() throws IOException {
	 TakesScreenshot ts=(TakesScreenshot) BaseTest.getDriver();
		File file=ts.getScreenshotAs(OutputType.FILE);
	   String imagpath= BaseTest.getCurDir()+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(file, new File(imagpath));
	   return imagpath;
 }
 
 public static String TakesScreenshot(String tcName) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot) BaseTest.getDriver();
		File file=ts.getScreenshotAs(OutputType.FILE);
	   String imagpath= BaseTest.getCurDir()+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(file, new File(imagpath));
	   return imagpath;
	  
 }
}