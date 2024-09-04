package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareTwoImages {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	try {
		driver.get("https://pib.gov.in/");
	} catch (WebDriverException e) {
		driver.navigate().refresh();
	}
	//identify the Azadi Ka Amrit Mahotsav Image
	WebElement AzadiImage = driver.findElement(By.xpath("//img[@title='Azadi Ka Amrit Mahotsav']"));
	//identify the  G20 Image
	WebElement G20Image = driver.findElement(By.xpath("//img[@title='g20-india-2023']"));
	//get the image source  from src
	String azadiSource = AzadiImage.getAttribute("src");
	System.out.println("azadiSource ="+azadiSource);
	String G20ImageazadiSource = G20Image.getAttribute("src");
	System.out.println("G20ImageazadiSource ="+G20ImageazadiSource);
	if(azadiSource.equals(G20ImageazadiSource))
	{
		System.out.println("Since Both the images source are same and the image will also remains same.");
	}
	else 
	{
		System.out.println("Since both the image source is different and images are different from each other.");
	}
	driver.manage().window().minimize();
	driver.quit();
	}
}

