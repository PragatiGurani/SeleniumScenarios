package com.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {
//	public static void writeData() throws Exception {
	public static void main(String[] args) throws Exception {

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
		XSSFSheet xssfSheet = xssfWorkbook.createSheet("DynamicSearch");

		xssfSheet.createRow(0);
		xssfSheet.getRow(0).createCell(0).setCellValue("url");
		xssfSheet.getRow(0).createCell(1).setCellValue("Text to search");

		xssfSheet.createRow(1);
		xssfSheet.getRow(1).createCell(0).setCellValue("https://www.google.com/");
		xssfSheet.getRow(1).createCell(1).setCellValue("Automation");

		File file = new File("F:\\Selenium files\\DataToExcel\\DynamicSearchEXcel.xlsx");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		xssfWorkbook.write(fileOutputStream);
	}
}
