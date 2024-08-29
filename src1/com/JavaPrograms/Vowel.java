package com.JavaPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel {
public static void main(String[] args) {
	
	String str="Hello World";
	int count=vowelcount(str);
	
	
	
}

public static int vowelcount(String str) {
	
	Pattern pattern = Pattern.compile("[AEIOUaeiou]");
	Matcher matcher=pattern.matcher(str);
	int count =0;
	while(matcher.find()) {
		count++;
	}
	System.out.println(" "+matcher);
	System.out.println("vowel are : "+count);
	//System.out.println("consonents are: "+str);
	return count;
	
	
}
}
