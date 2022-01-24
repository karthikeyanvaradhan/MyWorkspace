package com.orangehrms.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element extends WebBrowser {
	
	
	public WebElement xpathElement(String xpath){
		
		WebElement byxpathElement = driver.findElement(By.xpath(xpath));
		
		return byxpathElement;
		
		
	}
	
public WebElement idElement(String id){
		
		WebElement byidElement = driver.findElement(By.id(id));
		
		return byidElement;
		
		
	}

}
