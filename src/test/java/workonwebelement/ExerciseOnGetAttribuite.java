package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOnGetAttribuite {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	try 
	{
		driver.get("https://pib.gov.in/");
	}	
	catch(WebDriverException ob)
	{
		driver.navigate().refresh();
	}
	Thread.sleep(3000);
	//75 years of Independence
	WebElement azadi = driver.findElement(By.xpath("//img[@title='Azadi Ka Amrit Mahotsav']"));
	Thread.sleep(2000);
	String azadiTooltiptext = azadi.getAttribute("title");
	System.out.println("azadiTooltiptext ="+azadiTooltiptext );
	Thread.sleep(2000);
	String azadiAlternativetext = azadi.getAttribute("alt");
	System.out.println("azadiAlternativetext ="+azadiAlternativetext );
	driver.quit();
}
}
