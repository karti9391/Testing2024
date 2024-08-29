package com.Karthik.javaPrograms;

public class FibonacciseriesTest {
public static void main(String[] args) {
	
	//int num=10;
	int t1=0,t2=1;
	
	for(int i=0;i<=10;i++) {
		
		int sum=t1+t2;
		t2=t1;
		t2=sum;
		System.out.println(t1+" ");
	}
}
}
