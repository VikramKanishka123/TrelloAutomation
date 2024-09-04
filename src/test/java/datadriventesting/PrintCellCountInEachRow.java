package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCellCountInEachRow {
public static void main(String[] args) throws Throwable {
	List<String> expectedDayList=new ArrayList<String>();
	List<String> expectedMonthList =new ArrayList<String>();
	List<String> expectedYearList =new ArrayList<String>();
	FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.xlsx");
	Workbook workBook = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet = workBook.getSheet("doblist");
	
    
    
}
}
