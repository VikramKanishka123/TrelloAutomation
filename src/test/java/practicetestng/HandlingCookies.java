package practicetestng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingCookies {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	/*Set<Cookie> cookies = driver.manage().getCookies();
	System.out.println(cookies.size());
	for (Cookie cookie : cookies) 
	{
		System.out.println(cookie.getName()+"-->"+cookie.getValue());
	}*/
	
	//Printing specific cookie according to name
	System.out.println(driver.manage().getCookieNamed("session-id-time"));
	driver.quit();	
}
}
