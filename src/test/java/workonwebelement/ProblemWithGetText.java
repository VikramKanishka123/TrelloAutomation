package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement divTag = driver.findElement(By.className("_8esl"));
		String divTagName = divTag.getTagName();
		System.out.println("divTagName =" + divTagName);
		String divTagText = divTag.getText();
		System.out.println("divTagText =" + divTagText);
		// here the <div> has no tag text
		System.out.println("<" + divTagName + ">" + divTagText + "<" + divTagName + ">");
		System.out.println("=================================================================");
		WebElement actualtag = driver.findElement(By.className("_8eso"));
		String actualtagName = actualtag.getTagName();
		System.out.println(actualtagName);
		String actualtagText = actualtag.getText();
		System.out.println(actualtagText);
		// here the <div> has no tag text
		System.out.println("<" + actualtagName + ">" + actualtagText + "<" + actualtagName + ">");
		driver.manage().window().minimize();
		driver.quit();
	}
}
