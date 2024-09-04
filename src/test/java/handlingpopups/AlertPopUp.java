package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.cssSelector(".btn.btn-danger")).click();
//    driver.findElement(By.cssSelector(".analystic[href='#CancelTab']")).click();
//    driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
//	String text = driver.switchTo().alert().getText();
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	a.accept();
//	a.dismiss();
//	driver.switchTo().alert();
	driver.quit();
}
}
