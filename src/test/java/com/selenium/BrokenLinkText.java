package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkText {
	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));

		System.out.println(" Total links and img in a page : " + linksList.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href") != null
					&& (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linksList.get(i));
			}
		}

		System.out.println(" Total Active links and img in a page : " + activelinks.size());
		
		for (int j = 0; j < activelinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();

			System.out.println(activelinks.get(j).getAttribute("href") +" ----> " + response);

		}
	}
}
