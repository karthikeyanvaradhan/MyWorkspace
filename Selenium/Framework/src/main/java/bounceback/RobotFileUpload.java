package bounceback;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RobotFileUpload extends ElementTest{
	
	
	public void driverStart() {
		super.webDriver();
	}

	public void openWebPage() {

		driver.get("https://www.grammarly.com/plagiarism-checker");

	}
	
	
	public void robustClass() throws AWTException{
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.mousePress(MouseEvent.MOUSE_CLICKED);
		rb.mouseRelease(MouseEvent.MOUSE_CLICKED);

	}
	
	public static void main(String[] args) {

		RobotFileUpload rb = new RobotFileUpload();
		rb.openWebPage();
		try {
			rb.robustClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
