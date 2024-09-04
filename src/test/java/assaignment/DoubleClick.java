package assaignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.partialLinkText("Resources"));
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
	driver.findElement(By.partialLinkText("Customers")).click();
	Thread.sleep(2000);
	WebElement LogIn = driver.findElement(By.xpath("//span[text()='Login']"));
	a.moveToElement(LogIn).doubleClick().perform();
	String actualLoginPageTitle = "Login - Vtiger";
	String expectedLoginPageTitle = driver.getTitle();
	if(actualLoginPageTitle.equals(expectedLoginPageTitle))
	{
		System.out.println("Login page is displayed and it is found correct");
	}
	else
	{
		System.out.println("Login page is not displayed and it is found incorrect");
	}
	driver.quit();
}
}
