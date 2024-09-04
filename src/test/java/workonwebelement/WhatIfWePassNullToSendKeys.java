package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWePassNullToSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");

		// identify the username textField
		WebElement textField = driver.findElement(By.id("username"));
		// clearing the textField
		textField.clear();
		
		// after clearing entering null
		textField.sendKeys(null);
		// We Cannot Pass the Null value with sendKeys
		// IllegalArgumentException - Java - run - unchecked
		Thread.sleep(3000);

		driver.manage().window().minimize();
		driver.quit();
	}
}
