package com.Karthik.javaPrograms;

public class ReverseStringUsingAPI {
public static void main(String[] args) {
	
	String str = "java";
	StringBuilder sb = new StringBuilder(str);
	StringBuilder rev=sb.reverse();
	System.out.println(rev);
}
}
