package sampleJavaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

	public static HashMap<String, Object> data(String filePath, String sheetName) throws IOException {

		FileInputStream excelFile = new FileInputStream(new File(filePath));
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(excelFile);
		XSSFSheet excelSheet = excelWorkbook.getSheet(sheetName);
		XSSFRow row1 = excelSheet.getRow(0);
		XSSFRow row2 = excelSheet.getRow(1);

		HashMap<String, Object> data = new HashMap<>();

		
		excelSheet.forEach(a -> {a.forEach(cell -> {System.out.println(cell);});});
		
//		row2.forEach(k -> {
//			switch (k.getCellType()) {
//
//			case Cell.CELL_TYPE_BLANK:
//				System.out.println("Cell Remains Blank");
//			case Cell.CELL_TYPE_STRING:
//				k.getStringCellValue();
//				if (data.get("name") == null) {
//					data.put("name", k.getStringCellValue());
//				} else if (data.get("qualification") == null)
//					data.put("qualification", k.getStringCellValue());
//				else if (data.get("company") == null)
//					data.put("company", k.getStringCellValue());
//				else {
//					data.put("dept", k.getStringCellValue());
//				}
//
//				break;
//			case Cell.CELL_TYPE_BOOLEAN:
//				k.getBooleanCellValue();
//				break;
//			case Cell.CELL_TYPE_NUMERIC:
//				data.put("age", k.getNumericCellValue());
//				break;
//
//			}
//		});

		// while (cellTraverse.hasNext()) {
		// for (int i = 0; i < row2.getLastCellNum() - 1; i++) {
		//
		// int cellType = row2.getCell(i).getCellType();
		//
		// Cell cell = row2.getCell(i);
		//
		//
		//
		// }
		//
		// }
		System.out.println(data);
		return data;

	}

	public static void main(String[] args) {
		String filePath = "C:\\Users\\vkarthikeyan\\workspace\\sampleJavaProject\\res\\employeedetails.xlsx";
		String sheetName = "emp_details";
		try {
			data(filePath, sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
