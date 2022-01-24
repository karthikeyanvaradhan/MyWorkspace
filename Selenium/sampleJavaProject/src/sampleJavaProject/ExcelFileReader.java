package sampleJavaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {

	public static void excelReader(String dataPath,String sheetName) throws IOException {

		/*FileInputStream excelFile = new FileInputStream(new File(
				"C:\\Users\\vkarthikeyan\\workspace\\HybridFramework\\src\\test\\resources\\dataExcelTest.xlsx"));*/
		
		FileInputStream excelFile = new FileInputStream(new File(dataPath));
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(excelFile);
		XSSFSheet excelSheet = excelWorkbook.getSheet(sheetName);
		Iterator<Row> rowIterator = excelSheet.iterator();

		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();

			Iterator<Cell> cellIterate = row.cellIterator();

			while (cellIterate.hasNext()) {

				Cell cell = cellIterate.next();

				switch (cell.getCellType()) {

				case Cell.CELL_TYPE_BLANK:
					System.out.println("Cell is Blank");

					break;

				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());

					break;

				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());

					break;

				}

			}

		}
		
		excelFile.close();
	}

	public static void main(String[] args) throws IOException {
		ExcelFileReader ex = new ExcelFileReader();
		
	}

}
