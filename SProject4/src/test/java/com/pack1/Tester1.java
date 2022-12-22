package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="E:\\Emexo_AutomationTesting\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(2000);
		
		driver.manage().window().maximize(); // maximize the browser
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		driver.navigate().to("file:///E:/Emexo_AutomationTesting/CodeRepository4/BasicHtmlElement.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.quit();

	}
	/*
	 * driver.navigate() has back() and forward() functionalities whereas driver.get() don't
	*/

}
