package com.Automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Automation.Utilites.ScreenshotUtility;

public class TCActivityListeners implements ITestListener {
	
	@Override
	public void onFinish(ITestContext arg0) {
		
		System.out.println("suite execution is completed");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("suite execution is started");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("test case is failured: "+arg0.getName());
		try {
			ScreenshotUtility.TakesScreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("test case is skipped: "+arg0.getName());
		try {
			ScreenshotUtility.TakesScreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("test case is started: "+arg0.getName());
	}
	
}
