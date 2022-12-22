package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="E:\\Emexo_AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///E:/Emexo_AutomationTesting/CodeRepository4/BasicHtmlElement.html");
		Thread.sleep(4000);
		
		//WebElement femaleGenderRadio= driver.findElement(By.name("gender"));
		//WebElement femaleGenderRadio= driver.findElement(By.cssSelector("input[value='f']"));
		WebElement femaleGenderRadio= driver.findElement(By.xpath("//input[@value='f']"));
		femaleGenderRadio.click();
		Thread.sleep(4000);
		driver.quit();

	}

}
