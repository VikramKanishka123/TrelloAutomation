package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	
	//identify the username textField
	WebElement textField = driver.findElement(By.id("username"));
	//clearing the textField
	textField.clear();
	//after clearing entering the value
	textField.sendKeys("admin");
	Thread.sleep(3000);
	
    //identify the passwordTextField
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	////clearing the textField
	passwordTextField.clear();
	//after clearing entering the password
	passwordTextField.sendKeys("manager");
	Thread.sleep(3000);
	
    //identify the logInButton
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	
	driver.manage().window().minimize();
	driver.quit();
}
}
