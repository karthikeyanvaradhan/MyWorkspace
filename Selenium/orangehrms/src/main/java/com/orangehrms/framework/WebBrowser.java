package com.orangehrms.framework;

import java.io.InputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class WebBrowser {

	public static WebDriver driver;

	protected WebElement element;
	
	
	 public void fileLoader(String fileurl) {
		    InputStream s = this.getClass().getResourceAsStream(fileurl);
	 }
	

	public void browserDriver(String driverType) {

		
	
			if (driverType.equalsIgnoreCase("IE")) {
				
				
				String path = System.getProperty("user.dir");
				System.out.println(path); 
				System.setProperty("webdriver.ie.driver",path+"\\src\\main\\resources\\BrowserExeFile\\IEDriverServer.exe");
				
				//C:\Users\vkarthikeyan\workspace\orangehrms\src\main\resources\BrowserExeFile\IEDriverServer.exe

				
				driver=new InternetExplorerDriver();
			}

			else if (driverType.equalsIgnoreCase("CHROME")) {
				String path = System.getProperty("user.dir");
				System.out.println(path); 
				System.setProperty("webdriver.chrome.driver",path+"\\src\\main\\resources\\BrowserExeFile\\chromedriver.exe");
				
				driver=new ChromeDriver();
			}

			else if (driverType.equalsIgnoreCase("FIREFOX")) {
				
				String path = System.getProperty("user.dir");
				System.out.println(path); 
				System.setProperty("webdriver.gecko.driver",path+"\\src\\main\\resources\\BrowserExeFile\\geckodriver.exe");
				driver=new FirefoxDriver();
			}

		

	}

}
