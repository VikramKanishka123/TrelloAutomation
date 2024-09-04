package workondemowebsite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkOnDropDownOFOrangeHRM {
public static void main(String[] args) throws Throwable  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement usernametextField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	usernametextField.clear();
	usernametextField.sendKeys("Admin");
	WebElement passwordTextField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	passwordTextField.clear();
	passwordTextField.sendKeys("admin123");
	WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
	loginButton.click();
	driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
//	Thread.sleep(5000);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
	
	//select Employment status dropdown
	   WebElement dropdown = driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]"));
	   dropdown.click();
//	 Select dropDownSelect = new Select(dropdown);
//	 List<WebElement> allOptions = dropDownSelect.getOptions();
//	 for (WebElement option : allOptions) {
//		 System.out.println(option.getText());
//	}
	Thread.sleep(3000);
	driver.quit();
	
}
}
