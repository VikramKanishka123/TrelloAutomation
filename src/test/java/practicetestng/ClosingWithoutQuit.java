package practicetestng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingWithoutQuit 
{
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	Set<String> apple = driver.getWindowHandles();
	for (String tabs : apple) 
	{
		driver.switchTo().window(tabs);
		Thread.sleep(2000);
		driver.close();
	}
}
}
