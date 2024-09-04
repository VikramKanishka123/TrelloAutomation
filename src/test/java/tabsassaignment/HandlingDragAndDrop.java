package tabsassaignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDragAndDrop {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement src = driver.findElement(By.xpath("//h1[normalize-space()='Block 1']"));
	WebElement target = driver.findElement(By.xpath("//h1[normalize-space()='Block 4']"));
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.dragAndDrop(src, target).perform();
//	driver.quit();
}
}
