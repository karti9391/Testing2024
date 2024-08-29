package com.Automation.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Automation.base.ActionEngine;
import com.Automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Home_Page extends ActionEngine {
	
	static {
		PageFactory.initElements(getDriver(), Gmail_Home_Page.class);
	}

	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement nxtbtn;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private static WebElement SignIn;
	
	@FindBy(xpath="//span[text()='to continue to Gmail']")
	private static WebElement ContinuetoGmail;
	
	@FindBy(xpath="//button[text()='Forgot password?']")
	private static WebElement forgotEmail;
	
	@FindBy(xpath="//span[text()='Create account']")
	private static WebElement CreateAccount;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private static WebElement Enterwd;
	
	@FindBy(xpath="//div[text()='Show password'")
	private static WebElement ShowPwd;
	
	
	
	
	public static void EnteruserName(String unData) {
		//EnterUserName(userName, unData);
		DTA(userName, unData, "username");
	
	}
	
	public static void NxtBtn() {
		clickBywe(nxtbtn, "nxtbtn");
		
	}
	
	public static void ClickContinuGmailbtn() {
		clickBywe(ContinuetoGmail, "continue to Gmail btn");
		
	}
	public static void ClickonForgotBtn() {
	clickBywe(forgotEmail, "Forgot Gmail");
	}
	public static void ClickCreateAccount() {
		clickBywe(CreateAccount, "Create Account");

	}
	
	public static void EnterPwd(String pwdData) {
		DTA(Enterwd, pwdData, "EnterPwd");
	}
	
	public static void ClickshowPwd() {
		clickBywe(ShowPwd, "showPwd");
		

	}
	
	
	}
	

