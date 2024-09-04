package handlinglistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPrintRev {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
	WebElement cpListBox = driver.findElement(By.id("cp"));
	Select s=new Select(cpListBox);
	List<WebElement> allOptions = s.getOptions();
	for(int i=0;i<allOptions.size();i++)
	{
		Thread.sleep(500);
		s.selectByIndex(i);
	}
	for(int i=allOptions.size()-1;i>=0;i--)
	{
		Thread.sleep(500);
		s.deselectByIndex(i);
	}
	driver.quit();
}
}
