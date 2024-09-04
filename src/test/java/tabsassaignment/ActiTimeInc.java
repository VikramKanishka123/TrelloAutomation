package tabsassaignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeInc {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	//Entering the username
	driver.findElement(By.id("username")).sendKeys("admin");
	//Entering the password
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//clicking on login button
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	//clicking on X to close the popup
	driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
	//clicking on About your actiTIME
	driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	//clicking on Read Service Aggrement
	driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
	Set<String> allwh = driver.getWindowHandles();
	System.out.println("Available Handles Present---> " + allwh);
	String expectedTitle = "actiTIME Online Terms of Service"; 
	// Find Tagtext of <title> in <head> of DOM
	System.out.println("Expected title: " + expectedTitle);
	//Transfering to new window
	for (String wh : allwh) 
	{
		driver.switchTo().window(wh);
		String actualTitle = driver.getTitle();
		System.out.println("actual title: " + actualTitle);
		if (actualTitle.equals(expectedTitle)) 
		{
			// capturing all Headers
			List<WebElement> allH2 = driver.findElements(By.xpath("//h2"));
			System.out.println("printing all headers");
			for (WebElement h2 : allH2) 
			{
				System.out.println(h2.getText());
			}
		}
	}
	driver.close();
	Thread.sleep(2000);
	driver.quit();
}
}
