import java.util.Properties;

public class FileInput {

	private static FileInputStream fis;
	private static File file;
	
	public static fileProcess(String fpath){
		
		file = new(fis(fpath));
		
		Properties prop = new Properties();
		prop.load(file);
		
	}
	
	
	
}
