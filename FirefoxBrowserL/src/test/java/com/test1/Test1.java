package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main begin");
		System.setProperty("webdriver.gecko.driver", "E:\\\\Emexo_AutomationTesting\\\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Main end");
	}

}
