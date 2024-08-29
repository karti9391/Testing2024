package com.Karthik.javaPrograms;

public class PalindromeNumTest {
public static void main(String[] args) {
	
	int num = 453;
	int org_num = num;
	int rev =0;
	
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(org_num==num) {
		System.out.println("palindrome");
	}
	else   System.out.println("not palindrome"); 
}
}
