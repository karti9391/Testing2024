package com.java;

public class EncapsulationDemo {
	
		int sal=256300;
		String a="job";
		 
	
	public void Hello() {
		System.out.println(a+  "Hello world"  +  sal);
	}
	public static void main(String[] args) {
		
	
	EncapsulationDemo demo = new EncapsulationDemo();
	demo.a="java";
	demo.sal=2130;
	demo.Hello();
	
	}
}
