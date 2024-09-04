package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckLeftAndRightAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		You should test your script in different browsers
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// identify the username
		Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
		int usernameStartX = usernameRect.getX();
		System.out.println("usernameStartX is " + usernameStartX);
		int usernameWidth = usernameRect.getWidth();
		System.out.println("usernameWidth is " + usernameWidth);
		int usernameEndX = usernameStartX + usernameWidth;
		System.out.println("usernameEndX is " + usernameEndX);

		// identify the password text field
		Rectangle passwordRect = driver.findElement(By.id("pass")).getRect();
		int passwordStartX = passwordRect.getX();
		System.out.println("passwordStartX is " + passwordStartX);
		int passwordWidth = passwordRect.getWidth();
		System.out.println("passwordWidth is " + passwordWidth);
		int passwordEndX = passwordStartX + passwordWidth;
		System.out.println("passwordEndX is " + passwordEndX);

		if (usernameStartX == passwordStartX) {
			System.out.println(
					"Pass: The Left Alignment of Username and password textfield is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Left Alignment of Username and password textfield is found incorrect and it is verified.");
		}
		if (usernameEndX == passwordEndX) {
			System.out.println(
					"Pass: The Right Alignment of Username and password textfield is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Right Alignment of Username and password textfield is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
