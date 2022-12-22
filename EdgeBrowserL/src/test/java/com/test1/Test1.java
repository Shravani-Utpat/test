package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main begin");
		System.setProperty("webdriver.edge.driver", "E:\\Emexo_AutomationTesting\\msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Main end");
	}
}
