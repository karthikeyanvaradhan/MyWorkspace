package lessonPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLoading {
	
void BrowserLoadTest(){
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vkarthikeyan\\workspace\\SeleniumLesson\\src\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/launching-firefox-using-gecko-driver/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		String []linkText =new String[links.size()];
		int i=0;

		//Storing List elements text into String array
		for(WebElement a: links)
		{
		   linkText[i]=a.getText();
		   i++;
		}
		
	}

	public static void main(String[] args) {
		BrowserLoading browser =  new BrowserLoading();
		browser.BrowserLoadTest();
	}
	


}
