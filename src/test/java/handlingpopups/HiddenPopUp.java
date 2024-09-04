package handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[29]")).click();
	Thread.sleep(5000);
	driver.close();

}
}
