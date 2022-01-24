package com.webappui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertClass extends AbstractResource {

	public AlertClass(WebDriver driver, WebElement element) {

		super(driver, element);

	}

	public AlertClass(WebDriver driver, By by) {

		super(driver, driver.findElement(by));

	}

}
