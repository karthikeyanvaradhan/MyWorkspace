package testNGPrograms;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFacebook {

/*	@Test
	public void googlePage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		String actual = driver.getTitle();
		String expected = "selenium - Google Searched";
		assertEquals(expected, actual, "Title is Not Matched");
		Thread.sleep(1000);
		driver.quit();
	}
*/
	@Test

	public void faceBookPage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	SoftAssert softAssert = new SoftAssert();	
		
		// Facebook Title

		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		softAssert.assertEquals(expectedTitle, actualTitle, "Title Mismatched");
		assertTrue(true);

		// Facebook Url

		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		softAssert.assertEquals(expectedUrl, actualUrl, "Url Mismatched");

		// Facebook TextArea

		String expectedTextAreaValue = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("The Attribute Value is"+" "+ driver.findElement(By.id("email")).getAttribute("value"));
		String actualTextAreaValue = "";
		assertEquals(expectedTextAreaValue, actualTextAreaValue, "Text Area value mismatch");

		// Facebook Border

		String expectedBorder = driver.findElement(By.id("email")).getCssValue("border");
		System.out.println("The Border value"+" "+driver.findElement(By.id("email")).getCssValue("border"));
		String actualBorder = "1px solid rgb(240, 40, 73)";
		assertEquals(expectedBorder, actualBorder, "Border mismatch");

		// Facebook Validaton Message	

		String expectedMsg = driver.findElement(By.xpath("//input[@id='email']/following::div[@class='_9ay7']"))
				.getText();
		System.out.println("Expected Error Message" +expectedMsg);
		String actualMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		assertEquals(expectedMsg, actualMsg, "Message mismatch");

		driver.quit();
		
		softAssert.assertAll();

	}

}
