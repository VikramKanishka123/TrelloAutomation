package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Acer/Desktop/page1.html");
	driver.findElement(By.id("t1")).sendKeys("a");
	driver.switchTo().frame("f1");
	Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("b");
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.id("t1")).sendKeys("c");
	WebElement f = driver.findElement(By.id("f1"));
	driver.switchTo().frame(f);
	Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("d");
	Thread.sleep(2000);
	driver.quit();
	

}
}
