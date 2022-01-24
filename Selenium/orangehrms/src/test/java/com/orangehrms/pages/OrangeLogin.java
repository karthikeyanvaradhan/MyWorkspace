package com.orangehrms.pages;

import org.testng.annotations.Test;

import com.orangehrms.framework.WebBrowser;

@Test
public class OrangeLogin extends WebBrowser {

	public void hrmsLogin() {

		String propFile = "C:\\Users\\vkarthikeyan\\workspace\\orangehrms\\src\\main\\resources\\orangeproperties\\orahrmsprop.properties";

		try {

			browserDriver("ie");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			DriverHandler.propertyLoad(propFile);
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
			
			

		} catch (Exception e) {
			System.out.println(e);

		}

		finally {

			DriverHandler.driverClose();
			DriverHandler.driverQuit();
		}

	}
}
