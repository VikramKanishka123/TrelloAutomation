package handlingpopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Acer/Desktop/Naukri.html");
	Thread.sleep(4000);
	File file = new File("./data/API TEST CASE 1.xlsx");
	String absPath = file.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(absPath);
	Thread.sleep(3000);
	driver.close();
}
}
