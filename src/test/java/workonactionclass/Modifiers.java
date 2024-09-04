package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modifiers {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement usernameTF = driver.findElement(By.id("email"));
	Actions actions = new Actions(driver);
	actions.sendKeys(usernameTF, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("a").keyDown(Keys.SHIFT).sendKeys(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
}
}
