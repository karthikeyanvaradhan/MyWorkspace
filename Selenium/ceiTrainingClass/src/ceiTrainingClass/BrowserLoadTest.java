package ceiTrainingClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLoadTest {

	ClassLoader classLoader=null;
	
	BrowserLoadTest(){
		
		classLoader = getClass().getClassLoader();
		
		System.setProperty("webdriver.gecko.driver",classLoader.getResource("resource/inputData.txt").getFile());
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com/launching-firefox-using-gecko-driver/");
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		//BrowserLoadTest bl = new BrowserLoadTest();
		BrowserLoadTest();
		
	}

}
