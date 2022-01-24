package javaCollectionInterfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mapclass {

	public Map<Integer,String> mapTest(String fileLoc,String sheeetName) throws Exception{
		
		HashMap <Integer,String> hashMapval = new HashMap<Integer, String>();
		
		FileInputStream fis = new FileInputStream(fileLoc); 
		XSSFWorkbook excelBook =  new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheet(sheeetName);
		Iterator <Row> rowIterate = excelSheet.iterator();
		while(rowIterate.hasNext()){
			Row row = rowIterate.next();
			
			Iterator <Cell> cellIterate = row.cellIterator();
			
			while(cellIterate.hasNext()){
				
				Cell cell = cellIterate.next();
				
				switch(cell.getCellType()){
				
				case Cell.CELL_TYPE_STRING:
                    System.out.print(cell.getStringCellValue() + "t");
                    break;
				
                    
				case Cell.CELL_TYPE_NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				
				
				case Cell.CELL_TYPE_BOOLEAN:System.out.print(Cell.CELL_TYPE_BOOLEAN);
				break;
								
				}
				
				
			}
		}
		
		
		hashMapval.put(1,"Karthikeyan");
		hashMapval.put(2,"Dhanasekar");
		//hashMapval.put(null,"Sathya");
		hashMapval.put(null,"Sathya");
		
		Set<Integer> keyset = hashMapval.keySet();
		
		for(Map.Entry m:hashMapval.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		return hashMapval;  
	}

	public static void main(String[] args) {

		Mapclass mpc = new Mapclass();
		mpc.mapTest();

	}

}
