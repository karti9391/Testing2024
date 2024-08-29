package com.Karthik.javaPrograms;

public class PrimeNumbersTest {
public static void main(String[] args) {
	
	int num =100;
	
	for(int i=1;i<=num;i++) {
		int count =0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println(" "+i);
				
			
		}
	}
	
	
	
	
	int num1=121;
	int count=0;
	for(int i=1;i<=num1;i++) {
		if(num1%i==0) {
			count++;
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	
}
}
