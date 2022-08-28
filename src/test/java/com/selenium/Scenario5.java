package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Practice_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).build().perform();
		driver.findElement(By.linkText("Shortlist")).click(); // clickon drop select
		// driver.findElement(By.xpath("//span[text()='Google']")).click();
		Thread.sleep(30);
		driver.findElement(By.id("userName")).click();
		Thread.sleep(30);
		driver.findElement(By.id("userName")).sendKeys("gfjhfj");
		Thread.sleep(30);
		driver.findElement(By.xpath("//span[text()='Google']")).click(); //click on google button
		Thread.sleep(30);
		
		Set<String> set = driver.getWindowHandles();
		String ele = driver.getWindowHandle();

		for (String s : set) {
			if (!(s.equals(ele))) {
				driver.switchTo().window(s);
				Thread.sleep(30);
				System.out.println("title of 2nd page"+driver.getTitle());
				Thread.sleep(30);
//				driver.findElement(By.xpath("//div[text()='Use another account']")).click();
//				Thread.sleep(30);
				driver.findElement(By.name("identifier")).sendKeys("gjhfj");
			}
		}
	}
}
