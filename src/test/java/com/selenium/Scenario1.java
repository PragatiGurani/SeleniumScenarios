package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Scenario1 {
//public static void main(String[] args) throws Exception {

	public WebDriver driver;

	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qatechhub.com");
	}

	@Test
	public void getTitleOfPage() throws InterruptedException {
		String element = driver.getTitle();
		Assert.assertEquals("QA Automation Tools Trainings and Tutorials | QA Tech Hub", element);
		Thread.sleep(20);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(20);
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	@AfterMethod
	public void dropdown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("fhgfjhgyut");
		}
	}

}
