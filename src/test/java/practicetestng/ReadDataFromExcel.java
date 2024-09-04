package practicetestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver = new EdgeDriver();
	FileInputStream file=new FileInputStream("./data/Demo.xlsx");
	Workbook workbook = WorkbookFactory.create(file);
	System.out.println(workbook.getSheet("Demo").getRow(0).getCell(0).getStringCellValue());
	driver.quit();
}
}
