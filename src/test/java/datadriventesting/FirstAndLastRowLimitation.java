package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastRowLimitation {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.xlsx");
	Workbook workBook = WorkbookFactory.create(fis);
	Sheet sheet = workBook.getSheet("doblist");
	Row dayRow = sheet.getRow(0);
	short firstDayCell = dayRow.getFirstCellNum();
	System.out.println(firstDayCell);	
	short lastDayCell = dayRow.getLastCellNum();
	System.out.println(lastDayCell);
	workBook.close();
}
}
