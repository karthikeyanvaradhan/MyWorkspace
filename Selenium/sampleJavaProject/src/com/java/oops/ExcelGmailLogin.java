package com.java.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelGmailLogin {
	
	static XSSFSheet xsheet;

	public static String gmail(File filePath, String sheetName) throws InterruptedException, IOException {

		try {

			FileInputStream fis = new FileInputStream(filePath);

			// WorkbookFactory wrkbk = new WorkbookFactory();

			XSSFWorkbook xwrkbk = new XSSFWorkbook(fis);
			xsheet = xwrkbk.getSheet(sheetName);

			/*
			 * while(xsheet.rowIterator().hasNext()){
			 * 
			 * String sheetData =
			 * xsheet.getRow(0).getCell(0).getStringCellValue();
			 * System.out.println("Data available in cell is"+" "+sheetData);
			 * xsheet.rowIterator().next();
			 * 
			 * }
			 */

			for (int i = 1; i <= xsheet.getLastRowNum(); i++) {

				for (int j = 0; j <= i; j++) {

					String cel_value = xsheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cel_value);
					return cel_value;

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheetName;

	}

	public static String getData(int rowno, int colno){
		Cell data = xsheet.getRow(rowno).getCell(colno);
		
		String celldata = data.getStringCellValue();
		
		return celldata;
		
	}
}
