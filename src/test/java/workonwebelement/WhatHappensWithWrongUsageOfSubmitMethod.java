package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatHappensWithWrongUsageOfSubmitMethod {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	
	//find logInButton
	WebElement logInButton = driver.findElement(By.id("loginButton"));
	logInButton.submit();
	//UnsupportedOperationException - java - run - unchecked
	//Note: submit() can be called upon the <form> nested element
	Thread.sleep(3000);
	
	driver.manage().window().minimize();
	driver.quit();
}
}
