package com.Automation.Supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Automation.customisedException.FrameworkException;

public class TextReader {
    private String filepath;
    private File file;
    private String value;
    
	
	public TextReader(String filepath) throws IOException {
		this.filepath=filepath;
		 file = new File(filepath);
		Boolean status= file.createNewFile();
		if(status) {
			System.out.println("file is creating newly");
		}
		else System.out.println("returns existing file");
	}
	
	  FileWriter filewriter = new FileWriter(filepath);
	BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
	FileReader filereader = new FileReader(file);
	BufferedReader bufferedreader = new BufferedReader(filereader);
	
	
	// i want to write the data into text files
	
	public void writeData(String Data) throws IOException, FrameworkException {
		if(bufferedwriter!=null) {
			bufferedwriter.write(Data);
			bufferedwriter.flush();
		}
		else {
			// throw exception
			FrameworkException exception = new FrameworkException("bufferedwriter is pointing to null");
			System.out.println(exception);
			throw exception;
		}

	}
	public void writeData(int Data) throws IOException, FrameworkException {
		if(bufferedwriter!=null) {
			bufferedwriter.write(Data);
			bufferedwriter.flush();
		}
		else {
			// throw exception
			FrameworkException exception = new FrameworkException("bufferedwriter is pointing to null");
			System.out.println(exception);
			throw exception;
		}

	}
	
	
	// i want to read the Data from text files
	
	public String getData() throws IOException, FrameworkException {
		if(bufferedreader!=null) {
			value=bufferedreader.readLine();
		}
		else {
			//throw exception
			FrameworkException exception = new FrameworkException("bufferedreader is pointing to null");
			System.out.println(exception);
			throw exception;
		}
		return value;
	}
	
	// i want to get the total data from file
	
	public List<String> getTotalData() throws IOException, FrameworkException {
		List<String> fileData = new ArrayList<String>();
		if(bufferedreader!=null) {
			value=bufferedreader.readLine();
			fileData.add(value);
			}
		else {
			// throw the exception
			FrameworkException exception = new FrameworkException("bufferedreader is pointing to null");
			System.out.println(exception);
			throw exception;
		}
		return fileData;
	}
	
	
	
	
	
}
