package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName_01 {
public static void main(String[] args) throws Throwable  {
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  Thread.sleep(2000);
  WebElement loginButton = driver.findElement(By.name("login"));
  loginButton.click();
  Thread.sleep(2000);
  driver.close();
}
}
