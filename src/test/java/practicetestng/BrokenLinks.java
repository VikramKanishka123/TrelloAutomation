package practicetestng;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException, Throwable {
		int count=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		// capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("Total links on the page "+size);
		for (int i = 0; i < size; i++) {
			count++;
			// by using href we can get the url of the specified link
			String url = links.get(i).getAttribute("href");

			URL link = new URL(url);

			// create a connection using url object 'link'...'HttpURLConnection'-->this is a class
			HttpURLConnection httpConnection = (HttpURLConnection) link.openConnection();
			
			// wait 2 seconds
//			Thread.sleep(2000);
			
			// establish connect
			httpConnection.connect();
			
			// capture the response code
			int response = httpConnection.getResponseCode();
			
			// checking whether the response code is valid or not
			if (response >= 400) {
				System.out.println(url + " is broken and it is verified"+"-->"+count);
			} else {
				System.out.println(url + " is not broken and it is verified"+"-->"+count);
			}
		}
		driver.close();
	}
}

