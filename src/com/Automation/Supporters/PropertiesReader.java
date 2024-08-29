package com.Automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.Automation.customisedException.FrameworkException;

public class PropertiesReader {
    private String filepath;
    private FileInputStream fip;
    private Properties prop;
    private String value;
    private Set setkeys;
    
    
	
	
	public PropertiesReader(String filepath) throws IOException {
		this.filepath=filepath;
		 fip = new FileInputStream(filepath);
		  prop = new Properties();
		 prop.load(fip);
	}
		 //get the data from properties file
		public String getpropertyvalue(String key) throws FrameworkException {
			if(prop!=null) {
				 value=prop.getProperty(key);
			}
			else {
				// throwing exception
				FrameworkException exception = new FrameworkException("properties is pointing to null");
				System.out.println(exception);
				throw exception;
			}
			return value;
		}
		 
		// get the data from properties default values
		
		public String getpropertyvalue(String key, String defaultvalue) throws FrameworkException {
			if(prop!=null) {
				value = (String) prop.getOrDefault(key, defaultvalue);
				if(prop==null) {
					value=defaultvalue;
				}
				
			}
			else {
				// throwing exception
				FrameworkException exception = new FrameworkException("properties is pointing to null");
				System.out.println(exception);
				throw exception;
			}
			return value;
		}
		
		 public String getvalue(Object key) throws FrameworkException {
			 if(prop!=null) {
				 value = (String) prop.get(key);
			 }
			 else {
				 //throwing exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
			 return value;
		 }
		 public String getpropertyvalue(Object key,Object defaultvalue) throws FrameworkException {
			 if(prop!=null) {
				 value = (String) prop.get(key);
				 if(prop==null) {
					 value=(String) defaultvalue;
				 }
			 }
			 else {
				 //throwing exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
			 return value;
		 }
		 
		 // get the only keys don't want duplicates
		 
		 public Set getkeys() throws FrameworkException {
			 Set setkeys=null;
			 if(prop!=null) {
				 setkeys= prop.keySet();
			 }
			 else {
				 // throwing exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
			 return setkeys;

		}
		 
		 // get all values want to duplicates
		 public List getvalues() throws FrameworkException {
			 List list = new ArrayList();
			 if(prop!=null) {
				Set set= prop.keySet();
				for(Object obj:set) {
					Object values=prop.get(obj);
					list.add(values);
				}
			 }
			 else {
				 // throw exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
			 return list;
			 
		}
		 
		 // get the data in the form of keyvalue pairs
		 
		 public Map getkeyvalues() throws FrameworkException {
			Map map = new HashMap();
			
			 if(prop!=null) {
				Set set= prop.keySet();
				for(Object obj:set) {
					Object value=prop.get(obj);	
				 map.put(obj, value);
				 
				}
			 }
			 else {
				 // throwing exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
			 return map;
		}
		 
		 
		 // write the data into the properties file
		 
		 public void writekeyvalue(String key, String value) throws IOException, FrameworkException {
			 if(prop!=null) {
				 prop.setProperty(key, value);
				 
				 FileOutputStream fop = new FileOutputStream(filepath);
				 prop.store(fop, "file is saved successfully");
			 }
			 else {
				 // throw  exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
		}
		 
		 public void writekeyvalue(Object key, Object value) throws IOException, FrameworkException {
			 if(prop!=null) {
				 prop.put(key, value);
				 
				 FileOutputStream fop = new FileOutputStream(filepath);
				 prop.store(fop, "file is saved successfully");
			 }
			 else {
				 // throw  exception
				 FrameworkException exception = new FrameworkException("properties is pointing to null");
					System.out.println(exception);
					throw exception;
			 }
		 }

		



} 
		 
			 
		 
		
	

