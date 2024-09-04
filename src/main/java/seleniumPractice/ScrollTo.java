package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollTo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
	/*	
		j.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);*/

		// Scroll to a Particular element
		WebElement y = driver.findElement(By.xpath("//h2[contains(text(),'Vtiger brings all your teams on the same page at e')]"));
        j.executeScript("arguments[0].scrollIntoView();",y);
        Thread.sleep(2000);
		driver.quit();
	}
}
