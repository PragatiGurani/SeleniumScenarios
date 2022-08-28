package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Scenario2 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
	}

	@Test
	public void createFacbookAccount() throws InterruptedException {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.facebook.com/", url);

		Boolean b = driver.findElement(By.xpath("//*[contains(text(), 'Create New Account')]")).isDisplayed();
		if (b) {
			System.out.println("Button dispalyed");
		}else {
			System.out.println("Button not dispalyed");
		}
		Thread.sleep(20);
		driver.findElement(By.xpath("//*[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(20);
		System.out.println(driver.getTitle());
		
		Thread.sleep(20);
		driver.findElement(By.xpath("//*[@id=\"u_n_b_iD\"]")).sendKeys("ABC");
		Thread.sleep(20);
		driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("ABC");

	}

//	@AfterMethod
//	public void teardown() {
//
//	}
}
