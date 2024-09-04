package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//identify the usernameTextField
	WebElement usernameTextField = driver.findElement(By.id("username"));
	 Dimension usernameSize = usernameTextField.getSize();
	 int usernameWidth = usernameSize.getWidth();
	 System.out.println("usernameWidth is "+usernameWidth);
	 int usernameHeight = usernameSize.getHeight();
	 System.out.println("usernameHeight is "+usernameHeight);
	 driver.manage().window().minimize();
	 driver.quit();
}
}
