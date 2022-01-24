package com.orangehrms.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Login {

	private final static Logger LOGGER = Logger.getLogger(Login.class.getName());

	public static WebDriver driver;

	public void browser() throws InterruptedException {

		String path = System.getProperty("user.dir");
		System.out.println(path);

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability("ignoreZoomSetting", true);

		System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\Browsers\\geckodriver.exe");

		driver = new FirefoxDriver();
		Thread.sleep(1000);

		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		// --driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		Thread.sleep(10000);
		
		WebElement dropDown = driver.findElement(By.className("spTextField"));
		dropDown.click();
		if (dropDown.isDisplayed() & dropDown.isEnabled() & (!dropDown.isSelected())) {

			Select selectList = new Select(dropDown);
			List<WebElement> dropvalue = selectList.getOptions();

			for (WebElement val : dropvalue) {

				// for(int i=0;i<dropvalue.size();i++){

				if (val.equals("QTP"))
					val.click();
				

			}
			// dropDownData.selectByValue("QTP");

		}

		/*
		 * try{
		 * 
		 * 
		 * WebElement usrName = driver.findElement(By.id("txtUsername"));
		 * usrName.click(); usrName.sendKeys("admin");
		 * 
		 * WebElement usrPass =
		 * driver.findElement(By.xpath("//input[@id='txtPassword']"));
		 * usrPass.click(); usrPass.sendKeys("admin123 ");
		 * 
		 * WebElement hrmsLoginbtn =
		 * driver.findElement(By.xpath("//input[@value='LOGIN']"));
		 * hrmsLoginbtn.click();
		 * 
		 * }catch(Exception e){ System.out.println(e); }
		 */ }

	public void driverClose() {

		driver.close();
	}

	public void driverQuit() {

		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Login log = new Login();
		log.browser();
		// Login.loginHrmsPage();
		log.driverClose();
		log.driverQuit();

	}

}