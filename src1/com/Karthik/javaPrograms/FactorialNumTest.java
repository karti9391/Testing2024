package com.Karthik.javaPrograms;

public class FactorialNumTest {
public static void main(String[] args) {
	
	int num=5;
	int fact = 1;
	 
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("factorial num is: "+fact);
}
}
