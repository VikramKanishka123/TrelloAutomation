package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginLogout {
public static void main(String[] args) {
	// Step 01: Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	// Step 02: Enter the URL
	driver.get("https://demo.actitime.com/");
	String expectedLoginPageTitle = "actiTIME - Login";
	System.out.println("expectedLoginPageTitle ="+expectedLoginPageTitle);
	String expectedLoginPageUrl = "login.do";
	System.out.println("expectedLoginPageUrl ="+expectedLoginPageUrl);
	
	if(wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle)))
	{
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle ="+actualLoginPageTitle);	
		System.out.println("Login Page title is found correct and it is verified.");

	if(wait.until(ExpectedConditions.urlContains(expectedLoginPageUrl)))
	{
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl ="+actualLoginPageUrl);
		System.out.println("Login Page URL is found correct and it is verified.");
		System.out.println("Login page is displayed upon the verification of title and URL.");
	
	// Step: 03 Enter the username
	WebElement usernametextField = driver.findElement(By.id("username"));
	usernametextField.clear();
	usernametextField.sendKeys("admin");
	
	// Step 04: Enter the password
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.clear();
	passwordTextField.sendKeys("manager");
	
	// Step 05: Click on Login Button
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	loginButton.click();
	String expectedHomePageTitle = "actiTIME - Enter Time-Track";
	System.out.println("expectedHomePageTitle ="+expectedHomePageTitle);

	if(wait.until(ExpectedConditions.titleIs(expectedHomePageTitle)))
	{
		String actualHomepageTitle = driver.getTitle();
		System.out.println("actualHomepageTitle ="+actualHomepageTitle);
		System.out.println("The Homepage title is found correct and it is verified.");
	
	String expectedHomePageUrl="submit_tt.do";
	System.out.println("expectedHomePageUrl ="+expectedHomePageUrl);
	String actualHomePageUrl = driver.getCurrentUrl();
	System.out.println("actualHomePageUrl ="+actualHomePageUrl);
	
	if(wait.until(ExpectedConditions.urlContains(expectedHomePageUrl)))
	{
		System.out.println("The Homepage URL is found correct and it is verified.");
	
	WebElement logoutOption = driver.findElement(By.id("logoutLink"));
	if(wait.until(ExpectedConditions.visibilityOf(logoutOption)).isDisplayed())
	{
		System.out.println("The HomePage Logout option is displayed and it is verified.");
		System.out.println("The HomePage is displayed");
	
	// Step 06: Click on Logout option
	logoutOption.click();
	if (wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))) 
	{
		System.out.println("Login page title is found correct after logout and it is verified.");
	
	if (wait.until(ExpectedConditions.urlContains(expectedLoginPageUrl)))
	{
		System.out.println("Login page URL is found correct after logout and it is verified.");
	} 
	 else {
			System.out.println("Login page is not displayed after logout since URL found incorrect and it is verified.");
		}
	}
	else
	{
		System.out.println("Login page is not displayed since after logout title found incorrect and it is verified.");
	}
	}
	else 
	{
		System.out.println("The Homepage is not displayed since the logout option is invisible and it is verified.");
	}
	}
	else 
	{
		System.out.println("The HomePage is not displayed since the URL is incorrect and it is verified.");
	}
	}
	else 
	{
		System.out.println("Login page is not displayed since URL is incorrect and it is verified");
	}
	}
	else 
	{
		System.out.println("Login page is not displayed since title is incorrect and it is verified.");
	}
	driver.manage().window().minimize();
	driver.quit();
	}
}	
}

