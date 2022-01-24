package com.webappui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractResource {
	
	protected WebDriver driver;
	protected WebElement element;
	
	
	public AbstractResource(WebDriver driver, WebElement element){
		
		this.driver = driver;
		this.element = element;
		
	}
	
	
	
	

}
