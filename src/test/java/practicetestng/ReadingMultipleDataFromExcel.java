package practicetestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ReadingMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/Demo.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	int rowCount=book.getSheet("Demo").getPhysicalNumberOfRows();
	
	for (int i = 0; i < rowCount; i++) 
	{
		Row row = book.getSheet("Demo").getRow(i);
		int cellCount=row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < cellCount; j++) 
		{
			Cell cell = row.getCell(j);
			System.out.print("||"+getCellValue(cell));
		}
		System.out.println();
	}
	book.close();
	fis.close();
}
public static String getCellValue(Cell cell)
{
	switch (cell.getCellType()) {
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
	case BOOLEAN:
		return String.valueOf(cell.getNumericCellValue());	
	case STRING:
	return cell.getStringCellValue();
	default:
		return cell.getStringCellValue();
	}
}
}
