package practicetestng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDataToExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("./data/Demo.xlsx");
	Workbook book=WorkbookFactory.create(file);
	book.getSheet("Demo").getRow(0).getCell(1).setCellValue("Automation Engineer");
	
	FileOutputStream fos=new FileOutputStream("./data/Demo.xlsx");
	book.write(fos); 
}
}
