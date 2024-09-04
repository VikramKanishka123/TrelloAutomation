package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText_01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgotPasswordOption = driver.findElement(By.linkText("Forgotten password?"));
	Thread.sleep(2000);
	forgotPasswordOption.click();
	driver.quit();
}
}
