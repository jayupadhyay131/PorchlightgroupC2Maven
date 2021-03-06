package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileImporter {
	
	public static Workbook book;
	public static Sheet sheet;
	static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\testdata\\TestData.xlsx";
	Logger log = Logger.getLogger(ExcelFileImporter.class);
	
	public static Object[][] getTestData(String sheetName) {
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("SHEET NAME = " + sheetName);
		System.out.println("NUMBER OF ROWS = " + sheet.getLastRowNum());
		System.out.println("NUMBER OF COLUMNS = " + sheet.getRow(0).getLastCellNum());
		for (int i=0; i < sheet.getLastRowNum(); i++) {
			for (int j=0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		System.out.println("INFO: Excel data imported successfully");
		
		return data;
	}
}
