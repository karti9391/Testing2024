package com.Automation.appln.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Automation.base.BaseTest;
import com.Automation.listeners.ReRunFailedTestCases;

public class RetryTest extends BaseTest {

	@Test(retryAnalyzer = ReRunFailedTestCases.class)
	public void flipkartTest() {
		getDriver().get("https://www.flipkart.com");
		getDriver().findElement(By.id("q")).sendKeys("mobiles");

	}
}
