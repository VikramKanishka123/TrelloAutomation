package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfMoveToElement {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement forgotPassword = driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']"));
	Actions actions = new Actions(driver);
	actions.pause(2000).moveToElement(forgotPassword).perform();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
