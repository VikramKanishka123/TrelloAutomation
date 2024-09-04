package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	// identify the men T-shirts under top wear
	driver.findElement(By.xpath("//a[text()='Topwear']/../..//a[text()='T-Shirts']")).click();
	Thread.sleep(4000);
	//ElementNotInteractableException
	//Element is their in the DOM but it is not  visible and hence it is non-interactable.
	driver.manage().window().minimize();
	driver.quit();
}
}
