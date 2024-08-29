package com.Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://dragonflytest.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	WebElement contantus=driver.findElement(By.linkText("Contact Us"));
	String txt=contantus.getText();
	
	System.out.println("Text of the contactUs:    "+txt);
	
	Thread.sleep(5000);
	driver.close();
}
}
