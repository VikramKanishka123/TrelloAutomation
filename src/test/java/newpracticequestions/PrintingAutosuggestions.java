package newpracticequestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintingAutosuggestions {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("accenture");
		 List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(.,'accenture')]"));
		 for (int i = 0; i < autoSuggestions.size(); i++) 
		 {
			 System.out.println(autoSuggestions.get(i).getText());
		}
		 driver.quit();
	}
}
