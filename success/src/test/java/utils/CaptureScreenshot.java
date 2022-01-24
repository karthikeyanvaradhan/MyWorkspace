package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public void printScreen(WebDriver driver, String fileName) throws IOException {

		TakesScreenshot photo = (TakesScreenshot) driver;
		File file = photo.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, "./Screenshots/" + fileName + "jpeg");
		FileHandler.copy(file, new File("FullPageScreenshot.png"));
	}

}
