package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamic_GoogleSearch {
	// public static void main(String[] args) throws Exception {
	WebDriver driver;

	@BeforeMethod
	public void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}

//		for (int i = 0; i < list.size(); i++) {
//
//			if ((list.get(i).getText()).equalsIgnoreCase("automation testing")) {
//				System.out.println("found");
//				
//			} else {
//				System.out.println("not found");
//			}
//
//		}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("automation");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
		System.out.println(list.size());
		Thread.sleep(3000);
		for (WebElement ele : list) {
			Thread.sleep(2000);
			if (ele.getText().equalsIgnoreCase("automation testing")) {
				Thread.sleep(1000);
				ele.click();
				
			}
			break;
		}
		Thread.sleep(2000);
	}

//	@AfterMethod
//	public void teardown(ITestResult result) {
//		if (result.getStatus()==(ITestResult.FAILURE)) {
//			System.out.println("Testcase unable to locate automation testing");
//		}
//	}
}
