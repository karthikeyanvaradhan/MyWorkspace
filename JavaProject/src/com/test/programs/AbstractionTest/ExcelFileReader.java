package com.test.programs.AbstractionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {

	static String fileLoc = "C:\\Users\\vkarthikeyan\\Desktop\\GarbageCollector\\Selenium_TestData\\gmail.xlsx";
	static String sheetname="gmailLogin";
	
	public static void FileReader(String fileLocation, String sheetName) throws IOException {

		System.out.println(fileLocation);
		File fl = new File(fileLocation);
		System.out.println("file");
		FileInputStream fis = new FileInputStream(fl);
		System.out.println("fileinputstream");

		XSSFWorkbook exl = new XSSFWorkbook(fis);
		System.out.println("workbook");

		XSSFSheet exlSheet = exl.getSheet(sheetName);
		System.out.println(sheetName);


		int lastRow = exlSheet.getLastRowNum() - exlSheet.getFirstRowNum();
		
		System.out.println(lastRow);
		for (int i = 0; i <= lastRow; i++) {

			Row exlRow = exlSheet.getRow(i);

			for (int j = 0; j < exlRow.getLastCellNum(); j++) {

				Cell exlCell = exlRow.getCell(j);
				
				//System.out.println(exlSheet.getRow(i).getCell(j));

				if (exlCell.getCellType() == exlCell.CELL_TYPE_NUMERIC)
					System.out.println(exlCell.getNumericCellValue());
				else if (exlCell.getCellType() == exlCell.CELL_TYPE_STRING)
					System.out.println(exlCell.getStringCellValue());

			}

		}

	}

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Main");
		FileReader(fileLoc,sheetname);
		

	}

}
