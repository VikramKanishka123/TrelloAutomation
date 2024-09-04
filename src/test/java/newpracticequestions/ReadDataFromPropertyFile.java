package newpracticequestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new EdgeDriver();
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p.getProperty("url"));
	System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("password"));
	driver.quit();
}
}
