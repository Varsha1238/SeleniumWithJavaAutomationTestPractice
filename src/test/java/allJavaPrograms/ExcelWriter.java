package allJavaPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("UserDetails");

		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFCell cell2 = row.createCell(1);
		cell.setCellValue("UserID");
		cell2.setCellValue("Password");

		FileOutputStream out = new FileOutputStream(new File("WriteToExcelDemo.xlsx"));
		wb.write(out);
		out.close();
		System.out.println("WriteToExcelDemo.xlsx written successfully on disk.");

	}

}
