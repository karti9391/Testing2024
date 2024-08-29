package com.Automation.ObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
public static void main(String[] args) throws IOException {
	
	// write the data into properties files
	//File file = new File("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\config.properties");
	//FileInputStream fip = new FileInputStream(file);
	FileInputStream fip = new FileInputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\config.properties");
	Properties prop = new Properties();
	prop.load(fip);
	
	prop.setProperty("qa_url", "https://www.gmail.com");
	prop.setProperty("hardwork", "job");
	prop.setProperty("job", "Respect");
	
	//FileOutputStream fop = new FileOutputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\config.properties");
	//prop.store(fop, "file is saved successfully");
	prop.store(new FileOutputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TESTING2024\\config.properties"), "file is saved successfully");
	
	


}
}
