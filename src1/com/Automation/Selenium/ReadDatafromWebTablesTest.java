package com.Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDatafromWebTablesTest {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.get("https://www.chittorgarh.com/ipo/ipo_dashboard.asp");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	int rows = driver.findElements(By.xpath("//table[@class='table table-sm table-striped']//tbody/tr")).size();
     System.out.println("Total no of rows are: "+rows);
     
     int columns = driver.findElements(By.xpath("//table[@class='table table-sm table-striped']//thead/tr/th")).size();
     System.out.println("Total no of columns are: "+columns);


       for(int r=1;r<=rows;r++) {
    	   for(int c=1;c<=rows;c++) {
    		   String Data = driver.findElement(By.xpath("//table[@class='table table-sm table-striped']//tr["+r+"]/td["+c+"]")).getText();
    	        System.out.print(Data+"   ");
    	   }
       }









}
}
