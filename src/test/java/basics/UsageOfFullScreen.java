package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfFullScreen {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.microsoft.com/en-in");
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
}
}
