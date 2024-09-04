package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	//identify the signInButton
	WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	signInButton.submit();
	Thread.sleep(3000);
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
