package com.SeleniumJava.Practise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonTest extends BrowserDriver {

	public static void main(String[] args) {
		RadioButtonTest radiocheck = new RadioButtonTest();
		radiocheck.loadUrl();

	}

	void loadUrl() {

		BrowserDriver.driverStart();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement depDate = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']/preceding::button"));
		
		
		WebElement driverWait = new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(depDate));
		driverWait.click();
		// depDateSelect.click();
		String departDate = "Fri, Oct 04 2019";
		//depDate.click();
		
		/*driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement radioEle : radio) {

			String radvalue = radioEle.getAttribute("value");
			if (radvalue.equalsIgnoreCase("blue")) {
				radioEle.click();
			}
*/
			/*
			 * Iterator<WebElement> radioIterate = radio.iterator();
			 * 
			 * while(radioIterate.hasNext()){
			 * 
			 * WebElement radText = radioIterate.next(); String radioText =
			 * radText.getAttribute("value");
			 * 
			 * if(radioText.equalsIgnoreCase("blue")){
			 * 
			 * }
			 */

		}

	}

