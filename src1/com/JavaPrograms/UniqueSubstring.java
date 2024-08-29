package com.JavaPrograms;

public class UniqueSubstring {
public static void main(String[] args) {
	
	String str="abcd";
	
	for(int i=0;i<=str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			
			String uniquesubstring=str.substring(i,j);
			System.out.print(" "+uniquesubstring);
			//System.out.println(" "+i);
			//System.out.println(" "+j);
			
		}
	}
}
}
