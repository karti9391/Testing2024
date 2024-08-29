package com.JavaPrograms;

public class PrimeNumbers {
public static void main(String[] args) {
	//int num =11;
	for(int i=1;i<=50;i++) {
		int count=0;
		for(int j=1;j<=50;j++) {
			
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			//System.out.println("prime");
		System.out.println("prime num: "+i);
		}
		//else System.out.println("not prime");
	}
}
}

