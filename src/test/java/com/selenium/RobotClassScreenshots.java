package com.selenium;

import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class RobotClassScreenshots {
	WebDriver driver;

	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/settings/profile");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void seleniumScreeshot() throws InterruptedException, Exception {
		File filesrc = null;
		File filescr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc, new File("path.jpg"));
	}

	@Test
	public void deskstopScreeshot() throws InterruptedException, Exception {

		// Creating Robot class object
		Robot robotClassObject = new Robot();

		// Get screen size
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		// Capturing screenshot by providing size
		BufferedImage tmp = robotClassObject.createScreenCapture(screenSize);

		// Defining destination file path
		String path = System.getProperty("user.dir") + "/ScreenCapturesPNG/" + "SS.png";

		// To copy temp image in to permanent file
		ImageIO.write(tmp, "png", new File(path));
	}
}
