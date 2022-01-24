package bounceback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLoginCucumber extends ElementTest {
	
	

	@Given("^I want to open Chrome webBrowser$")
	public void chromeStart() {
		


		super.webDriver();

	}

	@And("^Enter Gmail Url$")

	public static void navigateGmail() {
		driver.get("www.gmail.com");
	}

	@When("^I Enter Username \"(.*)\" $")
	public static void gmailUser(String userName) {

		WebElement gmailUserName = driver.findElement(By.xpath("//input[@type='email']"));
		gmailUserName.sendKeys(userName);
	}

	@And("^Click on Next Button $")
	public static void gmailUserNextBtn() {

		WebElement nextBtn = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		nextBtn.click();
	}

	@And("^I Enter Password \"(.*)\" $")
	public static void gmailPwd(String passWord) {

		WebElement gmailPassword = driver.findElement(By.xpath("//input[@type='password']"));
		gmailPassword.sendKeys(passWord);
	}

	@Then("^I Click on NextButton for Login $")

	public static void gmailUserSubmit() {

		WebElement gmailLogin = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		gmailLogin.click();
	}

}
