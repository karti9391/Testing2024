package com.Automation.appln.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Automation.PageObject.OpenCart_HeaderPage;
import com.Automation.PageObject.OpenCart_LaptopaAndNoteBooks;
import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.customisedException.FrameworkException;

public class OpencartTest extends ActionEngine {

	@Test
	
	public void verifyLaptopsNotebooksSize() throws FrameworkException, IOException, InterruptedException {
		enterUrl(PojoReader.getprconf().getvalue("opencart_url"));
		//String actualTitle=getpageTitle();
		//System.out.println("page title is: "+actualTitle);
		
		verifyTitleofage(PojoReader.getExcelreaderobj().getcellData("sheetname", "OpenCart", 0, 0));
		OpenCart_LaptopaAndNoteBooks.mouseHoveronlaptopsNoteBooks();
		OpenCart_LaptopaAndNoteBooks.clickShowAlllaptopsNoteBooks();
		OpenCart_LaptopaAndNoteBooks.getActualSizeLaptopsNoteBooks();
		OpenCart_LaptopaAndNoteBooks.getexpLaptopsNoteBooksSize();
		OpenCart_LaptopaAndNoteBooks.validateLaptopsNoteBookssize();
		
}
	@Test
	public void verifyHeaders() throws FrameworkException, IOException, EncryptedDocumentException, InterruptedException {
		enterUrl(PojoReader.getprconf().getvalue("opencart_url"));
		verifyTitleofage(PojoReader.getExcelreaderobj().getcellData("sheetname", "OpenCart", 0, 0));
		OpenCart_HeaderPage.validateHeaders();
	}
}