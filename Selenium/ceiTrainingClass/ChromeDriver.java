import org.openqa.selenium.WebDriver;

public class ChromeDriver {

	public void chromeDriver(){
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driverRun = new ChromeDriver();
		driverRun.chromeDriver();

	}

}
