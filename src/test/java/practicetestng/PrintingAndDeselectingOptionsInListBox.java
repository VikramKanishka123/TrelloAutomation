package practicetestng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingAndDeselectingOptionsInListBox 
{
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("file:///C:/Users/Acer/Desktop/Hotel.html");
    WebElement cpList = driver.findElement(By.id("cp"));
    Select s=new Select(cpList);
    List<WebElement> option = s.getOptions();
    for(int i=0;i<option.size();i++)
    {
      System.out.println(option.get(i).getText());
      Thread.sleep(500);
      s.selectByIndex(i);
    }
    s.deselectAll();
    driver.quit();
}
}
