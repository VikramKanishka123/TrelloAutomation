package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//find the login button
	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
	// get the background-color
	String backgroundcolor = loginButton.getCssValue("background-color");
	System.out.println("backgroundcolor ="+backgroundcolor);
	//get the font-family
	String fontfamily = loginButton.getCssValue("font-family");
	System.out.println("fontfamily ="+fontfamily);
	//get the font-weight
	String fontweight = loginButton.getCssValue("font-weight");
	System.out.println("fontweight "+fontweight);
	//get the font-size
	String fontsize = loginButton.getCssValue("font-size");
	System.out.println("fontsize ="+fontsize);
	driver.manage().window().minimize();
	driver.quit();
}
}
