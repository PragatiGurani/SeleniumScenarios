package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario7 {
	WebDriver driver;

	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws InterruptedException {
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		 action.dragAndDrop(driver.findElement(By.xpath("//p[text()='Drag me to my target']")), driver.findElement(By.id("droppable"))).build().perform();

//		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
//				.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		Thread.sleep(3000);

	}

//	@AfterMethod
//	public void failResults() {
//		driver.quit();
//	}
}
