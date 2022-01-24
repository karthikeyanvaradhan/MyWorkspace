package bounceback;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest extends ElementTest {

	public void driverStart() {
		super.webDriver();
	}

	public void openWebPage() {

		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		//driver.switchTo().alert().dismiss();
		driver.navigate().refresh();

      String parentWindow = driver.getWindowHandle();
      
      Set <String> childWindows = driver.getWindowHandles();
      
      Iterator <String> newPage = childWindows.iterator();
		
      while(newPage.hasNext()){
    	  
    	  
      }
      WebElement dropDownElement = driver.findElement(By.className("spTextField"));
		dropDownElement.click();

		Select dropDownItems = new Select(dropDownElement);

		List<WebElement> options = dropDownItems.getOptions();
		int val = options.size() - 1;

		for (int i = 0; i <= val; i++) {

			String text = options.get(i).getText();
			System.out.println(text);
		}

	}

	public static void main(String args[]) {

		DropDownTest dp = new DropDownTest();
		dp.driverStart();
		dp.openWebPage();

	}

}
