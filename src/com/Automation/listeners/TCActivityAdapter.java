package com.Automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.Automation.Utilites.ScreenshotUtility;

public class TCActivityAdapter extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failured: "+result.getName());
		try {
			ScreenshotUtility.TakesScreenshot(result.getName());
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
