import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public void browser(){
		
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkarthikeyan\\workspace\\orangehrms\\src\\main\\resources\\BrowserExeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login log = new Login();
		log.browser();
		

	}

}
