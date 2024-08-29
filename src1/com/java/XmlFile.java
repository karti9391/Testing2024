package com.java;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import java.io.File;
public class XmlFile {
	

	
	    public static void main(String[] args) {
	        try {
	            // Create a DocumentBuilder
	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	            
	            // Create a new Document
	            Document doc = dBuilder.newDocument();
	            
	            // Create root element
	            Element rootElement = doc.createElement("data");
	            doc.appendChild(rootElement);

	            // Create child elements
	            Element item1 = doc.createElement("item");
	            Text item1Text = doc.createTextNode("First Item");
	            item1.appendChild(item1Text);
	            rootElement.appendChild(item1);

	            Element item2 = doc.createElement("item");
	            Text item2Text = doc.createTextNode("Second Item");
	            item2.appendChild(item2Text);
	            rootElement.appendChild(item2);

	            // Write the content into an XML file
	            File xmlFile = new File("data.xml");
	            javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(new javax.xml.transform.dom.DOMSource(doc), new javax.xml.transform.stream.StreamResult(xmlFile));
	            
	            System.out.println("XML file created successfully!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


