package assaignment;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////div[@class='_4rR01T']/../..//div[@class='_30jeq3 _1_WHN1']
public class FlipkartiPhoneSearch {
	public static void main(String[] args) throws Throwable {
		int count=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		// closing the pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// Entering the data in search field
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("i phone 14 pro max" + Keys.ENTER);

		
		//Finding all the iphone 14 pro max 
		List<WebElement> nameElement = driver.findElements(By.className("_4rR01T"));
		
		//Finding all the prices of iphone 14 pro max
		 List<WebElement> priceElement = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        
		for (WebElement listing : nameElement) 
		{
				System.out.println("Product name -->" +listing.getText());
					}

		
		driver.quit();
	}
}
