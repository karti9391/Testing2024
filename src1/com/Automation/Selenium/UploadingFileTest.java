package com.Automation.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFileTest {
public static void main(String[] args) throws AWTException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https://www.monsterindia.com");
	driver.findElement(By.xpath("span[@class='uprcse semi-bold']")).click();
	// using sendkeys
	driver.findElement(By.xpath("//inut[@id='file-upload']")).sendKeys("location of the file path");
	
	
	
	// using robot class to upload the file
	
	Robot rb = new Robot();
	rb.delay(2000);
	
	
	// put the file into clipboard
	StringSelection ss = new StringSelection("path of the file location");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	//ctrl+v
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	
	//Enter
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
}
}
