package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificChildWindow {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allWindowHandles = driver.getWindowHandles();
	for (String title : allWindowHandles) 
	{
		driver.switchTo().window(title);
		String title1=driver.getTitle();
		System.out.println(title1);
		if (title1.equals("Facebook")) 
		{
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			
		}
	}
	
}
}
