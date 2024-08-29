package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianValidPhNum {
public static void main(String[] args) {
	String PhNum ="6391656454";
	
	Pattern pattern=Pattern.compile("(0|9)?[6-9][0-9]{9}");
	Matcher matcher=pattern.matcher(PhNum);
	
	if(matcher.find()&&matcher.group().equalsIgnoreCase(PhNum)) {
		System.out.println("it's an indian phnum");
	}
	else
		System.out.println("it is not a indain phnum");
}
}