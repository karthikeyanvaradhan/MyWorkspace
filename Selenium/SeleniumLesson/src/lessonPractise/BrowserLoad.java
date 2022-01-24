package lessonPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLoad {

	ClassLoader classLoader = null;

	BrowserLoad() {

		classLoader = getClass().getClassLoader();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\browserDrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com/launching-firefox-using-gecko-driver/");

	}
}


	class ChromeBrowser {

		public void chromeDriver() {

			System.setProperty("webDriver.chrome.driver",
					"C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\browserDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.softwaretestingmaterial.com/");

		}

		public static void main(String[] args) throws InterruptedException {

			new BrowserLoad();
			Thread.sleep(1000);
			ChromeBrowser driverRun = new ChromeBrowser();
			driverRun.chromeDriver();

		}

	}
