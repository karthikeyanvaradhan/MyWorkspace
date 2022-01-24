package com.webPage.sauceDemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.InvokerTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.bs.Ali.Alis;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;
	File fl;
	FileInputStream fis;
	Properties prop;

	public void fileLoader() throws IOException {

		fl = new File(
				"C:\\Users\\vkarthikeyan\\workspace\\WebPageTest\\src\\test\\resources\\com\\webPage\\sauceDemo\\ResourceData\\PropertiesFile\\datafile.properties");
		fis = new FileInputStream(fl);
		prop = new Properties();
		prop.load(fis);

	}

		
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("^I want to Login to Navigate to \"(.*)\" $")

	public void sausePageLogin(String url) {

		driver.get(url);

		WebElement userID = driver.findElement(By.xpath(prop.getProperty("LoginIdElement")));
		userID.sendKeys(prop.getProperty("LoginId"));

		WebElement userPwd = driver.findElement(By.xpath(prop.getProperty("LoginPwdElement")));
		userID.sendKeys(prop.getProperty("LoginPwd"));

		WebElement userLoginbtn = driver.findElement(By.xpath(prop.getProperty("LoginBtnElement")));
		userLoginbtn.click();
	}

	@And("^I am Clicking on Menu Button$")
	public void sausePageMenu() {

		WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("MenuLink")));
		userMenu.click();

	}

	@Then("^I Click on About Link and Navigate to About Page$")
	public void sausePageAbout() {

		WebElement aboutLink = driver.findElement(By.xpath(prop.getProperty("AboutLink")));
		aboutLink.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		String actualUrl = driver.getCurrentUrl();

		String expectedUrl = prop.getProperty("checkLink");

		Assert.assertEquals(actualUrl, expectedUrl, "Url Mismatch Page Navigation is Incorrect");

		driver.navigate().back();

	}

	@And("^I Select the Item with Maximum Price$")
	public void sausePageSelectItem() {

		List<WebElement> inventoryItemPrice = driver.findElements(By.xpath(prop.getProperty("inventory_item_price")));
		Iterator<WebElement> inventProdPrice = inventoryItemPrice.iterator();
		inventProdPrice.next();

		while (inventProdPrice.hasNext()) {
			String price = inventProdPrice.toString();
			String[] aList = new String[price.length()];
			aList = price;
			for (int i = 0; i <= aList.size(); i++) {
				for (int j = i + 1; j < aList.size(); j++) {

					if (aList[i] > aList[j]) {

						int temp;
						temp = aList[i];
						driver.findElement(By.xpath(inventProdPrice)).click();
					}

					driver.findElement(By.xpath(prop.getProperty("add_to_cart"))).click();

				}

			}

		}

	}

	@Then("^I Navigate to Cart Page$")
	public void sausePageCartPage() {

		driver.findElement(By.xpath(prop.getProperty("cart"))).click();

		String yourcartText = driver.findElement(By.xpath(prop.getProperty("yourcart"))).getText();

		if (yourcartText.equalsIgnoreCase("Your Cart")) {
			System.out.println("Successfully Landed to Cart Page");
		}

		else {

			System.out.println("This Page is not Cart Page");
		}

		driver.findElement(By.xpath(prop.getProperty("checkoutbtn"))).click();
		String cartCheckOutText = driver.findElement(By.xpath(prop.getProperty("checkoutpage"))).getText();

		if (cartCheckOutText.equalsIgnoreCase("CHECKOUT: YOUR INFORMATION")) {
			System.out.println("Successfully Landed to Cart Check Out Page");
		}

		else {

			System.out.println("This Page is not Cart Check Out Page");
		}

	}
	
	
	

	@And(Redirect to Information Page
	public void sausePageInfoPage() {

		driver.findElement(By.xpath(prop.getProperty("firstName"))).sendKeys(prop.getProperty("fname"));
		driver.findElement(By.xpath(prop.getProperty("lastName"))).sendKeys(prop.getProperty("lname"));
		driver.findElement(By.xpath(prop.getProperty("zipcode"))).sendKeys(prop.getProperty("zipvalue"));
		driver.findElement(By.xpath(prop.getProperty("continuebtn"))).click();
	}

	public void sausePageCheckOutOverview() {

		String cartCheckOutText = driver.findElement(By.xpath(prop.getProperty("checkoutOverview"))).getText();

		if (cartCheckOutText.equalsIgnoreCase("Checkout: Overview")) {
			System.out.println("Successfully Landed to Check Out Overview Page");
		}

		else {

			System.out.println("This Page is not Check Out Overview Page");
		}

	}

	public void sausePagePaymentPageInfo() {

		String totalPrice = driver.findElement(By.xpath(prop.getProperty("totalPrice"))).getText();
		System.out.println(totalPrice);
	}

}