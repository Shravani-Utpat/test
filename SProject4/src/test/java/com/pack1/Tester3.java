package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="E:\\Emexo_AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.get("https://www.google.com/");
		driver.navigate().to("file:///E:/Emexo_AutomationTesting/CodeRepository4/BasicHtmlElement.html");
		Thread.sleep(4000);
		String url = driver.getCurrentUrl(); // gives url opened in the test browser
		System.out.println("Url "+ url);
		Thread.sleep(1000);
		String title = driver.getTitle(); // gives the title of opened url
		System.out.println("title " + title);
		Thread.sleep(1000);
		System.out.println(driver.getPageSource());
		driver.quit();

	}

}
