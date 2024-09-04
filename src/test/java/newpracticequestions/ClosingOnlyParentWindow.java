package newpracticequestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingOnlyParentWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> window1 = driver.getWindowHandles();
        for (String wh : window1) 
        {
        	Thread.sleep(3000);
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(3000);
		}             
	}
}
