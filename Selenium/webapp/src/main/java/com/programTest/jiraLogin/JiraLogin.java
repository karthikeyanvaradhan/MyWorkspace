package com.programTest.jiraLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class JiraLogin {

	public static String url = "https://fhlb.ahpcollaboration.com/jira/login.jsp";

	@Test
	public static void jiraLogin() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\webapp\\src\\main\\resources\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get(url);

	}

	
	
	
}
