package com.java;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiWindows {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.bing.com");
	driver.findElement(By.linkText("Videos456")).click();
	String curWindow=driver.getWindowHandle();
	System.out.println("First window is: "+curWindow);
	
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println("All window names are: "+allwindows);
	
	Iterator itr=allwindows.iterator();
	while(itr.hasNext()) {
		String window=(String) itr.next();
		if(!window.equalsIgnoreCase(curWindow)) {
			driver.switchTo().window(window);
			break;
		}
	}
	
	driver.findElement(By.linkText("Maps")).click();
	Set<String> secwindowsName=driver.getWindowHandles();
	System.out.println("Second wsindow name is: "+secwindowsName);
	
	Thread.sleep(5000);
	driver.close();
	
}
}
