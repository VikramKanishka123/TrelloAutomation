package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheckForMalaichaWebsite {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//pass th main url
	driver.get("https://shop-global.malaicha.com/");
	Thread.sleep(1000);
	
//	find register/login button by id
//	WebElement loginRegisterButton = driver.findElement(By.id("my-acc-btn"));
//	Thread.sleep(2000);
//	loginRegisterButton.click();
//	Thread.sleep(2000);
//	driver.quit();
	
//	find register/login button by className
//	WebElement loginRegisterButton = driver.findElement(By.className("transparent"));
//	Thread.sleep(2000);
//	loginRegisterButton.click();
//	Thread.sleep(2000);
//	driver.quit();
	
//	find register/login button by tagName
//	driver.findElement(By.tagName("button")).click();
//	Thread.sleep(2000);
//	driver.quit();
	
//	find register/login button by CSS using id
//	driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();	
//	Thread.sleep(2000);
//	driver.quit();
	
//	find register/login button by CSS using className
//	driver.findElement(By.cssSelector("button[class='transparent']")).click();	
//	Thread.sleep(2000);
//	driver.quit();

//	BY xPath
//xPath by completeAttValue
//    driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
//	driver.findElement(By.xpath("//button[@class='transparent']")).click();
//	Thread.sleep(2000);
//	driver.quit();

//	xPath by partialAttValue
//	driver.findElement(By.xpath("//button[contains(@id,'my-acc-b')]")).click();
//	driver.findElement(By.xpath("//button[@class='transparent']")).click();
//	Thread.sleep(2000);
//	driver.quit();
	
//	xpath by partial main/sub Tagtext
//	driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
//	driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
//	Thread.sleep(2000);
//	driver.quit();

//	independent and dependent xpath
//	driver.findElement(By.xpath("//span[@class='loginRegister']")).click();
	driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
