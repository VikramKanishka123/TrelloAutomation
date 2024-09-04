package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalityTestingOfVCourts {
public static void main(String[] args) throws Throwable  {
	int count=0;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get("https://vcourts.gov.in/virtualcourt/");
    WebElement dropDown = driver.findElement(By.xpath("//select[@id='fstate_code']"));
    Select dropDownSelect = new Select(dropDown);
    List<WebElement> allOptions = dropDownSelect.getOptions();
    for (WebElement option : allOptions) 
    {
    	count++;
    	dropDownSelect.selectByVisibleText(option.getText());
		if(option.isSelected()) 
		{
		System.out.println(option.getText()+" is selected and passed");	
		}
		else
		{
			System.out.println(option.getText()+" is not selected");	
		}
	}
    System.out.println("Total no.of options are "+count);
    driver.quit();
}
}

