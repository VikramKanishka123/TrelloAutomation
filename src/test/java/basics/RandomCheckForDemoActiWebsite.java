package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheckForDemoActiWebsite {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(1000);
	
	//finding by username by id
//	 WebElement userNameTextField = driver.findElement(By.id("username"));
//	 userNameTextField.sendKeys("admin");
//	Thread.sleep(2000);
//	driver.quit();
	
	//finding by username by name
//	WebElement userNameTextField = driver.findElement(By.name("username"));
//	userNameTextField.sendKeys("admin");
//	Thread.sleep(2000);
//	driver.quit();
	
	//finding by username by className
//	driver.findElement(By.className("textField")).sendKeys("admin");	
//	Thread.sleep(2000);
//	driver.quit();
	
//	finding by username by tagName
//  WE CANNOT GO tagName BCOZ IT HAS DUPLICATES-12	
//	driver.findElement(By.tagName("input")).sendKeys("admin");
//	Thread.sleep(2000);
//	driver.quit();
	
//  linkText is not possible bcoz it has made from <input> not <a>
//  partialLinkText is not possible bcoz it has made from <input> not <a>
	
// finding by username by cssSelector
//	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
//	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
//	driver.findElement(By.cssSelector("input[class='textField']")).sendKeys("admin");
//	Thread.sleep(2000);
//	driver.quit();
	
//	finding by username by xPath
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");--Complete attValue
	
	driver.findElement(By.xpath("//input[contains(@name,'usernam')]")).sendKeys("admin");//--Partial attValue

	//  complete main TagText is not possible because it is very lengthy

	//  complete sub  TagText is not possible because there is no sub tag
	
	/*driver.findElement(By.xpath("//input[contains(.,'username')]")).sendKeys("admin");
	 partial main/sub tag text is not possible it is not available	
	 */

	// xpath by independent i dont know	
	Thread.sleep(2000);
	driver.quit();
}
}
