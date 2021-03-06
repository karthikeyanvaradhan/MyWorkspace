package executionEngine;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverScript {

	final int v = 1;

	private static WebDriver driver = null;

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\Selenium\\HybridFramework\\src\\main\\resources\\browserDriverExeFile\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://shop.demoqa.com/");

		/*
		 * Wait flwait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(10,TimeUnit.SECONDS) .pollingEvery(10,TimeUnit.SECONDS)
		 * .ignoring(Exception.class);
		 * 
		 * WebDriverWait waitDriver = new WebDriverWait(driver, 10);
		 * waitDriver.until(ExpectedConditions.elementToBeClickable(element));
		 */

		driver.findElement(By.linkText("woocommerce-store-notice__dismiss-link")).click();
		// Thread.sleep(1000);
		// Thread.sleep(3000);
		//
		try {
			driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		} catch (Exception e) {
			System.err.println();
		}

		driver.findElement(By.xpath("//input[@id='username']"));
		driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
