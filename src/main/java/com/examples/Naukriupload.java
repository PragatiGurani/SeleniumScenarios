package com.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;


public class Naukriupload {
	public static void main(String[] args) throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage&action=modalOpen");
		
	

		driver.findElement(By.id("usernameField")).sendKeys("pragatigurani@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Pammu@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();
		driver.findElement(By.xpath("//em[@title='Upload']")).click();
		driver.findElement(By.id("fileUpload")).click();
		
		Robot robot= new Robot();
	    StringSelection stringSelection = new StringSelection("C:\\Users\\praga\\Desktop\\p\\Photo.jpg");
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, null);
	    Thread.sleep(2000);
	    robot.delay(250);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.delay(150);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(30000);

		
	}
}
