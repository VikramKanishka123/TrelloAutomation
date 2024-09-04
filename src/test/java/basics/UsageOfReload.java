package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfReload {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.infosys.com/");
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();
}
}
