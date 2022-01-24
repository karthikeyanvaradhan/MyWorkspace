package javaPractise;

import java.io.File;
import javaPractise.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Manipulation{
	
	
	public static Map<String, String> excelInputLoader(String excelPath, String sheetName) throws IOException {

		FileInputStream fl = new FileInputStream(new File(excelPath));
		// WorkbookFactory wb = new WorkbookFactory();
		XSSFWorkbook exWorkbook = new XSSFWorkbook(fl);
		XSSFSheet exSheet = exWorkbook.getSheet(sheetName);

		Map<String, String> excelKeyVal = new HashMap<String, String>();

		Row r1 = exSheet.getRow(0);
		Row r2 = exSheet.getRow(1);

		int j = 0;

		Iterator i = r1.iterator();

		while (i.hasNext()) {

			XSSFCell key = (XSSFCell) i.next();

			if (key != null) {

				String value = null;

				if (r2.getCell(j).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					value = Double.toString(r2.getCell(j).getNumericCellValue());
				}

				else

					value = r2.getCell(j).getStringCellValue();
				excelKeyVal.put(key.toString(), value);
				j++;
				continue;
			}

			break;

		}
		
		
		return excelKeyVal;
	}

}
