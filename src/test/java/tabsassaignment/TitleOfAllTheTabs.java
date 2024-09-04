package tabsassaignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfAllTheTabs {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='actiTIME Inc.']")).click();
	Thread.sleep(2000);
	Set<String> tabs = driver.getWindowHandles();
	for (String window1 : tabs) 
	{
		driver.switchTo().window(window1);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
}
}
