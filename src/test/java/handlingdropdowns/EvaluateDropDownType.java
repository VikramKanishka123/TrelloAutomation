package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvaluateDropDownType {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify the month dropdown
	WebElement monthDropDown = driver.findElement(By.id("month"));
	//create the select class object
	//Select(WebElement dropdown)
	Select monthSelect=new Select(monthDropDown);
	if(monthSelect.isMultiple()) {
		System.out.println("Boolean True");
		System.out.println("Month Dropdwon is Multi-Select DropDown");
	}
	else
	{
		System.out.println("Boolean False");
		System.out.println("Month Dropdown is Single-Select Dropdown");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
