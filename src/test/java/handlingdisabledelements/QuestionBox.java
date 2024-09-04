package handlingdisabledelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionBox {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Acer/Desktop/box.html");
	driver.findElement(By.id("t1")).sendKeys("VIKRAM");
    JavascriptExecutor j=(JavascriptExecutor) driver;
    j.executeScript("document.getElementById('t2').value='manager'");
    Thread.sleep(2000);
    driver.quit();
}
}
