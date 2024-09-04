package handlingpopups;

import java.util.Set;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingOnlyChildWindowPopUp {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println();
		for (String wh : windowHandle) 
		{
		  Thread.sleep(3000);
		  driver.switchTo().window(wh);
		  if(mainWindow.equals(wh))
		  {
			 
		  }
		  else
		  {
			  Thread.sleep(3000);
			  driver.close(); 
		  }
			  
		}
//		driver.quit();
	}
}
