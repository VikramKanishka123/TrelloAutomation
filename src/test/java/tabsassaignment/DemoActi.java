package tabsassaignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActi {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='About your actiTIME']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Read Service Agreement']")).click();
	Set<String> tabs = driver.getWindowHandles();
	for (String window1 : tabs) 
	{
		driver.switchTo().window(window1);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("actiTIME Online Terms of Service"))
		{
			Thread.sleep(2000);
			driver.close();
		}
		Thread.sleep(3000);
		driver.close();
	}
}
}
