package com.program.execution.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserExecute {
	
	public void driver(){
		

		System.setProperty("webdriver.ie.driver","C:\\Users\\vkarthikeyan\\workspace\\javaselenium\\target\\browserDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	
		
//Firefox
/*
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vkarthikeyan\\workspace\\javaselenium\\target\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
*/
//Chrome

		/*		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vkarthikeyan\\workspace\\javaselenium\\target\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
*/		
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.close();
		
	}
	
	
	public static void main(String args[]){
		BrowserExecute browexe = new BrowserExecute();
		browexe.driver();
	}

}
