package newpracticequestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingAllTheOptionsInListBox {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Acer/Desktop/newdropdown.html");
		WebElement listBox = driver.findElement(By.id("month"));
		Select s=new Select(listBox);
		System.out.println(s.getWrappedElement().getText());
		driver.quit();
	}
}
