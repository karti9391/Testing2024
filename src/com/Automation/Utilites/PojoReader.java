package com.Automation.Utilites;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.Automation.Supporters.ExcelReader;
import com.Automation.Supporters.PropertiesReader;
import com.Automation.Supporters.TextReader;

public class PojoReader {

	public static PropertiesReader getprconf() throws IOException {
	PropertiesReader prconf = new PropertiesReader(Filepaths.configFilepath);
	return prconf;
	}
	
	public static PropertiesReader getpror() throws IOException {
		PropertiesReader pror = new PropertiesReader(Filepaths.orFilepath);
		return pror;
		}
	
	public static ExcelReader getExcelreaderobj() throws EncryptedDocumentException, IOException {
		ExcelReader excelreader = new ExcelReader(Filepaths.excelFilepath);
		return excelreader;
	}
	
	public static TextReader getTextreaderobj() throws IOException {
		TextReader textreader = new TextReader(Filepaths.txtFilepath);
		return textreader;
	}
	
	
	
	
	
	
	
}
