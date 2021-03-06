package com.SeleniumJava.Practise;

import java.text.SimpleDateFormat;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementDisplayed;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDynamic extends BrowserDriver {

	@Override
	void loadUrl() {

		driver.get("https://www.redbus.in/");

	}

	public void select_onward_date() throws Exception {

		WebElement fromDateCalendar = driver
				.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(fromDateCalendar));
		fromDateCalendar.click();

		/*
		 * Alert al = driver.switchTo().alert(); al.dismiss();
		 * Thread.sleep(1000);
		 */

		List<WebElement> fromDateCalElement = driver
				.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
//System.out.println("Elements");
		for (WebElement dateElement : fromDateCalElement) {

			String dateVal = dateElement.getText();
			System.out.println("DATEVAL"+dateVal);
			//dateVal.

			//SimpleDateFormat sdate = new SimpleDateFormat("dd");
			Date currentDate = new Date();
			int selDate = currentDate.getDate();
			System.out.println("SELDATE"+selDate);

			if (dateVal.equals(selDate)) {
				System.out.println("Date Val Inside IF"+dateVal);
				System.out.println("Date Val Inside IF"+selDate);
				dateElement.click();
			}

		}

	}

	public static void main(String[] args) {

		driverStart();

		CalendarDynamic caldy = new CalendarDynamic();

		caldy.loadUrl();
		try {
			caldy.select_onward_date();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* driver.close(); */

	}

}
