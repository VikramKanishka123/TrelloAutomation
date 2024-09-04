package handlinglistbox;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingInAlphabetical {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
	WebElement cpListBox = driver.findElement(By.id("cp"));
	TreeSet<String> t=new TreeSet<>();
	Select s=new Select(cpListBox);
	List<WebElement> allOptions = s.getOptions();
	for(int i=0;i<allOptions.size();i++)
	{
		String text = allOptions.get(i).getText();
		t.add(text);
	}
//	System.out.println(t);
	for(String e:t)
	{
		System.out.println(e);
	}
	driver.quit();
}
}
