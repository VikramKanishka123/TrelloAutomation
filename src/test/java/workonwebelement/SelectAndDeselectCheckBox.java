package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//find keep me loggedInCheckBox
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	Thread.sleep(3000);
	//de-selecting the keep me loggedInCheckBox
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
