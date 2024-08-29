package com.Automation.customisedException;

import java.io.FileInputStream;


import com.Automation.Utilites.Filepaths;

public class ElementException {
public static void main(String[] args) {
	
	try {
		System.out.println("java");
		System.out.println("POM");
		FileInputStream fip = new FileInputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123456\\TESTING2024\\config.properties");
		System.out.println("selenium");
		System.out.println("API");
		System.out.println("TestNg");
	}
	catch (Exception exception) {
		System.out.println("catch block");
		exception.printStackTrace();
		System.out.println(exception.toString());
		System.out.println(exception.getMessage());
		
	}
}
}
