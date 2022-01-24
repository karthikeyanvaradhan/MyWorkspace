package lessonPractise;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class DriverWait {

	public static WebDriver driver;
	
	public static WebElement webDriverwait() {

		driver = new FirefoxDriver();
		WebDriverWait wdwait = new WebDriverWait(driver, 20);
		WebElement inputbox = wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//[inputText(")));
		Boolean title = wdwait.until(ExpectedConditions.titleContains("Firefox"));
		return inputbox;

	}
	
	
	
	public static WebElement webDriverFluentwait() {
		
		Wait flwait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		flwait.until(new Function(){
			public WebElement apply(WebDriver driver){
				
			}
		});
		
		return null;
		
		
		
	}

	public static void main(String[] args) {
		
		DriverWait drwait =  new DriverWait();
		drwait.webDriverwait();

	}

}
