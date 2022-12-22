package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4a {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="E:\\Emexo_AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///E:/Emexo_AutomationTesting/CodeRepository4/BasicHtmlElement.html");
		Thread.sleep(2000);
		
		WebElement userNameTextField= driver.findElement(By.name("username"));
		userNameTextField.sendKeys("anyUserName");
		Thread.sleep(4000);
		userNameTextField.clear();
		Thread.sleep(4000);
		
		WebElement selenuimCheckBox= driver.findElement(By.name("skill"));
		selenuimCheckBox.click();
		Thread.sleep(4000);
		
		WebElement testingCheckBox= driver.findElement(By.xpath("//input[@value='testing']"));
		testingCheckBox.click();
		Thread.sleep(4000);
		
		WebElement javaCheckBox= driver.findElement(By.cssSelector("input[value='java']"));
		javaCheckBox.click();
		Thread.sleep(4000);
		
		WebElement addressTextArea= driver.findElement(By.xpath("//textarea[@id='address']"));
		addressTextArea.sendKeys("anyaddress");
		Thread.sleep(4000);
		addressTextArea.clear();
		Thread.sleep(4000);
		
		driver.quit();

	}

}
