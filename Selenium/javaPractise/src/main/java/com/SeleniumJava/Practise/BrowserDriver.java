package com.SeleniumJava.Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class BrowserDriver {
	
	protected static WebDriver driver; 
	
	public static WebDriver driverStart(){
				
		String path = System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
		
		
		System.setProperty("webdriver.gecko.driver",path+"\\src\\test\\resources\\Drivers\\resource\\geckodriver.exe");
		

				
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
				
	}
	
	abstract void loadUrl();
	
	
	public static void main(String args[]){
		
		 
		 BrowserDriver.driverStart();
		
	}

}
