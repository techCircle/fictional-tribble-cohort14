package dataReadingTestingWithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilitiez.Constants;

public class readExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(Constants.excelData);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// starting at index of 0
//		Row row = sheet.getRow(4);
//		Cell Cell = row.getCell(2);
//		
//		System.out.println(Cell);  //argentina

//		System.out.println(sheet.getRow(2).getCell(0));

		for (Row row : sheet) {

			for (Cell cell : row) {

				switch (cell.getCellType()) {

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.print(cell.getRichStringCellValue());
					break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;

				}
				System.out.println(" ");

//				System.out.println(cell.getStringCellValue());

			}
			System.out.println(" ");


			workbook.close();

		}

	}

}
