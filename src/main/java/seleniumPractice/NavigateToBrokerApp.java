package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateToBrokerApp {
	public static void main(String[] args) throws InterruptedException {
    
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.nobroker.in/");
	driver.findElement(By.id("listPageSearchLocality")).sendKeys("churchgate");
	Thread.sleep(10000);
	WebElement mumbaiButton = driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']"));
	mumbaiButton.click();
	Thread.sleep(50000);
	
	//driver.quit();
	
	}

}
