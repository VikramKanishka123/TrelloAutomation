package seleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switching_To_3rd_Window {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/");
		
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
        
	    Set<String> windows = driver.getWindowHandles();
	    
	    Iterator<String> it = windows.iterator();
	    
	    String parentWindow = it.next();
	    String childWindow = it.next();
	    
	    
	    driver.switchTo().window(childWindow);
	    
        driver.findElement(By.xpath("//div[@class='surround btn btn-outline-primary border-white']")).click();
	    
        Thread.sleep(2000);
        
	    driver.close();
	}
}
