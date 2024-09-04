package tabsassaignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseCurrentTab {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	Set<String> allWh = driver.getWindowHandles();
	for (String option : allWh) 
	{
		driver.switchTo().window(option);
		String title = driver.getTitle();
		if(title.equals("actiTIME - Time Tracking Software for Cost-Effective Projects"))
		{
			Thread.sleep(3000);
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.quit();
}
}
