package assaignment;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BBC {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.bbc.com/");
	// Find the latest news section on the page
//     java.util.List<WebElement> newsSection = driver.findElements(By.xpath("//h2[text()='Latest Business News']"));
     java.util.List<WebElement> title = driver.findElements(By.xpath("//a[@rev='most-popular|link']"));
    for (WebElement news : title) 
    {
     System.out.println(news.getText());
	}

    
	driver.quit();
	
}
}
