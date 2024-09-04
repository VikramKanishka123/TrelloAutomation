package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("./data/Demo.xlsx");
	Workbook book=WorkbookFactory.create(file);
	System.out.println(book.getSheet("Demo").getRow(0).getCell(1).getStringCellValue());
	file.close();
	}
}
