package test1ar.test;

import io.github.selcukes.logging.Logger;
import io.github.selcukes.logging.LoggerFactory;
import io.github.selcukes.wdb.WebDriverBinary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	private static Logger logger = LoggerFactory.getLogger(BrowserTest.class);

	@Test
	public void test() {

		String baseUrl = "https://www.google.com/";
		WebDriver driver;
		WebDriverBinary.chromeDriver().setup();
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		driver = new ChromeDriver();
		driver.get(baseUrl);
		logger.debug(() -> driver.getTitle());

	}

}
