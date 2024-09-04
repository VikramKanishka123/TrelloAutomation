package handlingdisabledelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollToTheBottom {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.bbc.com/");
	WebElement y = driver.findElement(By.xpath("//span[text()='Future Planet']"));
//	JavascriptExecutor j=(JavascriptExecutor) driver;
//	//scroll till last
//	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	Thread.sleep(2000);
//	//scroll to the top
//	j.executeScript("window.scrollTo(0,0)");
//	Thread.sleep(2000);
	//using Actions class
	Actions a = new Actions(driver);
//	a.scrollByAmount(0, 3000).perform();
//scroll to particular element
	a.scrollToElement(y).perform();
	Thread.sleep(2000);
	driver.quit();
}
}
