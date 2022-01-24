import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringBufferInputStream;
import java.util.Scanner;

public class ClassLoaderTest {
	
	public void fileResourceget() throws FileNotFoundException{
		
		StringBuilder stResult = new StringBuilder("");
		
		
		ClassLoader classload = getClass().getClassLoader();
		File fl = new File (classload.getResource("C:\\Users\\vkarthikeyan\\workspace\\Selenium-java\\src\\test\\resources\\testFile.txt").getFile());
		
		Scanner sc = new Scanner(fl);

		while(sc.hasNextLine()){
			String line = sc.nextLine();
			stResult.append(line);
			
		}
		
		sc.close();
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		ClassLoaderTest ct = new ClassLoaderTest();
		ct.fileResourceget();

	}

}
