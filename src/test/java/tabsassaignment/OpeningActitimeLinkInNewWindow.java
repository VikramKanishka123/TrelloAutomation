package tabsassaignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpeningActitimeLinkInNewWindow {
public static void main(String[] args) throws AWTException, Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	WebElement actiTIMEInc = driver.findElement(By.linkText("actiTIME Inc."));
	Actions a = new Actions(driver);
	a.moveToElement(actiTIMEInc).contextClick().perform();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	Thread.sleep(3000);
	driver.quit();
}
}
