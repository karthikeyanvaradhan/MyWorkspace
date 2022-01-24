package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GmailLogin {

	public static String url = "https://fhlb.ahpcollaboration.com/jira/login.jsp";

	@Test
	public static void gmailLogin() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\webapp\\src\\main\\resources\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

}
