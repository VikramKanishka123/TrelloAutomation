package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByLocatorPartialLinkText_01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://alvas.org/");
	WebElement college = driver.findElement(By.partialLinkText("Medical Laboratory Technology"));
	try {
		new Actions(driver).scrollToElement(college).perform();
	}
	catch(Exception ob)
	{
		
	}
	try {
		college.click();
	}
	catch(Exception ob)
	{
		
	}	
	college.click();
	Thread.sleep(5000);
	driver.quit();
}
}
