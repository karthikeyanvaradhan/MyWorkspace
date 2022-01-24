package javaPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Absclass {

	static WebDriver driver;
	
	protected static int a=1;
	protected int b=2;

	int c,d;
	
	public abstract void add();

	public void sub() {

		int k = 0;
		
		WebDriverWait wdwait = new WebDriverWait(driver, 10);
		WebElement element = wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		WebElement element1 = wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	}

	public void mul() {

	}

}

class testClass extends Absclass {

	@Override
	public void add() {
int a=1;
int b=2;

int c = a+b;
System.out.println(c);


	}

	
	public void mul(){
		
		int d=a*b;
		System.out.println(d);
		
	}
	
	public static void main(String args[]){
		
		testClass abs = new testClass();
		
	}
	
	
	
	
}
