package com.Karthik.javaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfOccuranceTest {
public static void main(String[] args) {
	
	Pattern pattern = Pattern.compile("e");
	Matcher matcher = pattern.matcher("Selenium");
	
	int count = 0;
	while(matcher.find()) {
		count++;
	}
	System.out.println(" "+count);
	
	
	
	
}
}
