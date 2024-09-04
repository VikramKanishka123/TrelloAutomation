package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfIsEnabled {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
	Thread.sleep(4000);
	//identify the zipFile
	WebElement zipFile = driver.findElement(By.xpath("//td[normalize-space()='Oracle Solaris (x86 systems, 64-bit)']/..//a[contains(text(),'ZIP')]"));
	zipFile.click();
	Thread.sleep(4000);
	//identify the disabled button you will get after pressing zipFile icon
	WebElement disabledButton = driver.findElement(By.xpath("//input[@placeholder=' ']//following::div[@class='obttns']"));
    if(disabledButton.isEnabled())
    {
    	System.out.println("Boolean True - Fail - Negative Testing");  	
    }
    else 
    {
		System.out.println("Boolean False - Negative Testing - Pass");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
