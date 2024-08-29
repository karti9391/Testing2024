package com.Automation.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisabledAndEnabledLinksTest {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://dragonflytest.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	List<WebElement> listlinks=driver.findElements(By.xpath("//*"));
	System.out.println("Total no. of links of dragonflytest is: "+listlinks.size());
	
	int enabledlinkscount =0;
	int disabledlinkscount=0;
	
	for(WebElement element : listlinks) {
		if(element.isDisplayed()&&element.isEnabled()) {
			enabledlinkscount++;
			//System.out.println("Enabled links are: "+enabledlinkscount);
		}
		else {
			disabledlinkscount++;
			//System.out.println("Disabled links are: "+disabledlinkscount);
		}
	}
	System.out.println("Enabled links are: "+enabledlinkscount);
	System.out.println("Disabled links are: "+disabledlinkscount);
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
}
}
