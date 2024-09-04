package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabilityOfCheckBox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	// identify the checkbox
	WebElement checkboxButton = driver.findElement(By.id("keepLoggedInCheckBox"));
	// check for the enability - +ve
	if(checkboxButton.isEnabled())
	{
		System.out.println("Boolean:Pass");
		System.out.println("Pass: The keepLoggedInCheckBox is enabled and it is verified.");
	}
	else
	{
		System.out.println("Boolean:Fail");
		System.out.println("Pass: The keepLoggedInCheckBox is disabled and it is verified.");	
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
