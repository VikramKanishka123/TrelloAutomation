package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel {
public static void main(String[] args) throws Exception {
	//Create the FileInputStream Obj of java with the absolute path of the address.
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		//Call the create() from WorkBookFactory Class of POI Library
		Workbook workbook = WorkbookFactory.create(fis);
		//call the getSheet() by specifying the sheetName
		Sheet sheet = workbook.getSheet("sheet1");
		//call the getRow() by specifying the row index value
		Row row = sheet.getRow(0);
		//call the getCell() by specifying the cell index
		  Cell cell = row.getCell(1); //based on the type of data call the appropriate
		   String numericValue = cell.getStringCellValue(); 
		  System.out.println(numericValue); 
		  String cellValue =cell.getStringCellValue(); 
		  System.out.println( cellValue); 
		  workbook.close();
}	
}
