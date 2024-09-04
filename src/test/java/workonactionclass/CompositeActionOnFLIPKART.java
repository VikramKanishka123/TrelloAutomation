package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompositeActionOnFLIPKART {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAjwhdWkBhBZEiwA1ibLmJ43lEPuGEVk3Q-NT2yQndygWyYQJpCKFN4wTsAXuOFWJqQJ54biFhoCR2kQAvD_BwE");
		WebElement Grocery = driver.findElement(By.xpath("//div[contains(text(),'Grocery')]"));
		Actions actions = new Actions(driver);
		actions.pause(2000).moveToElement(Grocery).perform();
		driver.manage().window().maximize();
		driver.quit();
	}
}
