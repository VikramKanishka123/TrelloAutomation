package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VCourts {
	public static void main(String[] args) throws Throwable {
		// Step 01: Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		// Step 02: Enter the URL
				driver.get("https://vcourts.gov.in/virtualcourt/");
				String expectedLoginPageTitle = "Virtual Court | Home";
				System.out.println("expectedLoginPageTitle ="+expectedLoginPageTitle);
				String expectedLoginPageUrl = "virtualcourt/";
				System.out.println("expectedLoginPageUrl ="+expectedLoginPageUrl);
				
				if(wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))) {
					String actualLoginPageTitle = driver.getTitle();
					System.out.println("actualLoginPageTitle ="+actualLoginPageTitle);	
					System.out.println("Login Page title is found correct and it is verified.");
					
					if(wait.until(ExpectedConditions.urlContains(expectedLoginPageUrl))) {
						String actualLoginPageUrl = driver.getCurrentUrl();
						System.out.println("actualLoginPageUrl ="+actualLoginPageUrl);
						System.out.println("Login Page URL is found correct and it is verified.");
						System.out.println("Login page is displayed upon the verification of title and URL.");
						
						//step 03:select the department dropdown
						WebElement dropdown = driver.findElement(By.tagName("select"));
						dropdown.click();
						Thread.sleep(3000);
						
						//step 04:select karnataka from dropdown
						if(dropdown.isDisplayed()) {
							Select dropdownSelect = new Select(dropdown);
							dropdownSelect.selectByIndex(1);
							Thread.sleep(3000);
							System.out.println("Dropdown is working properly and it is verfied");
						}
					}
				}
				driver.quit();
	}
}
