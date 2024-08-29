package com.JavaPrograms;

public class AmstrongNum {
public static void main(String[] args) {
	
	int num =153;
	int temp=num;
	int sum=0;
	int rem=0;
	while(num!=0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("it is a Amstrong");
	}
	else System.out.println("it's not amstrong");
}
}
