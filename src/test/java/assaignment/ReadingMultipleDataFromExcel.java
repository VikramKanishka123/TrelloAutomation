package assaignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/demodata.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	for(int i=0;i<9;i++) 
	{
	String username = w.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	String password = w.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
	System.out.println(username+" "+password);
	}
}
}
