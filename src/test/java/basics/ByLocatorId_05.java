package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_05 {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
  WebDriver	driver=new ChromeDriver();
  //max the screen
  driver.manage().window().maximize();
  //pass the main url
  driver.get("https://demo.actitime.com/");
  //identify the keepLoggedInCheckBox
  WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
  //click on the keepLoggedInCheckBox
  keepLoggedInCheckBox.click();
  Thread.sleep(3000);
  driver.close();
  
}
}
