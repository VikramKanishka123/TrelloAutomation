package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorId_03 {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
WebDriver driver=new ChromeDriver();
//max the browser
driver.manage().window().maximize();
//pass the main url
driver.get("https://demo.actitime.com/");
//identify the passwordTextField
WebElement PasswordTextField = driver.findElement(By.name("pwd"));
//enter the password
PasswordTextField.sendKeys("manager");
Thread.sleep(3000);
//driver.close();
}
}
