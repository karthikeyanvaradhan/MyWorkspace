package bounceback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

class OpenCRMTest {

	public static WebDriver driver;

	@Given("^open chrome browser$")
	public void browserLogin() {
		driver = new ChromeDriver();

	}

	@Then("^enter open crm url$")
	public void enter_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}

	@Then("enter username and password$")
	public void enteruser_pwd() {

		WebElement userID = driver.findElement(By.name("txtUsername"));
		userID.click();
		userID.sendKeys("Admin");

		WebElement userPWD = driver.findElement(By.name("txtPassword"));
		userPWD.click();
		userPWD.sendKeys("admin123");

	}

	@And("^click on submit$")
	public void clkLoginbtn() {

		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	}

}
