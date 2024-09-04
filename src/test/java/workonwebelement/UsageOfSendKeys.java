package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	//identify the username textField
	WebElement textField = driver.findElement(By.id("username"));
	//here it will append the data to the same textField
	textField.sendKeys("admin");
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
}
}
