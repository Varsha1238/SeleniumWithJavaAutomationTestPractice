package allJavaPrograms;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\DemoSpace\\TestDemo\\TestData.xlsx";
		XSSFWorkbook wb =new XSSFWorkbook(filePath);
		XSSFSheet sh = wb.getSheetAt(0);
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(0).getLastCellNum();
		
		

	}

}
