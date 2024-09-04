package tabsassaignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfTabsInTheBrowser {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	Set<String> allWh = driver.getWindowHandles();
	int count = allWh.size();
	System.out.println(count);
	for (String window1 : allWh) 
	{
		driver.switchTo().window(window1);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
	
}
}
