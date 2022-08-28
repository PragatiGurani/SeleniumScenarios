package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		FileInputStream f = new FileInputStream("./config.properties");
		properties.load(f);
		
		WebDriver driver=null;
		
		if(properties.getProperty("browsertoOpen").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}else if(properties.getProperty("browsertoOpen").equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Selenium files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.ie.driver",
					"F:\\Selenium files\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("Watch"); 
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(20);
		driver.navigate().back();
		Thread.sleep(20);
		Select s = new Select(driver.findElement(By.id("gh-cat")));
		s.selectByVisibleText("Crafts");
		driver.findElement(By.id("gh-btn")).click();
		
		
		
	}
}
