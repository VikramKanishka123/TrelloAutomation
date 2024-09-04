package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
		WebElement cpBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpBox);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			s.selectByIndex(i);
		}
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(1000);
		driver.quit();
	}

}
