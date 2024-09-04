package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMLogin {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	WebElement usernameTF = driver.findElement(By.name("username"));
	WebElement passwordTF = driver.findElement(By.name("password"));
//	WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
//	WebElement Logo = driver.findElement(By.cssSelector("img[alt='company-branding']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(passwordTF).click(passwordTF).perform();
//	actions.contextClick(Logo).perform();
//	actions.sendKeys(usernameTF, "Admin").sendKeys(passwordTF,"admin123").click(loginButton).build().perform();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
}
}
