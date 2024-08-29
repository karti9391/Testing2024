package com.Automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailTestCases implements IRetryAnalyzer {

	int retrycount=0;
	int maxretrycount =3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE&&retrycount<=maxretrycount) {
			try {
				Thread.sleep(4000);
				System.out.println("count is: "+retrycount+"Failed TC Execution is: "+result.getName());
			     retrycount++;
			     return true;
		}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		}
		return false;
	}

}
