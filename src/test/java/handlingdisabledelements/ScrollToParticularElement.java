package handlingdisabledelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollToParticularElement {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.bbc.com/");
	WebElement y   = driver.findElement(By.xpath("//a[@class='media__link'][normalize-space()='Beauty industry is sexist, says make-up icon']"));
	JavascriptExecutor j=(JavascriptExecutor) driver;
    //j.executeScript("window.scrollBy(0,"+y+")"); -->X
	j.executeScript("arguments[0].scrollIntoView();",y);
	Thread.sleep(3000);
	driver.quit();
}
}
