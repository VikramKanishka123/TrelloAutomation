package workondemowebsite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareInsurance {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	//Enter policy no
	driver.findElement(By.id("policynumber")).sendKeys("123");
	Thread.sleep(2000);
	//click on DOB
	driver.findElement(By.id("dob")).click();
	//select year
	driver.findElement(By.xpath("//select[@aria-label='Select year']//option[@value='1997']")).click();
	Thread.sleep(3000);
	//click on month
	driver.findElement(By.xpath("//select[@aria-label='Select month']//option[@value='10']")).click();
	Thread.sleep(2000);
	//select date
	driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
	Thread.sleep(3000);
	 //Enter the contact no
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	//click on lets renew
	driver.findElement(By.id("renew_policy_submit")).click();
	Thread.sleep(3000);
	//after clicking lets renew if we are getting "Please enter valid Policy No."
	WebElement errorText= driver.findElement(By.id("policynumberError"));
	System.out.println(errorText.getText());
	if(errorText.getText().equals("Please enter valid Policy No."))  
	{
	System.out.println("Test case is passed and it is verified");	
	}
	else
	{
		System.out.println("Test case is not passed and it is verified");	
	}
//	 Thread.sleep(3000);
	driver.close();
}
}
