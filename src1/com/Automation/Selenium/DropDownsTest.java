package com.Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsTest {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com");
	
	WebElement catagories=driver.findElement(By.xpath("//select[@id='gh-cat']/option[7]"));
	//catagories.click();
	String tagname=catagories.getTagName();
	if(tagname.equalsIgnoreCase("select")) {
		Select select=new Select(catagories);
		select.selectByValue("Cell Phones & Accessories");
		WebElement firstselectedoption=select.getFirstSelectedOption();
		System.out.println(firstselectedoption);
	}
	else {
		driver.findElement(By.xpath("//select[@id='gh-cat']/option[7]")).click();
		
	}
	Thread.sleep(5000);
	driver.close();
	
}
}
