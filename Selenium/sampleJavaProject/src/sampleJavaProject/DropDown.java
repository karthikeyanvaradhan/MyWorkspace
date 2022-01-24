package sampleJavaProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.opera.core.systems.OperaSettings.Capability;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		String locPath = System.getProperty("user.dir");
		System.out.println(locPath);
		String testData = locPath + "\\src\\sampleJavaProject\\ExeFiles\\firefox\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", testData);

		new DesiredCapabilities();
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
		// desiredCapabilities.setAcceptInsecureCerts(acceptInsecureCerts);
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		desiredCapabilities.setCapability("ïgnoreZoomSetting", true);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		/* Using Select Class */

		// Select dropValues = new Select((WebElement)
		// driver.findElement(By.xpath("//*[@id='select-demo']")));

		/* Using List Class */

		List<WebElement> dropValues = driver.findElements(By.xpath("//*[@id='select-demo']"));
		// dropValues.selectByVisibleText("Sunday");

		
		for (WebElement data : dropValues) {
			//data.click();
			System.out.println(dropValues.lastIndexOf(data));
			for (int i = 0; i <= dropValues.lastIndexOf(data); i++) {
				dropValues.get(i).getText();
Thread.sleep(100);
				if (data.getText().contains("Thursday")) {

					data.click();
Thread.sleep(100);
break;

				}

			}
		}

	}

}