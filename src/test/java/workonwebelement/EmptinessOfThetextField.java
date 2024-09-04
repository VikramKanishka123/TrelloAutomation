package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptinessOfThetextField {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//identify the username textfield
	WebElement usernameTextField = driver.findElement(By.id("username"));
	//att is there but it will not carry any value
	String valueAttvalue = usernameTextField.getAttribute("value");
	System.out.println("valueAttvalue ="+valueAttvalue);
	if(valueAttvalue.isEmpty())
	{
		System.out.println("Bollean True");
		System.out.println("The Attribute Value is empty string");
	}
	else 
	{
		System.out.println("Boolean False");
		System.out.println("The Attribute Value is not an empty string");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
