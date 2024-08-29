package com.JavaPrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
public static void main(String[] args) throws IOException, InterruptedException {
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com");
	driver.findElement(By.id("5452-254")).click();
	
	 TakesScreenshot ts=(TakesScreenshot) driver;
	    File file=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Screenshots\\SpiceJet.jpeg"));
	    
	ExtentReports extentreports=new ExtentReports("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Reports\\SpiceJet.html");

	ExtentTest extenttest=extentreports.startTest("Spicejet");
	extenttest.log(LogStatus.PASS, "Url is entered");
	extenttest.log(LogStatus.FAIL, "Webelement is failed");
	extentreports.endTest(extenttest);
	
	extentreports.flush();
	extentreports.close();
	
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
