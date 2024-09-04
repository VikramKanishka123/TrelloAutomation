package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com/");
	String actualLoginPageUrl=driver.getCurrentUrl();
	System.out.println("actualLoginPageUrl="+actualLoginPageUrl);	
}
}

