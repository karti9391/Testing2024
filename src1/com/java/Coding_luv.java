package com.java;

public class Coding_luv {
public static void main(String[] args) {
	
	int count =0;
	for(int i=1;i<=10;i++) {
		count=count++;
		// increment operator is not working here bcz initial() will not increment
	}
	System.out.println(count);
}
}
