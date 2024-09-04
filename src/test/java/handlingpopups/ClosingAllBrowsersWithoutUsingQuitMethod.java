package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingAllBrowsersWithoutUsingQuitMethod {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allWindowHandles = driver.getWindowHandles();
	for (String browser : allWindowHandles) 
	{
		driver.switchTo().window(browser);
		Thread.sleep(2000);
		driver.close();
	}
}
}
