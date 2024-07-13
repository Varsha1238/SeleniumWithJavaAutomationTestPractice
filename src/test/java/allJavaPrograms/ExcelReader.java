package allJavaPrograms;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\DemoSpace\\TestDemo\\TestData.xlsx";
		XSSFWorkbook wb =new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		

	}

}
