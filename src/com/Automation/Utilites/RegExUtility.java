package com.Automation.Utilites;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtility {
	public static boolean isValidPhNum(String phNum) {
		boolean isValidPhNum=true;
	    Pattern pattern = Pattern.compile("(0|9)?[6-9][0-9]{9}");
	    Matcher matcher = pattern.matcher(phNum);
	    if(matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
	    	System.out.println("It is an Indian valid Phone Number");
	    }
	    else {
	    	isValidPhNum=false;
	    	System.out.println("It is not an Indian valid phone number");
	    }
		return isValidPhNum;
	}

	public static boolean isValidEmail(String Mail) {
		boolean isValidEmail=true;
		Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9.-]*@[a-zA-Z0-9]*([.][a-zA-Z]+)+");
		Matcher matcher = pattern.matcher(Mail);
		if(matcher.find()&&matcher.group().equalsIgnoreCase(Mail)) {
			System.out.println("It is a valid Email");
		}
		else 
			//boolean isValidEmail=false;
		System.out.println("It is not a valid Email");
		
		
		return isValidEmail;
		
	}




}
