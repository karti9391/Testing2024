package com.java;

public class ConstructorDemo {
	int sal;
	String job;
	

	
	public ConstructorDemo() {
		System.out.println(job+""+sal);
	}
	public ConstructorDemo(int sal, String job) {
		System.out.println(job+" "+sal);
	}
	
	void hello()
{
		System.out.println(job+" "+sal);
		
		}
	public static void main(String[] args) {
		
		//ConstructorDemo demo = new ConstructorDemo();
		//demo.hello();
		ConstructorDemo demo1 = new ConstructorDemo(50000, "test");
		demo1.hello();
	}
}

