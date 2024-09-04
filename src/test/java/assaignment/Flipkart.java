package assaignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//i phone 14 pro max
public class Flipkart {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("i phone 14 pro max");
	List<WebElement> allOptions = driver.findElements(By.xpath("//span[contains(.,'i phone 14 pro max')]"));
	for (WebElement options : allOptions) {
		System.out.println(options.getText());
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='lrtEPN _17d0yO'][normalize-space()='i phone 14pro max']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
