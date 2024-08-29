package com.Automation.ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	
	FileInputStream fip = new FileInputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\src\\com\\Automation\\ObjectRepository\\or.properties");
	Properties prop = new Properties();
	prop.load(fip);
	
	String un_id_value=prop.getProperty("un_id");
	System.out.println(un_id_value);
	
	String un_xpath_value=prop.getProperty("un_xpath");
	System.out.println(un_xpath_value);
	
	String nxt_css_value=prop.getProperty("nxt_css");
	System.out.println(nxt_css_value);
	
	String signin_id_value=(String) prop.get("signin_id");
	System.out.println(signin_id_value);
	
}
}
