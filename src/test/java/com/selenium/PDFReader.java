package com.selenium;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.excel.ReadDataFromExcel;

public class PDFReader  {
	String pdfContent;
	
	@Test
	public void readerthroughExcel() throws Exception {
		ReadDataFromExcel.readFromExcel();

	}

	@Test(dependsOnMethods = { "readerthroughExcel" })
	public void reader() throws IOException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium%20files/file/Details%20for%20PDFReader.pdf");

		String currentUrl = driver.getCurrentUrl();
		URL url = new URL(currentUrl);

//		URL url = new URL("https://www.betterteam.com/downloads/employee-information-form-download-20170810.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
	     pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);

	}

	@Test(dependsOnMethods = { "reader" })
	public void comparision_of_excel() {
		// System.out.println("=================="+listDataExcel);

//		Boolean a = ReadDataFromExcel.listDataExcel.contains("Pragati Gurani");
//		Boolean b = pdfContent.contains("Pragati Gurani");
////		Assert.assertEquals(a, b);
//	System.out.println(a);
//	System.out.println(b);

		if ((ReadDataFromExcel.listDataExcel.contains("abc@gmail")) == (pdfContent.contains("abc@gmail"))) {
			System.out.println("Form contains the test data ");
		} else {
			System.out.println("Form doesn't contains the test data ");
		}
	}
}
