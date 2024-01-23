
package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTrello {
	WebDriver driver;
	public LoginTrello(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") private WebElement usernameTextfield;
	public WebElement getusernameTextfield() {
		return usernameTextfield;
	}
	
	@FindBy(xpath = "//span[text()='Continue']") private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	@FindBy(id="password") private WebElement passwordTextfield;
	public WebElement getpasswordTextfield() {
		return passwordTextfield;
	}
	
	@FindBy(xpath = "//span[text()='Log in']") private WebElement loginButton;
	public WebElement getloginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "//p[text()='Create']") private WebElement createButton;
}