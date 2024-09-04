package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ibm.com/in-en");
	Thread.sleep(3000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(3000);
	Dimension targetWindowSize=new Dimension(600,300);
	driver.manage().window().setSize(targetWindowSize);
	Thread.sleep(3000);
	Point targetWindowPosition=new Point(150,200);
	driver.manage().window().setPosition(targetWindowPosition);
	Dimension windowSize=driver.manage().window().getSize();
	int windowWidth=windowSize.getWidth();	
	System.out.println("windowWidth ="+windowWidth);
	int windowHeight=windowSize.getHeight();
	System.out.println("windowHeight ="+windowHeight);
	Point windowPosition=driver.manage().window().getPosition();
	int windowStartX=windowPosition.getX();
	System.out.println("windowStartX ="+windowStartX);
	int windowStartY=windowPosition.getY();
	System.out.println("windowStartY ="+windowStartY);
}
}
