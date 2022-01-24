/**
 * 
 */
package sampleJavaProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author VKarthikeyan
 *
 */
public class WindowHandler {

	public static void driverStart() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\sampleJavaProject\\src\\sampleJavaProject\\Resource\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		try {

			Alert al = driver.switchTo().alert();
			al.dismiss();

		} catch (Exception e) {
			System.out.println("No alerts");
		}

		// js.executeScript("window.scrollBy(0,1000)");

		
		WebElement linkClick = driver.findElement(By.linkText("Click Here"));

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", linkClick);
		*/
		linkClick.click();
		String parentWindow = driver.getWindowHandle();
		String title1 = driver.getTitle();
		
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> childPages = childWindows.iterator();

		while (childPages.hasNext()) {

			String ch1 = childPages.next();

			if (!parentWindow.equalsIgnoreCase(ch1)) {

				try {
					Thread.sleep(1000);

					driver.switchTo().window(ch1);

					WebElement emailId = driver.findElement(By.name("emailid"));
					emailId.sendKeys("achu");
					driver.findElement(By.name("btnLogin")).click();

				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

		driver.switchTo().window(parentWindow);
		String title2 = driver.getTitle();
		if (title1.equalsIgnoreCase(title2)) {
			System.out.println("Parent Window");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driverStart();

	}

}
