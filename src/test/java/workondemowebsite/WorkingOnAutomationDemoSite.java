package workondemowebsite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingOnAutomationDemoSite {
public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Register.html");
	//Enter the first name
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dwayne");
	//Enter the last name
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Johnson");
	//Enter the email
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Rock@123gmail.com");
	//Enter the phone no
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("2345678901");
	//Select Male
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	//Select all the check boxes
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.id("checkbox3")).click();
	//Functionality testing of all Skills dropdowns
	 List<WebElement> allDropDown = driver.findElements(By.tagName("select"));
	 for (WebElement dropdown : allDropDown) 
	 {
	   if(dropdown.isDisplayed()) 
	   {
		   Select dropdownSelect = new Select(dropdown);
		   List<WebElement> allOptions = dropdownSelect.getOptions();
		   for (WebElement option : allOptions) 
		   {
			if(dropdown.getAttribute("id").equals("Skills")) 
			{
				dropdownSelect.selectByVisibleText(option.getText());
				if(option.isSelected())
				{
				System.out.println(option.getText()+" is selected and it is verified");
				}
				else
				{
					System.out.println(option.getText()+" is not selected and it is verified");	
				}
			}
			if(dropdown.getAttribute("id").equals("yearbox")) 
			{
				dropdownSelect.selectByVisibleText(option.getText());
				if(option.isSelected())
				{
				System.out.println(option.getText()+" is selected and it is verified");
				}
				else
				{
					System.out.println(option.getText()+" is not selected and it is verified");	
				}
			}
			if(dropdown.getAttribute("id").equals("daybox")) 
			{
				dropdownSelect.selectByVisibleText(option.getText());
				if(option.isSelected())
				{
				System.out.println(option.getText()+" is selected and it is verified");
				}
				else
				{
					System.out.println(option.getText()+" is not selected and it is verified");	
				}
			}
			
	   }
	}	   
}

	 driver.quit();
}
}
