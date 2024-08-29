package com.Karthik.javaPrograms;

public class AmstrongNumTest {
public static void main(String[] args) {
	
	int num = 123;
	int sum =0;
	int rem = 0;
	int temp=num;
	temp=num;
	while(num!=0) {
		rem=rem%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("amstrong number");
	}
	else  System.out.println("not Amstrong num");
}
}
