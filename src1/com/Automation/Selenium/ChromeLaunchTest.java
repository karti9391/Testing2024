package com.Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchTest {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\Driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https://www.rameshsoft.com");
	driver.findElement(By.linkText("Contact Now")).click();
	
	WebElement name=driver.findElement(By.name("your-name"));
	if(name.isDisplayed()&&name.isEnabled()) {
		System.out.println("Name is displayed");
		name.sendKeys("karthik");
	}
	else System.out.println("name is not dislayed");
	driver.findElement(By.name("your-email")).sendKeys("karthik@gmail.com");
	WebElement radioBtn=driver.findElement(By.xpath("//input[@type='radio'][@value='Offline']"));
	if(radioBtn.isSelected()) {
		System.out.println("Radiobtn is selected");
	}
	else System.out.println("radiobtn is not selected");
	
	Thread.sleep(3000);
	driver.close();
}
}
