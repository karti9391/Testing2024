package com.Automation.PageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.base.CommonMethods;
import com.Automation.customisedException.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class OpenCart_HeaderPage extends ActionEngine {

	static {
		PageFactory.initElements(getDriver(),OpenCart_HeaderPage.class);
		
	}
	
	@FindBys({@FindBy(xpath="//div[@class='image']")})
	private static List<WebElement> ActualHeaders;
	
	public static List<String> getActualTextHeaders() {
		List<String> list=CommonMethods.getTextElements(ActualHeaders);

		return list;
	}
	
	public static  List<String> getExpTextHeaders() throws EncryptedDocumentException, FrameworkException, IOException, InterruptedException {
		String data=PojoReader.getExcelreaderobj().getcellData("sheetname", "OpenCart", 0, 1);
		Thread.sleep(15000);
		String[] str=data.split(" ");
		List<String> expData = new ArrayList<String>();
		for(String str1:str) {
			expData.add(str1);
		}
		return expData;
	}
	
	public static void validateHeaders() throws EncryptedDocumentException, FrameworkException, IOException, InterruptedException {
		List<String> actualData=getActualTextHeaders();
		List<String> expData = getExpTextHeaders();
		Collections.sort(actualData);
		Collections.sort(expData);
		if(actualData==expData) {
			getExtenttest().log(LogStatus.PASS, "Headers are matching: "+actualData+" = "+expData);
		}
		else {
			getExtenttest().log(LogStatus.FAIL, "Headers are not matching: "+actualData+" = "+expData);
		}
	}
	
	
	
	
	
}
