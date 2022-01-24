package bounceback;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEventTest extends ElementTest {

	public void driverStart() {
		super.webDriver();
	}

	public void openWebPage() {

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");

		WebElement userPwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		userPwd.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginBtn.click();

		WebElement adminTab = driver.findElement(By.xpath("//b[contains(text(),'Time')]"));
		// adminTab.click();

		Actions ac = new Actions(driver);
		ac.moveToElement(adminTab).build().perform();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File screenPrintFile = screenShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File("D:\\Study\\Selenium\\screenprint\\orangeHRMS.png");

		try {
			FileUtils.copyFile(screenPrintFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MouseEventTest mouseEvent = new MouseEventTest();
		mouseEvent.driverStart();
		mouseEvent.openWebPage();

	}

}
