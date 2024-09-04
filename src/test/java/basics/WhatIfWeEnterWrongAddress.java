package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//In this programe we will get NoSuchElementException
  
public class WhatIfWeEnterWrongAddress {
public static void main(String[] args) throws Throwable {
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  WebElement loginButton = driver.findElement(By.id("u_0_5_2g"));
  Thread.sleep(2000);
  loginButton.click();
  driver.close();
  
}
}
