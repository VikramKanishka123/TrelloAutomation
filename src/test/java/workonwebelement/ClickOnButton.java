package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//find login button
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
