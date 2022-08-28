package com.selenium;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingWithoutThirdVar {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//
//
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[text()='Google Search']")).click();
//	}
		int[] arr = { 20, 10, 30 };
		
		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	
	}
}