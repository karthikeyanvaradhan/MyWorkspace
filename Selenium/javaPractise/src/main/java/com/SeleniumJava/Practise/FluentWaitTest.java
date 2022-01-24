package com.SeleniumJava.Practise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTest {
	public static WebDriver driver;
	
	public static void printScreen() throws Exception{
		
		TakesScreenshot screenPrint = ((TakesScreenshot)driver);
		File screenPrintFil = screenPrint.getScreenshotAs(OutputType.FILE);
		
		
		//String srcFile = "C:\\Users\\vkarthikeyan\\workspace\\javaPractise\\src\\main\\java\\com\\SeleniumJava\\Practise\\NewFile";
		
		
		//	File fsrcFile = new File(srcFile);
		/*String destFile = "C:\\Users\\vkarthikeyan\\workspace\\javaPractise\target\\Result_Screen";	
		File fdestFile = new File(destFile);
		*/	
			
			//FileUtils.copyFile(srcFile,new File(System.getProperty("user.dir")));
			//FileUtils.copyFile(source,fdestFile);
	String pageTitle = driver.getTitle(); 
		
	
	
	Calendar calendar = Calendar.getInstance();
    SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
    SimpleDateFormat formater1 = new SimpleDateFormat("dd_MM_yyyy_hh_mm");
	
	File targetFile = new File ("./src/main/resources/motwani/"+formater1.format(calendar.getTime())+"/"+ pageTitle+".png"+formater1.format(calendar.getTime()));
    
    FileUtils.copyFile(screenPrintFil,targetFile);
		
		
		
		
	}
	//C:\Users\vkarthikeyan\workspace\Framework\src\main\resources\TestResult
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vkarthikeyan\\workspace\\javaPractise\\src\\test\\resources\\Drivers\\resource\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().window().maximize();
		

		try {
			printScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement btnClick = driver.findElement(By.xpath("//div[@dir='ltr']//following::button"));

		// WebElement btnClick =
		// driver.findElement(By.xpath("//button[text()='Click me to start
		// timer')]"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnClick));

		btnClick.click();

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = fwait.until(new com.google.common.base.Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				WebElement ele = driver.findElement(By.xpath(("//*[@id='demo']")));

				String eleText = ele.getAttribute("innerHTML");
				System.out.println(eleText);

				if (eleText.equalsIgnoreCase("WebDriver")) {

					WebElement webEle = driver.findElement(By.xpath("//*[@id='demo' and text()='WebDriver']"));

					System.out.println(webEle.getAttribute("innerHTML"));
					return webEle;

				}

				else {
					return null;
				}
			}
		});

		System.out.println("Element is Displayed ?" + element.isDisplayed());
		
		
		
		
		
		driver.close();
		//driver.quit();
		
		
	
	}
	
	
	
	

}
