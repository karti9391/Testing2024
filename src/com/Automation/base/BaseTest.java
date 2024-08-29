package com.Automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Automation.Utilites.DriverPaths;
import com.Automation.Utilites.ScreenshotUtility;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class BaseTest {
@Getter @Setter  private static WebDriver driver;
@Getter @Setter  private static String curDir;
@Getter @Setter  private static String tcName;
@Getter @Setter  private static ExtentReports extentreports;
@Getter @Setter  private static ExtentTest extenttest;

	@Parameters({"browser"})
	
	@BeforeSuite
	public void OpenBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			curDir=System.getProperty("user.dir");
			System.setProperty(DriverPaths.chromekey, DriverPaths.chromevalue);
			driver = new ChromeDriver();
			
			init();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverPaths.iekey, DriverPaths.edgevalue);
			driver = new InternetExplorerDriver();
			init();
		}
		if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(DriverPaths.edgekey, DriverPaths.edgevalue);
			driver = new EdgeDriver();
			init();
		}

	}
	private void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	
	@BeforeMethod
	public void BeforeTCExecution(Method method) {
		 tcName=method.getName();
		System.out.println("Current Tc Execution is: "+tcName);
		 extenttest=extentreports.startTest(tcName);
		extenttest.log(LogStatus.PASS, "Current TC is Execution is: "+tcName);
	}
	
	@BeforeTest
	public void initReports() {
		 extentreports= new ExtentReports("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Reports\\report.html");
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "karthik@gmail.com");
		map.put("application", "javaselenium");
		map.put("testcases", "RegressionSuite");
		
		extentreports.addSystemInfo(map);
		
	}
	
	@AfterTest
	
	public void GenerateReports() throws FrameworkException{
		if(extentreports!=null) {
			extentreports.close();
		}
		else {
			FrameworkException exception = new FrameworkException("extentreport is pointing to null");
			System.out.println(exception);
			throw exception;
		}
	}
	
	
	
	@AfterMethod
	public void AfterTCExecution(ITestResult result) throws IOException {
    if(result.getStatus()==ITestResult.SUCCESS) {
    	System.out.println("TC is success: "+result.getName());
    }
    else
    if(result.getStatus()==ITestResult.FAILURE) {
    	System.out.println("TC is failure: "+result.getName());
    	System.out.println(result.getThrowable().toString());
    	
    	ScreenshotUtility.TakesScreenshot();
    	 extenttest=extentreports.startTest(tcName);
     	extenttest.log(LogStatus.FAIL, "TC is failed: "+tcName);
     	extenttest.log(LogStatus.FAIL, "TC is failed: "+result.getThrowable().toString());
     	
    	
    }
    else
        if(result.getStatus()==ITestResult.SKIP) {
        	System.out.println("TC is skipped: "+result.getName());
        	System.out.println(result.getThrowable().toString());
        	
        	ScreenshotUtility.TakesScreenshot();
        	extenttest=extentreports.startTest(tcName);
        	extenttest.log(LogStatus.SKIP, "TC is skipped: "+tcName);
        	extenttest.log(LogStatus.SKIP, "TC is skipped: "+result.getThrowable().toString());
        	
        }
    
	}
	@AfterSuite
	public void CloseBrowser() throws InterruptedException, FrameworkException {
		if(driver!=null) {
			Thread.sleep(5000);
			driver.close();
		}
		else {
			FrameworkException exception = new FrameworkException("driver is pointing to null");
			System.out.println(exception);
			throw exception;
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static String getCurDir() {
		return curDir;
	}
	public static String getTcName() {
		return tcName;
	}
	public static ExtentTest getExtenttest() {
		return extenttest;
	}
}
