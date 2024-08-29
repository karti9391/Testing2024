package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumAndSum {
public static void main(String[] args) {
	
	Pattern pattern=Pattern.compile("[0-9]");
	Matcher matcher=pattern.matcher("java2155selenium5465");
	
	int sum=0;
	while(matcher.find()) {
		String grp=matcher.group();
		System.out.println(grp);
		int num=Integer.parseInt(grp);
		sum=sum+num;
		System.out.println(" "+sum);
	}
}
}
