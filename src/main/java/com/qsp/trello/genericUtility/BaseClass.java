package com.qsp.trello.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public FileUtility fileutils = new FileUtility();
	public WebDriverUtils webdriverutils = new WebDriverUtils();
	public static WebDriver driver;
	//@Parameters({"browserName","url"})
	@BeforeMethod
	public void preCondition() throws IOException {
		String browserName =fileutils.readTheDataFromPropertyFIle("browserName");
		String url =fileutils.readTheDataFromPropertyFIle("url");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if ((browserName.equals("firefox"))) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webdriverutils.implicitWait(driver);
		driver.get(url);
	}
	@AfterMethod
	public void postCOndition() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
