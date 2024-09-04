package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	//find identify the customer Service option
//	driver.findElement(By.xpath("//a[.=\"Today's Deals\"]/following-sibling::a[.='Customer Service']")).click();
	//ElementClickInterceptedException
	// When we try to click on the target ellement unknown ele will in between we call
	//it has Obscured Element.
	WebElement obscuredElement = driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/preceding-sibling::input"));
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
//-------------------------------------------------------------------------------------------	
    //find Today's deals
//	driver.findElement(By.xpath("//div[@id='nav-xshop']//preceding::a[normalize-space()=\"Today's Deals\"]")).click();
//	Thread.sleep(5000);
//	driver.manage().window().minimize();
//	driver.quit();
}
}
