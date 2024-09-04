package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_04 {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
 WebDriver driver=new ChromeDriver();
 //maximize the window
 driver.manage().window().maximize();
 //pass the main url
 driver.get("https://demo.actitime.com/");
 //identify the username textfield
 WebElement usernameTextField = driver.findElement(By.id("username"));
 //enter the username
 usernameTextField.sendKeys("admin");
 Thread.sleep(2000);
//identify the pwd textfield
WebElement pwdTextField = driver.findElement(By.name("pwd"));
//enter the username
pwdTextField.sendKeys("manager");
Thread.sleep(2000);
//identify the loginButton 
WebElement loginButton = driver.findElement(By.id("loginButton"));
//click on login button
loginButton.click();
driver.close();
}
}