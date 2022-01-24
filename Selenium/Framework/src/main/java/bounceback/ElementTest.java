package bounceback;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementTest {

	public static WebDriver driver;

	public void webDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\Selenium\\Framework\\src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void tagNameLocator() {

		driver.get("https://www.amfiindia.com/amfi-members-details");
		driver.manage().window().maximize();
		WebElement tagElement = driver.findElement(By.cssSelector("select.select[name=AmcName]"));

		Select selItem = new Select(tagElement);

	}

	/*
	 * public void tagNameLocator() {
	 * 
	 * driver.get("https://www.amfiindia.com/amfi-members-details");
	 * driver.manage().window().maximize(); List<WebElement> tagElement =
	 * driver.findElements(By.tagName("a")); int listSize = tagElement.size();
	 * 
	 * for (int i = 0; i < listSize; i++) { String tagText =
	 * tagElement.get(i).getText(); System.out.println(tagText); }
	 * 
	 * }
	 */
	public static void main(String[] args) {

		ElementTest ele = new ElementTest();
		ele.webDriver();
		// ele.tagNameLocator();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.close();

	}

}
