package com.java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
public static void main(String[] args) throws IOException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.get("https://poi.apache.org/download.html");
    
    driver.findElement(By.linkText("poi-src-5.2.5-20231118.zip")).click();
    
    TakesScreenshot ts=(TakesScreenshot) driver;
    File file=ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Screenshots\\ApachePoi.jpeg"));
    
}
}
