package com.Automation.Selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpencartRegistrationTest {
public static void main(String[] args) throws InterruptedException {
	
	// open the brpwser with standard key & value
	  //                   standard chromekey             standard chromevalue
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Drivers\\chromedriver.exe");
	
	// we can the browser with webdriverManger also
	// by using this webdrivermanger we didn't download the chromedriver. it's download automatically and setup & open
	WebDriverManager.chromedriver().setup();
	
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https//www.opencart.com");
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("input-username")).sendKeys("karthik");
    driver.findElement(By.id("input-firstname")).sendKeys("katte");
    driver.findElement(By.id("input-lastname")).sendKeys("karthik");
    driver.findElement(By.id("input-email")).sendKeys("karthik@gmail.com");
    driver.findElement(By.xpath("//select[@id='input-country']/option[100]")).click();
    driver.findElement(By.id("input-password")).sendKeys("Karti9391$$");
    driver.findElement(By.linkText("Register")).click();
    
    Thread.sleep(5000);
    driver.close();
	
}
}
