package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="E:\\Emexo_AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Emexo_AutomationTesting/CodeRepository4/BasicHtmlElement.html");
		Thread.sleep(1000);
		
		List<WebElement> listInput = driver.findElements(By.xpath("//input"));
		
		for(WebElement input : listInput)
		{
			System.out.println(input.getAttribute("type"));
			
		}
		Thread.sleep(1000);
		driver.quit();
	

	}

}
