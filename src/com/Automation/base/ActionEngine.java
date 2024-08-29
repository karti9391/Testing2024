package com.Automation.base;

import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends BaseTest{
	
	//ENTER THE URL
public static void enterUrl(String url) {
	 try {
		 getDriver().get(url);
		 getExtenttest().log(LogStatus.PASS, "Url is entered as: "+url);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "Url is not Entered as: "+url);
	}
}
	
// Sending the data into user fields

public static void EnterUserName(WebElement element,String elementName) {
	try {
		Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 element.clear();
		 getExtenttest().log(LogStatus.PASS, "userName fiels is cleared");
		 element.sendKeys(elementName);
		 getExtenttest().log(LogStatus.PASS, "Data typing Action is done on UserNAme field: "+elementName); 
	}
	catch (Exception expection) {
		 getExtenttest().log(LogStatus.FAIL, "Data typing Actions is not done on UserName Field: "+elementName);
	}
}






	//CLICK BY WEBELEMENT
public static void clickBywe(WebElement element,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 element.click();
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "webelement is not clicked: "+elementName);
	}
}
	
//CLICK  by using javascriptexecutor
public static void clickByJS(List<WebElement> element,String elementName) {
	 try {
		 Assert.assertTrue(((WebElement) element).isDisplayed()&&((WebElement) element).isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 ((WebElement) element).click();
		 getExtenttest().log(LogStatus.PASS, "element is click by JS: "+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "webelement is not clicked: "+elementName);
	}
}
	
	
//CLICK BY ACTIONS
public static void clickByAction(WebElement element,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 Actions actions = new Actions(getDriver());
		 actions.click(element).build().perform();
		 getExtenttest().log(LogStatus.PASS, "element is click by Actions: "+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "webelement is not clicked: "+elementName);
	}
}

//DOUBLECLICK BY ACTIONS
public static void DoubleclickByAction(WebElement element,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 Actions actions = new Actions(getDriver());
		 actions.doubleClick(element).build().perform();
		 getExtenttest().log(LogStatus.PASS, "element is click by DoubleClick: "+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "webelement is not Doubleclicked: "+elementName);
	}
}
	
//CLICK BY ACTIONS with enter
public static void clickByActionEnter(WebElement element,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 Actions actions = new Actions(getDriver());
		 actions.sendKeys(element, Keys.ENTER).build().perform();
		 getExtenttest().log(LogStatus.PASS, "element is click with Enter: "+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "webelement is not click with Enter: "+elementName);
	}
}
	
	// Data type actions
public static void DTA(WebElement element,String testData,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 element.clear();
		 getExtenttest().log(LogStatus.PASS, "DTA is done by: "+elementName);
		 element.sendKeys(testData);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "DTA is not done: "+elementName);
	}
}
	
//Data type actions with Actions class
public static void DTAByActions(WebElement element,String testData,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 Actions actions = new Actions(getDriver());
		 actions.sendKeys(element, testData).build().perform();
		 getExtenttest().log(LogStatus.PASS, "DTA is done by on webelement: "+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "DTA is not done by on webelement: "+elementName);
	}
}
	
//Data type actions by JS
public static void DTAByJS(WebElement element,String testData,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		element.clear();
		 getExtenttest().log(LogStatus.PASS, "DTA is done by Action: "+elementName);
		 element.sendKeys(testData);
		 getExtenttest().log(LogStatus.PASS, "DTA is done by on webelement"+elementName);
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "DTA is not done by on webelement: "+elementName);
	}
}
	
// MOUSE IVER ACTION ON WEBELEMENTS
  public static void mouseHoverActions(WebElement element,String elementName) {
	  try {
		  Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
			 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
			 Actions actions = new Actions(getDriver());
			 actions.moveToElement(element).build().perform();
			 getExtenttest().log(LogStatus.PASS, "Move to element is done by on webelement: "+elementName);
		 }
		 catch (Exception exception) {
			 getExtenttest().log(LogStatus.FAIL, "DTA is not done by on webelement: "+elementName);
		}
		  
	  }


  // GET THE PAGE TILTE
  
  public static String getpageTitle() {
	  String title=" ";
	  try {
		  title=getDriver().getTitle();
		  getExtenttest().log(LogStatus.PASS, "get the page title: "+title);
		  
	  }
	  catch(Exception exception){
		  getExtenttest().log(LogStatus.FAIL, "not getting the page title: "+title);
		  
	  }
	return title;

}

 public static void verifyTitleofage(String expvalue) {
	 String title = getpageTitle();
	 if(title.equalsIgnoreCase(expvalue)){
		 getExtenttest().log(LogStatus.PASS, "Title is matched: "+title +" "+expvalue);
	 }
	 else {
		 getExtenttest().log(LogStatus.FAIL, "Title is not macted: "+title +" "+expvalue);
	 }
}

public static void gettextofWebElement(WebElement webelement) {
	try {
		String txt = webelement.getText();
		
	}catch(Exception exception) {
		
	}
}




	//Handle DropDowns
public static void handleDropDowns(WebElement element,String how,String howvalue,String elementName) {
	 try {
		 Assert.assertTrue(element.isDisplayed()&&element.isDisplayed());
		 getExtenttest().log(LogStatus.PASS, "webelement is Displayed & Enabled: "+elementName);
		 String tagName=element.getTagName();
		 Select select=new Select(element);
		 if(tagName.equalsIgnoreCase("select")) {
		 	

		 if(how.equalsIgnoreCase("value")) {
		 	select.selectByVisibleText(howvalue);
		 	
		 }
		 else 
		 	if(how.equalsIgnoreCase("text")) {
		 		select.selectByVisibleText(howvalue);
		 		getExtenttest().log(LogStatus.PASS, "selected");
		 }

		 	else 
		 		if(how.equalsIgnoreCase("index")) {
		 			int index=Integer.parseInt(howvalue);
		 			select.selectByVisibleText(howvalue);
		 			getExtenttest().log(LogStatus.PASS, "selected");
		 	}
		 }

		 	else {
		 		getExtenttest().log(LogStatus.PASS, elementName+": is not starting with tagName");
		 	}
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "element is not displayed: "+elementName);
	}
}
	
	
public static void handleMultipleWindows() {
	String secWindow;
	 try {
		String curWindow= getDriver().getWindowHandle();
		Set<String> windows=getDriver().getWindowHandles();
		for(String str:windows) {
			if(str.equalsIgnoreCase(curWindow)) {
				getExtenttest().log(LogStatus.INFO, "Window is ready for focussing: "+str);
				secWindow=getDriver().getWindowHandle();
			}
			else {
				getDriver().switchTo().window(str);
				getExtenttest().log(LogStatus.PASS, "switching to window: "+str);
				
			}
		}
	 }
	 catch (Exception exception) {
		 getExtenttest().log(LogStatus.FAIL, "not able to switch: ");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
