package com.java;

public class LeapYear {
public static void main(String[] args) {
	
	
	int year  = 2017;
	if(year%4==0) {
		if(year%100!=0 || year%400==0) {
			System.out.println("leap year");
			//continue;
		}
		else System.out.println("leap year soon");
	}
	//System.out.println("not a leap year");
}
}
