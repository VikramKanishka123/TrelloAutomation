package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementReferenceException 
{
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement unTxtBox = driver.findElement(By.id("email"));
	driver.navigate().refresh();
	unTxtBox.sendKeys("admin"+Keys.ENTER);
	driver.quit();
}
}
