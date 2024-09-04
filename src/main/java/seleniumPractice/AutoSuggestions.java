package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestions {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("Naukri");
         List<WebElement> allTags = driver.findElements(By.xpath("//span[contains(.,'naukri')]"));
        
        for(int i=0;i<allTags.size();i++)
        {
        	System.out.println(allTags.get(i).getText());
        }
        driver.quit();
	}

}
