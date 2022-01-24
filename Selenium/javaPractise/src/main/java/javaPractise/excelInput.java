package javaPractise;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@Test

public class excelInput {

	public static WebDriver wd;
	
	public static String excelFilePath="C:\\Users\\vkarthikeyan\\workspace\\javaPractise\\src\\test\\resources\\DataFile\\inputFile.xlsx";

	@SuppressWarnings("unused")
	@Given("^Open Internet Explorer Driver$")
	public void browser(String browserType) {

		if (browserType.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\vkarthikeyan\\workspace\\javaPractise\\src\\test\\resources\\IEDriverServer.exe");
			@SuppressWarnings("unused")
			WebDriver wd = new InternetExplorerDriver();
		} else {
			WebDriver wd = new FirefoxDriver();
		}
	}

	@Then("^Enter Url$")
	public static void enterUrl(String url) {

		wd.get("https://fhlb.ahpcollaboration.com/jira/browse/PD-94");
		wd.manage().window().maximize();

	}

	@And("^Enter Username and Enter Password$")
	public static void enterUserName_passWord(String id,String pwd) throws IOException {

		Map <String,String> excelVal = Manipulation.excelInputLoader(excelFilePath,"JiraLogin");
		
		
		
		WebElement name = wd.findElement(By.id("login-form-username"));
		name.sendKeys(id);

		WebElement pwd1 = wd.findElement(By.id("login-form-password"));
		name.sendKeys(pwd);

		WebElement login = wd.findElement(By.id("login-form-submit"));
		login.click();

	}

	public static void main(String args[]) {

		excelInput in = new excelInput();
		in.browser(null);

	}

}
