package handlinglistbox;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
	WebElement cpListBox = driver.findElement(By.id("cp"));
	HashSet<String> h=new HashSet<>();
	Select s=new Select(cpListBox);
	List<WebElement> allOptions = s.getOptions();
	for(int i=0;i<allOptions.size();i++)
	{
		String text = allOptions.get(i).getText();
		if(h.add(text)==false)
			System.out.println(text);
	}
	driver.quit();
}
}
