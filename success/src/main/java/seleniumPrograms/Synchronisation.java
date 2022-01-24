package seleniumPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static WebDriver driver;

	static File fl;
	static FileInputStream fis;
	static Properties prop;

	public Synchronisation(WebDriver driver) throws FileNotFoundException {

	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\success\\src\\test\\java\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		fl = new File(
				"C:\\Users\\vkarthikeyan\\workspace\\success\\src\\test\\java\\configProperties\\config.properties");

		fis = new FileInputStream(fl);

		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadPage(WebDriver driver) {

		try{
		driver.get(prop.getProperty("url"));
		}catch(Exception e){
			System.out.println("Property File is not loaded properly" +e);
		}
		WebElement userId = driver.findElement(By.id(prop.getProperty("userName")));
		userId.sendKeys(prop.getProperty("orUid"));

		WebElement userPwd = driver.findElement(By.id(prop.getProperty("userPassword")));
		userPwd.sendKeys(prop.getProperty("orPwd"));

	}

	public static void main(String[] args) throws IOException {

		Synchronisation syn = new Synchronisation(driver);
		syn.loadPage(driver);
		
	}

}
