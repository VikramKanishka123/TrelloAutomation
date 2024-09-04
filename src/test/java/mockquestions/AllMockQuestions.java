package mockquestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AllMockQuestions {
	@Test
	public void printAllLinks()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");
		List<WebElement> tagNames = driver.findElements(By.tagName("a"));
        for (int i = 0; i < tagNames.size(); i++) 
        {
        	String allLinks = tagNames.get(i).getAttribute("href");
            System.out.println(allLinks);
		}
		driver.quit();
	}
	
	@Test
	public void printAutoSuggestions()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");
		List<WebElement> tagNames = driver.findElements(By.xpath("//span[contains(.,'wipro jobs')]"));
		for (int i = 0; i < tagNames.size(); i++) 
		{
			String text = tagNames.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}
	
	@Test
	public void printOptionsInDropdown()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement yddown = driver.findElement(By.id("year"));
		Select s=new Select(yddown);
        List<WebElement> options = s.getOptions();
        int count=0;
        for (int i = 0; i < options.size(); i++) 
        {
        	count++;
        	String text = options.get(i).getText();
        	System.out.println(text);	
		}
        System.out.println("Total years in dropdown-->"+count);
        driver.quit();
	}
	
	@Test
	public void selectAndDeselectOptionsInDropdown() 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
		WebElement ddown = driver.findElement(By.id("cp"));
		Select s=new Select(ddown);
        List<WebElement> options = s.getOptions();
        for (int i = 0; i < options.size(); i++) 
        {
        	s.selectByIndex(i);
		}
        s.deselectAll();
        driver.quit();
	}
	
	@Test
	public void closeWithoutQuit() throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Thread.sleep(1000);
		Set<String> window = driver.getWindowHandles();
		for (String wh : window) 
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			driver.close();
		}	
	}
	
	@Test
	public void readDataFromPropertyFile() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(file);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
	}
	
	@Test
	public void readDataFromExcelFile() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("./data/Demo.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Demo");
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		file.close();
		book.close();
	}
	
	@Test
	public void screenShot() throws IOException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		TakesScreenshot s=(TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File target=new File("./errorshots/Demo.png");
		FileUtils.copyFile(source, target);
		driver.quit();
	}
}

