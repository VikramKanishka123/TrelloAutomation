package newpracticequestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new FirefoxDriver();
		FileInputStream fis=new FileInputStream("./data/Demo.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		System.out.println(book.getSheet("Demo").getRow(0).getCell(0).getStringCellValue());
		driver.quit();
	}
}
