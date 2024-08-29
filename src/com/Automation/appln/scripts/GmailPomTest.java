package com.Automation.appln.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Automation.PageObject.Gmail_Home_Page;
import com.Automation.Utilites.PojoReader;
import com.Automation.base.ActionEngine;
import com.Automation.customisedException.FrameworkException;

public class GmailPomTest extends ActionEngine{

	@Test
	public void HomeTest() throws IOException, EncryptedDocumentException, FrameworkException {
		
		enterUrl(PojoReader.getprconf().getvalue("qa_url"));
		Gmail_Home_Page.EnteruserName(PojoReader.getExcelreaderobj().getcellData("sheetName", "Job_Details", 0, 0));

		Gmail_Home_Page.NxtBtn();
		
	}
}
