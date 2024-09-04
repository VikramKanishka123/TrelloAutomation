package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkText {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//identify the Forgotten password?
	 driver.findElement(By.linkText("Forgotten password?")).click();
	 Thread.sleep(3000);
	 driver.manage().window().minimize();
	 driver.quit();
}
}
