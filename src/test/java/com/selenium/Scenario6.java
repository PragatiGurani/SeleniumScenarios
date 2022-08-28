package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario6 {
	// public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
	}

	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("gjhfjf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipart@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		//if(!((driver.findElement(By.xpath("//span[text()='Please enter valid Email ID/Mobile number']")).getText()).equals("Please enter valid Email ID/Mobile number"))) {
		if(!((driver.findElement(By.xpath("//span[@class='_2YULOR']")).getText()).equals("Please enter valid Email ID/Mobile number"))) {
			System.out.println("Has successfully logged in");
		}else {
			System.out.println("Has not logged in");
		}
		
	}
	
//	@AfterMethod
//	public void failResults(ITestResult result) {
//		if (result.getStatus() == ITestResult.SUCCESS)
//			System.out.println("loggedin");
//	}
}
