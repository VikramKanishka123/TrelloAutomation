package mousehover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoverHOver {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.vtiger.com/");
	WebElement resources = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(resources).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	WebElement phNo = driver.findElement(By.xpath("//p[normalize-space()='+91 9243602352']"));
	System.out.println(phNo.getText());
	driver.quit();	
}
}
