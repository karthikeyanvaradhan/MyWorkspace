package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrms {
	WebDriver driver;

@Test	
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@Test
	public void loginHrms() {

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
@Test
	public void navigateToMyInfo() {

		System.out.println(driver.findElement(By.id("menu_pim_viewMyDetails")).isDisplayed());
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

	}
@Test
	public void personalDetails() {

		System.out.println(driver.findElement(By.id("profile-pic")).isDisplayed());
	}
@Test
	public void verifyLogin() {

		WebElement welcome = driver.findElement(By.id("welcome"));
		welcome.isDisplayed();
		System.out.println(welcome.getText());
		driver.quit();
	}
}
