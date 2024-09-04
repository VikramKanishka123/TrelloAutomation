package basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
public static void main(String[] args) throws Throwable {
	//instantiate the browser
	WebDriver driver=new ChromeDriver();
	//maximixe window
	driver.manage().window().maximize();
	//pass the main url
	driver.get("https://www.ibm.com/in-en");
	//define the new window
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(3000);
	//set the size of the window
	Dimension targetWindowSize=new Dimension(200,300);
	driver.manage().window().setSize(targetWindowSize);
	
	
	
}
}
