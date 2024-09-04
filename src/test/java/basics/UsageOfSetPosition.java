package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ibm.com/in-en");
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(3000);
	Dimension targetWindowSize=new Dimension(200,300);
	driver.manage().window().setSize(targetWindowSize);
	Thread.sleep(3000);
	Point targetWindowPosition=new Point(150,200);
	driver.manage().window().setPosition(targetWindowPosition);
}
}
