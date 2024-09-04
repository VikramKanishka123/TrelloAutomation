package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AllLinksByUsingPOM 
{
	
	@FindBy(id="APjFqb")
	private WebElement txtbox;
	
	@FindBy(tagName="a")
	private List<WebElement> tags;
	
	public void driverInitialization(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
}
