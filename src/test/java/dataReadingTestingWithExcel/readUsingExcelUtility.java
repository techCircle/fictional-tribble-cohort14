package dataReadingTestingWithExcel;

import Utilitiez.Constants;
import Utilitiez.ExcelUtility;

public class readUsingExcelUtility {

	public static void main(String[] args) {

		ExcelUtility.excelIntoArray(Constants.excelData, "Sheet1");

	}

}
