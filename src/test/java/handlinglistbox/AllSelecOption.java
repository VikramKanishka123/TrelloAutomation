package handlinglistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelecOption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
	WebElement pvListBox = driver.findElement(By.id("pv"));
	Select s=new Select(pvListBox);
	List<WebElement> allOptions = s.getAllSelectedOptions();
	for(int i=0;i<allOptions.size();i++)
	{
		System.out.println(allOptions.get(i).getText());
	}
	driver.quit();
}
}
