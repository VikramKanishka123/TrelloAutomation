package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingMainWindowNotChildWindows {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	String mainWindow = driver.getWindowHandle();
	Set<String> windowHandle = driver.getWindowHandles();
	for (String wh : windowHandle) 
	{
	  Thread.sleep(3000);
	  driver.switchTo().window(wh);
	  if(mainWindow.equals(wh))
	  {
		  Thread.sleep(3000);
		  driver.close();
	  }
	  else
	  {
		   
	  }
		  
	}
}
}

