package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLoctaorClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify the tagline text by its class name as locator
		WebElement tagline = driver.findElement(By.className("_8eso"));
		//capture the tagLine text
		String tagLineText = tagline.getText();
		System.out.println("tagLineText ="+tagLineText);
		driver.manage().window().minimize();
		driver.quit();
}
}