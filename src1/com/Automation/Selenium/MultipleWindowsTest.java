package com.Automation.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsTest {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://dragonflytest.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Contact Us")).click();
	
      String curWindow=driver.getWindowHandle();
	  System.out.println("current window name is: "+curWindow);
	  
	  Set<String> Windows=driver.getWindowHandles();
	  System.out.println("Total windows name are: "+Windows);
	  
	  for(String str:Windows) {
		  if(str.equalsIgnoreCase(curWindow)) {
			  System.out.println("Already focusing");
		  }
		  else {
			  driver.switchTo().window(str);
		  }
	  }
	String secWindow=driver.getWindowHandle();
	System.out.println("Second window name is: "+secWindow);
	
	driver.get("https://www.booking.com");
	
	
	
	
	
	
	Thread.sleep(9000);
	driver.close();
	
	
}
}
