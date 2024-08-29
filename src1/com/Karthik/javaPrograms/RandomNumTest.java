package com.Karthik.javaPrograms;

public class RandomNumTest {
public static void main(String[] args) {
	
	int num=20;
	for(int i=0;i<=num;i++) {
		System.out.print(" "+i);
	}
	
	for(int i=0;i<=num;i++) {
		if(i%2==0) {
			System.out.println("even num : "+i);
		}
		else
		System.out.println("odd num:  "+i);
	}
	
	
}
}
