package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginByAction {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/");
	//identify the username
	WebElement usernameTextField = driver.findElement(By.id("username"));
	//identify the password
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	//identify the login button
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	//create the object for Actions  class
	Actions actions = new Actions(driver);
	actions.sendKeys(usernameTextField, "admin").sendKeys(passwordTextField, "manager").click(loginButton).build().perform();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
