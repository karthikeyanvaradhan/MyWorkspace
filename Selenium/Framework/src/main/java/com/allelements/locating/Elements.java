package com.allelements.locating;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Elements {

	private static Logger log = Logger.getLogger(Elements.class);

	public void getInfoLog(String message) {

		log.info(message);
	}

	public static WebElement byXpath(SearchContext context,Duration timeoutSeconds,final String xPath,final boolean andDisplayed){
		Wait <SearchContext> elemwait = new FluentWait<SearchContext>(context)
											  .withTimeout(timeoutSeconds).pollingEvery(250, TimeUnit.SECONDS)
											  .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		
		
		return elemwait.until(new Function<SearchContext, WebElement>() {

			public WebElement apply(SearchContext context) {

				WebElement element = context.findElement(By.xpath(xPath));
				
				if(andDisplayed && !element.isDisplayed()){
					throw new NoSuchElementException(element.toString());
				}
				
				
				return element;
			}
		});
	}
}