package com.SeleniumJava.Practise.MyFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DatePickerClass {
	
	
	
	public static void select_Return_Date(WebDriver driver,String dateVal,WebElement element) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
		
	}

}
