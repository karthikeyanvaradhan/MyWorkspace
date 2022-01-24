import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitinSelenium {

	protected static WebDriver driver;

	public WaitinSelenium() {

		driver = new FirefoxDriver();

		driver.get("http://www.google.com");

	}

	public static void elementimplicitwait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void elementexplicitwait(String elementwait) {

		WebDriverWait driverwait = new WebDriverWait(driver, 10);
		driverwait.pollingEvery(100, TimeUnit.MILLISECONDS);

	}

}
