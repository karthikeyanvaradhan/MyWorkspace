package faith.success;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sapient {
	
	
	
	
	public void openSite(){
	
		
		
		System.setProperty("driver.chrome.ChromeDriver","C:\\Users\\vkarthikeyan\\workspace\\success\\src\\test\\java\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("/div[@classname='car-up']"));
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		

	
	}


}

