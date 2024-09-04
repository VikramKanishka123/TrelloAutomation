package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_02 {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
   WebDriver driver=new ChromeDriver();
   //maximze the browser
   driver.manage().window().maximize();
   //pass the main url
   driver.get("https://demo.actitime.com/");
   Thread.sleep(2000);
   //identify the username textfield
   WebElement usernameTextField = driver.findElement(By.id("username"));
//Enter the username
   usernameTextField.sendKeys("admin");
   Thread.sleep(4000);
   driver.close();
}
}
