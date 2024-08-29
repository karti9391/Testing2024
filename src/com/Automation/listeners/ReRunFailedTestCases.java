package com.Automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTestCases implements IRetryAnalyzer{

	int retrycount=0;
	int maxRetrycount = 4;//execute 4 times
	
	@Override
	public boolean retry(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE&&retrycount<=maxRetrycount) {
			try {
				Thread.sleep(5000);
				System.out.println("count is: "+retrycount+ "executing testcases: "+result.getName());
				retrycount++;
			return true;
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
