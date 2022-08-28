package com.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDatafromGoogleSearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("automation");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
		System.out.println(list.size());
		Thread.sleep(3000);
//		**************************		
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
//		if(xssfWorkbook.getsh)
		XSSFSheet xssfSheet = xssfWorkbook.createSheet();

		xssfSheet.createRow(0);
		xssfSheet.getRow(0).createCell(0).setCellValue("Sl no");
		xssfSheet.getRow(0).createCell(1).setCellValue("elements to search");

		for (int i = 1; i < list.size(); i++) {
			xssfSheet.createRow(i);

//			for (int j = 1; j < list.size(); j++) {
				
				Thread.sleep(2000);
				xssfSheet.getRow(i).createCell(0).setCellValue(i);
				
//				if (j == 1) {
					System.out.println(list.get(i).getText());
					xssfSheet.getRow(i).createCell(1).setCellValue(list.get(i).getText());
//				}
			}
//		}

		File file = new File("F:\\Selenium files\\DataToExcel\\DynamicSearchEXcel.xlsx");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		xssfWorkbook.write(fileOutputStream);
//			************************************
		Thread.sleep(2000);
	}

}
