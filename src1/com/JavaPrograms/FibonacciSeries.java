package com.JavaPrograms;

public class FibonacciSeries {
public static void main(String[] args) {
	
	// 0+1 =1, 1+1=2, 2+1=3,3+2=5.......
	
	int num =10;
	int t1=0,t2=1;
	
	for(int i=0;i<=num;i++) {
		//System.out.println(t1+" ");
		int sum = t1+t2;
	
		t1=t2;
		t2=sum;
		System.out.println(t1+" ");
	}
	// if you write here to get the total of sum
	//System.out.println(t1+" ");
}
}
