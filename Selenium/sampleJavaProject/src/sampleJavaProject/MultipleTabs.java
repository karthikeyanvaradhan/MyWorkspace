package sampleJavaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class MultipleTabs {
	
	
	public static void windowMultipleTabs(){
		
		
		System.setProperty("webdriver,gecko.driver","C:\\Users\\vkarthikeyan\\workspace\\sampleJavaProject\\src\\sampleJavaProject\\Resource\\geckodriver.exe");
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("http://demo.guru99.com/popup.php");
		
		 
	}

	public static void main(String args[]){
		
		MultipleTabs multab =  new MultipleTabs();
		
		multab.windowMultipleTabs();
		
		
	}
	
	
	
}
