package learnscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebPageScreenShot {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://kids.nationalgeographic.com/animals");
	//Explicit Type Casting
	TakesScreenshot ts=(TakesScreenshot)driver;
	File tempAddress = ts.getScreenshotAs(OutputType.FILE);
	String address = tempAddress.getAbsolutePath();
	System.out.println(address);
	String timeStamp=LocalDateTime.now().toString().replace(':', '-');
	File permanentAddress=new File("./errorshots/"+timeStamp+"animals.png");
	//screenshot will be auto deleted
	FileUtils.copyFile(tempAddress, permanentAddress);
//	Thread.sleep(2000);
	driver.quit();
}
}
