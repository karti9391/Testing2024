package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
public static void main(String[] args) {
	
	String ValidEmail="karthik#gmail.com";
	
	Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9.-]*@[a-zA-Z0-9]*([.][a-zA-Z]+)+");
	Matcher matcher=pattern.matcher(ValidEmail);
	if(matcher.find()&&matcher.group().equalsIgnoreCase(ValidEmail)) {
	System.out.println("it is a valid email");
}
else
	System.out.println("it is not a valid email");
}
}