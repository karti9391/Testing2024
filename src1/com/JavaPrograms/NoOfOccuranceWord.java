package com.JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfOccuranceWord {
public static void main(String[] args) {
	
	Pattern pattern = Pattern.compile("a");
	Matcher matcher=pattern.matcher("java");
	int count=0;
	
	while(matcher.find()) {
		count++;
	}
	System.out.println("No of occurance in a word is: "+count);
	
}
}
