package dataReadingTestingWithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilitiez.Constants;

public class writeExcelTest {
	public static void main(String[] args) throws IOException {

		// open connection to the file
		FileInputStream fs = new FileInputStream(Constants.excelData);

		// get workbook connection
		XSSFWorkbook wb = new XSSFWorkbook(fs);

		// sheet index
		Sheet sh = wb.getSheet("Sheet1");

		// get row number

		int lastRowNumb = sh.getLastRowNum();
		System.out.println(lastRowNumb);

		for (int i = 1; i < lastRowNumb; i++) {

			Row row = sh.getRow(i);

			Cell cell = row.createCell(1);

			cell.setCellValue("Cohort14");
			System.out.println("hello");

		}

		FileOutputStream fos = new FileOutputStream(Constants.excelData);
		wb.write(fos);
		fos.close();

	}

}
