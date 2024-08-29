package com.JavaPrograms;

public class SubString {
	public static void main(String[] args) {
		
		String str="kattekarthik";
		
		String substring=str.substring(5);
		System.out.println(substring);
		
		String substr=str.substring(0, 7);
		System.out.println(substr);
		
		CharSequence substr1=str.subSequence(0, 5);
		System.out.println(substr1);
		}
	}


