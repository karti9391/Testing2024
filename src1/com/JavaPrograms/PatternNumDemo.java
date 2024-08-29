package com.JavaPrograms;

import java.util.Scanner;

public class PatternNumDemo {
public static void main(String[] args) {
	
	/*
	 * Scanner sc= new Scanner(System.in); System.out.println("Enter a number"); int
	 * num = sc.nextInt();
	 */
	/*
	 * for(int i=0;i<num;i++) { for(int j=(num-i);j>=0;j--) {
	 * System.out.print("  "); } for(int j=0;j<=i;j++) { System.out.print("* "); }
	 * System.out.println(); }
	 */
	int num =5;
	for(int i=0;i<=num;i++) {
		for(int j=0;j<=num;j++) {
			System.out.print("  ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("$  ");
		}
		System.out.println();
	}
}
}
