package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsInDropdown {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("vcourts"+Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Virtual Court']")).click();
		WebElement dropdown = driver.findElement(By.id("fstate_code"));
		Select s=new Select(dropdown);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		driver.quit();
		
		
	}
}
