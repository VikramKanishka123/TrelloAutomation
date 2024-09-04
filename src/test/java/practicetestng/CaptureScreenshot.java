package practicetestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("https://demo.actitime.com/login.do");
	driver.get("https://demo.nopcommerce.com/");
	
	//Full Page Screenshot
	/*TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./errorshots/demologin.png");
	FileUtils.copyFile(source, target);*/
	
	//Screenshot of particular element
	/*WebElement ts = driver.findElement(By.xpath("//strong[text()='Featured products']"));
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./errorshots/FeaturedProducts.png");
	FileUtils.copyFile(source, target);*/
	
	//Screenshot of section or portion of webpage
	WebElement ts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./errorshots/FeaturedProductsSection.png");
	FileUtils.copyFile(source, target);
	
	driver.close();
}
}
