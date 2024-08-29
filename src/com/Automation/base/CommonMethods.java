package com.Automation.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonMethods {
	
public static List<String> getTextElements(List<WebElement> list) {
	List<String> listTxt = new ArrayList<String>();
	for(WebElement webelement:list) {
		String txt=webelement.getText();
		listTxt.add(txt);
	}
	return listTxt;

}
	
	
	
}
