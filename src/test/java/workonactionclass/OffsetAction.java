package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OffsetAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menSection = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menSection).pause(2000).moveByOffset(73, 0).build().perform();
		driver.manage().window().minimize();
		driver.quit();
	}
}
