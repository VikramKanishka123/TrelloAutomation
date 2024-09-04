package handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
public static void main(String[] args) throws Throwable {
//	FirefoxOptions option=new FirefoxOptions();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--enable-notifications");
	Thread.sleep(2000);
	WebDriver driver=new ChromeDriver();
//	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.yatra.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	option.addArguments("--disable-notifications");
	Thread.sleep(4000);
	driver.close();
}
}
