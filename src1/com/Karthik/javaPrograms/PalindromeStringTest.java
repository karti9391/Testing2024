package com.Karthik.javaPrograms;

public class PalindromeStringTest {
public static void main(String[] args) {
	
	String str = "madam";
	String rev = " ";
	String org_str = str;
	
	int len =str.length();
	for(int i=len-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(org_str.equals(str))
{
System.out.println("palindrome string");		
}
	else  System.out.println("not palindrome string");
}
}
