package assaignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WhatsApp_15_07_2023 {
	@Test
	public void search() {
		int i = 1;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");

		// closing the pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// Entering the data in search field
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("i phone 11" + Keys.ENTER);
		// Finding all the iphone 11
		List<WebElement> nameElement = driver.findElements(By.className("_4rR01T"));
		// Finding all the prices of iphone 11
		List<WebElement> priceElement = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (WebElement listing : priceElement) {
			System.out.println("Product " + i + "-->" + listing.getText());
			i++;
		}
		driver.quit();
	}

	@Test
	public void printUrl() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs" + Keys.ENTER);
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
//	System.out.println(allUrls.size());
		for (WebElement name : allUrls) {
			System.out.println(name.getAttribute("href"));
		}
		driver.quit();
	}

	@Test
	public void qSpider() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("qspiders");

		Thread.sleep(2000);
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(.,'qspiders')]"));
		int size = allSuggestions.size();
//		System.out.println(size);
		for (int i = 0; i < size; i++) 
		{
			WebElement sugg = allSuggestions.get(i);
			System.out.println(sugg.getText());
			if (i == size - 1) {
				sugg.click();
				Thread.sleep(3000);
			}
		}
		driver.quit();
	}

	@Test
	public void clearTrip() throws Throwable {

//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
		driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		driver.findElement(By.xpath("//p[text()='Goa, IN - Dabolim Airport (GOI)']")).click();
		driver.findElement(By.cssSelector(".fs-4.fw-500.c-inherit.flex.flex-nowrap.ml-4")).click();
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Tue Jul 25 2023']"));
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void handlingPropertyFile() {
		ArrayList<String> a = new ArrayList<>();
		a.add("https://demo.actitime.com/");
		a.add("admin");
		a.add("admin@123.com");
		a.add("manager");
		System.out.println(a.get(2));
//------Using HashMap---------
//		HashMap<String, String> hm = new HashMap<>();
//		hm.put("url", "https://demo.actitime.com/");
//		hm.put("username", "admin");
//		hm.put("mail", "admin@123.com");
//		hm.put("password", "manager");
//		System.out.println(hm.get("password"));
	}

	@Test
	public void readDataFromPropertyFile() throws IOException {
		// ./data/commondata.property---->This is generic path
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}

	@Test
	public void autoTest() throws IOException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
