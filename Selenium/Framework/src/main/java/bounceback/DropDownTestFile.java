package bounceback;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestFile extends ElementTest {

	public void driverStart() {
		super.webDriver();
	}

	public void openWebPage() {

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropCountry = driver.findElement(By.name("country"));

		Select listCountry = new Select(dropCountry);

		/*List<WebElement> alldropItems = listCountry.getAllSelectedOptions();

		for (int i = 0; i <= alldropItems.size()-1; i++) {

			String values = alldropItems.get(i).getText();
			System.out.println(values);

			
			 * if(alldropItems.get(i).getText() == "ARUBA"){
			 * listCountry.selectByValue("ARUBA"); }
			 * 
			  
			
		}
*/
		listCountry.selectByValue("INDIA");
	}

	public static void main(String[] args) {

		DropDownTestFile drpTestFile = new DropDownTestFile();
		drpTestFile.driverStart();
		drpTestFile.openWebPage();
		driver.close();
		
	}

}
