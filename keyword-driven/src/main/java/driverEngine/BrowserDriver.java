package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

	WebDriver driver;

	public BrowserDriver() {

		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\keyword-driven\\src\\main\\resources\\BrowserExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public static void main(String[] args) {

		BrowserDriver browDriver = new BrowserDriver();

	}

}