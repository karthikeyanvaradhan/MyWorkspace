package com.orangehrms.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrms.framework.WebBrowser;

public class DriverHandler extends WebBrowser {

	public static FileInputStream fis;
	public static File file;
	protected Workbook workBook;
	protected Sheet workSheet;
	protected Row row;
	protected Cell cell;

	public static void driverClose() {

		driver.close();

	}

	public static void driverQuit() {

		driver.quit();

	}
	
	
	public static void fileinpStream(String filePath) throws FileNotFoundException{
		
		fis= new FileInputStream(filePath); 
		
		
	}

	public static void propertyLoad(String fileName) throws IOException {

		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		prop.load(fis);

	}

	public static void takeScreenPrint(File screenPath) throws IOException {

		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, screenPath);

	}

	public Map<String, String> exFile(String sheetName, File exFilePath) {

		try {

			fis = new FileInputStream(exFilePath);
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workSheet = workBook.getSheet(sheetName);

		row = workSheet.getRow(0);
		int  lastCell= row.getLastCellNum();
		cell = row.getCell(0);

		
		Iterator <Cell> it = row.cellIterator();
		
		if(it.hasNext()){
			
			for(int i=0;i<lastCell;i++){
				
			}
			
		}
		
		
		int i;
		int j;

		return null;

	}
	
	
	public Sheet excelKeyword(String filePath,String fileName,String sheetName) throws FileNotFoundException{
		
		file = new File(filePath+"//"+fileName);
		fis=new FileInputStream(file);
		
		String fileExtension = fileName.substring(fileName.indexOf("."));
		
		if(fileExtension.equals("xlsx")){
			
			
		}
		
		
		
		return workSheet;
		
	}
	
	

}
