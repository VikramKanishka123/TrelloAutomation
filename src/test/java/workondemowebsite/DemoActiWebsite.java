package workondemowebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActiWebsite {
	public static void main(String[] args) {
		// Step 01: Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		// Step 02: Enter the URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expectedLoginPageTitle = "OrangeHRM";
		System.out.println("expectedLoginPageTitle =" + expectedLoginPageTitle);
		String expectedLoginPageuRL = "login";
		System.out.println("expectedLoginPageuRL =" + expectedLoginPageuRL);

		if (wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))) {
			String actualLoginPageTitle = driver.getTitle();
			System.out.println("actualLoginPageTitle =" + actualLoginPageTitle);
			System.out.println("Login Page title is found correct and it is verified.");

			if (wait.until(ExpectedConditions.urlContains(expectedLoginPageuRL))) {
				String actualLoginPageUrl = driver.getCurrentUrl();
				System.out.println("actualLoginPageUrl =" + actualLoginPageUrl);
				System.out.println("Login Page URL is found correct and it is verified.");
				System.out.println("Login page is displayed upon the verification of title and URL.");

				// Step: 03 Enter the username
				WebElement usernametextField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				usernametextField.clear();
				usernametextField.sendKeys("Admin");

				// Step 04: Enter the password
				WebElement passwordTextField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
				passwordTextField.clear();
				passwordTextField.sendKeys("admin123");

				// Step 05: Click on Login Button
				WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
				loginButton.click();
				String expectedHomePageTitle = "OrangeHRM";
				System.out.println("expectedHomePageTitle =" + expectedHomePageTitle);

				if (wait.until(ExpectedConditions.titleIs(expectedHomePageTitle))) {
					String actualHomePageTitle = driver.getTitle();
					System.out.println("actualHomePageTitle =" + actualHomePageTitle);
					System.out.println("The Homepage title is found correct and it is verified.");

					String expectedHomePageUrl = "index";
					System.out.println("expectedHomePageUrl =" + expectedHomePageUrl);
					String actualHomePageuRL = driver.getCurrentUrl();
					System.out.println("actualHomePageuRL =" + actualHomePageuRL);

					if (wait.until(ExpectedConditions.urlContains(actualHomePageuRL))) {
						System.out.println("The Homepage URL is found correct and it is verified.");

						WebElement dropDown = driver.findElement(
								By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
						dropDown.click();
						WebElement logOutOption = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));

						if (wait.until(ExpectedConditions.visibilityOf(logOutOption)).isDisplayed()) {
							System.out.println("The HomePage Logout option is displayed and it is verified.");
							System.out.println("The HomePage is displayed");

							// Step 06: Click on Logout option
							logOutOption.click();
							if (wait.until(ExpectedConditions.titleIs(actualLoginPageTitle))) {
								System.out
										.println("Login page title is found correct after logout and it is verified.");

								if (wait.until(ExpectedConditions.urlContains(actualLoginPageUrl))) {
									System.out.println(
											"Login page URL is found correct after logout and it is verified.");
								} else {
									System.out.println(
											"Login page is not displayed after logout since URL found incorrect and it is verified.");
								}
							} else {
								System.out.println(
										"Login page is not displayed since after logout title found incorrect and it is verified.");
							}
						} else {
							System.out.println(
									"The Homepage is not displayed since the logout option is invisible and it is verified.");
						}
					} else {
						System.out.println(
								"The HomePage is not displayed since the URL is incorrect and it is verified.");
					}
				} else {
					System.out.println("Login page is not displayed since URL is incorrect and it is verified");
				}
			} else {
				System.out.println("Login page is not displayed since title is incorrect and it is verified.");
			}
			driver.manage().window().minimize();
			driver.quit();
		}
	}
}
