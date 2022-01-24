package com.SeleniumJava.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandleTest extends BrowserDriver {

	@Override
	void loadUrl() {

		driver.get("https://www.spicejet.com/");

	}

	public void select_Dapart_Date() {
		WebElement depDateSelect = driver.findElement(By.id("//span[@id='view_fulldate_id_1']/preceding::button"));

		WebElement driverWait = new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(depDateSelect));
		driverWait.click();
		// depDateSelect.click();
		String departDate = "Fri, Oct 04 2019";

		select_Return_Date(driver, departDate, depDateSelect);

	}

	public void select_Return_Date() {
		WebElement retDateSelect = driver.findElement(By.id("//span[@id='view_fulldate_id_2']/preceding::button"));
		WebElement driverWait = new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(retDateSelect));
		driverWait.click();

		String departDate = "Fri, Nov 04 2019";

		select_Return_Date(driver, departDate, retDateSelect);

	}
	/*
	 * public static void select_Return_Date(WebDriver driver,String
	 * dateVal,WebElement element) {
	 * 
	 * JavascriptExecutor js = ((JavascriptExecutor)driver);
	 * js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",
	 * element); WebElement retDateSelect =
	 * driver.findElement(By.id("//input[@id='ctl00_mainContent_view_date2']"));
	 * retDateSelect.click();
	 * 
	 * }
	 */

	public static void select_Return_Date(WebDriver driver, String dateVal, WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);

	}

	public static void main(String[] args) {
		CalendarHandleTest.driverStart();
		CalendarHandleTest ch = new CalendarHandleTest();
		ch.loadUrl();
		ch.select_Dapart_Date();
		ch.select_Return_Date();

	}

}
