package com.Automation.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Automation.base.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;

public class OpenCart_LaptopaAndNoteBooks extends ActionEngine {

	static {
		PageFactory.initElements(getDriver(),OpenCart_LaptopaAndNoteBooks.class );
	}
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private static WebElement laptopsNoteBooks;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private static WebElement ShowAlllaptopsNoteBooks;
	
	@FindBy(xpath="//aside[@id='column-left']/div/a[2]")
	private static WebElement LaptopsNoteBooksSize;
	
	@FindBys({@FindBy(xpath="//div[@class='image']")})
	private static List<WebElement> expLaptopsNoteBooksSize;
	
	
	public static void mouseHoveronlaptopsNoteBooks() {
		mouseHoverActions(laptopsNoteBooks, "laptopsNotebooks");
		
	}
		
	public static void clickShowAlllaptopsNoteBooks() throws InterruptedException {
		clickBywe(ShowAlllaptopsNoteBooks, "ShowAllLaptopsNotbooks");
		Thread.sleep(9000);
	}
	
	public static int getActualSizeLaptopsNoteBooks() {
		String txt=LaptopsNoteBooksSize.getText(); //laptops & notebooks [5]
		
		 String[] txt1=txt.split("  "); // laptops & notebooks [5]
		 String txt2=txt1[3];            //
		 String[] txt3=txt2.split("");
		 
		 String txt4=txt3[1];   // "5" 
		 int actualSize=Integer.parseInt(txt4);// 5
		
		return actualSize;
		
	}

	public static   int getexpLaptopsNoteBooksSize() {
    int explaptopsNotebooks= expLaptopsNoteBooksSize.size();
    //clickByJS(expLaptopsNoteBooksSize, "expLaptopsNoteBooksSize");
     
     return explaptopsNotebooks;
     
	}

	


	


 public static void validateLaptopsNoteBookssize() { 
int actualsize=getActualSizeLaptopsNoteBooks(); //int //
 int expvaluesize=getexpLaptopsNoteBooksSize(); 
 if(actualsize==expvaluesize) {
 getExtenttest().log(LogStatus.PASS, "laptos & notebooks size is matching: "+actualsize+" = "+expvaluesize);
 } else { 
	 
	 
	getExtenttest().log(LogStatus.FAIL,"laptos & notebooks size is not  matching: "+actualsize+" = "+expvaluesize);
	 
 }
 
 } }
 
