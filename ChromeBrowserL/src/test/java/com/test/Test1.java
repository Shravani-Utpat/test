package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main begin");
		System.setProperty("webdriver.chrome.driver", "E:\\Emexo_AutomationTesting\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Main end");
	}
}
