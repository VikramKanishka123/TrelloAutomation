package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_01 {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
  WebDriver	driver=new ChromeDriver();
  //maximze the browser
  driver.manage().window().maximize();
  //pass the main url
  driver.get("https://demo.actitime.com/");
  Thread.sleep(3000);
  //identify the login button
 WebElement loginButton = driver.findElement(By.id("loginButton"));
 //click oon button
 loginButton.click();
 Thread.sleep(3000);
 //driver.close();
}
}
