package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitOnOtherElements {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");

		// find maleRadioButton
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']//following::input[@value='2']"));

		maleRadioButton.submit();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
