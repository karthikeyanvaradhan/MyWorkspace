package com.orangehrms.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	By loginUserid = By.xpath(".//input[@id='txtUsername']");
	By loginPassword=By.xpath(".//input[@id='txtPassword']");
	By loginButton = By.id("btnLogin");
	private WebDriver driver;
	
	
	public void loginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void typeLoginidandPass(String id,String pwd){
		
		driver.findElement(loginUserid).sendKeys(id);
		driver.findElement(loginPassword).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(loginButton).click();
		
		
		
		
	}
	
	
}
