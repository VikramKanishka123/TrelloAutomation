package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Acer/Desktop/page1.html");
	driver.findElement(By.id("t1")).sendKeys("VIKRAM");
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("RANJITHA");
	Thread.sleep(2000);
	driver.quit();
}
}
