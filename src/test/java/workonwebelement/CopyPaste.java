package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// identify the usernameTextfield
		WebElement emailTextField = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		
		//identify the passwordTextField
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		
		//Enter the data to emailtetfield 		
		emailTextField.sendKeys("selenium");
		Thread.sleep(2000);
		
		//select all the data in the email textfield
		emailTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		
		//cut all the data in email text field		
		emailTextField.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		
		//paste the data to the password text field
		passwordTextField.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
        
		driver.manage().window().minimize();
		driver.quit();

	}
}
