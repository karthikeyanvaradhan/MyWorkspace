import com.sun.jna.platform.win32.Netapi32Util.User;

public class Filereader {

	public fileReader(){
		
		String path = System.getProperty("User.dir");
		
		System.out.println(path);
		File fl = new File(path+"\\resource\\inputData.txt");
		
	}
	

}	
	
	public static void main(String[] args) {
		
		Filereader flr = new Filereader();
		flr.fileReader();
		

	}

