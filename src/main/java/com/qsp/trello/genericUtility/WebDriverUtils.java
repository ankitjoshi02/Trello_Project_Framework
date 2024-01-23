package com.qsp.trello.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	/**
	 * This method is used to supply the time for findElement() and findElements()
	 * Exception---NoSuchElementException return void implicitlywait(duration duration)
	 *@param driver 
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
