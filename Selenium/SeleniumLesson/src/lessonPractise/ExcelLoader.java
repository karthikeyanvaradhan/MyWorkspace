package lessonPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelLoader {

	protected static FileInputStream fis;
	private static WorkbookFactory wbf;
	private static Workbook wb;
	private static Sheet ws;

	public static Map<String, String> excelData(String filePath, String SheetName)
			throws InvalidFormatException, IOException {

		try {
			FileInputStream fis = new FileInputStream(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wbf = new WorkbookFactory();
		wb = wbf.create(fis);
		ws = wb.getSheet(SheetName);

		int lastRow = ws.getLastRowNum();

		Map<String, String> dataMap = new HashMap<String, String>();

		int j = 0;

		Row row = ws.getRow(0);
		Row row1 = ws.getRow(1);

		Iterator rowNavigation = row.iterator();

		while (rowNavigation.hasNext()) {

			String key = (String) rowNavigation.next();

			if (key != null) {

				String value = null;

				if (row1.getCell(j).getCellType() == XSSFCell.CELL_TYPE_BLANK);
				System.out.println("Row" + row1.getCell(j) + " " + "is Blank");

				if (row1.getCell(j).getCellType() == XSSFCell.CELL_TYPE_NUMERIC);
				value = Double.toString(row1.getCell(j).getNumericCellValue());

				if (row1.getCell(j).getCellType() == XSSFCell.CELL_TYPE_STRING);
				value = row1.getCell(j).getStringCellValue();

				dataMap.put(key, value);
				j++;
				continue;
			}
break;
		}

		return dataMap;

	}

}
