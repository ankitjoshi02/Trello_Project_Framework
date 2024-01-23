package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M6Trello {

	WebDriver driver;
	public M6Trello(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@data-testid='header-member-menu-avatar']") private WebElement hamburger;
	public WebElement getHamburger() {
		return hamburger;
	}
	@FindBy(xpath = "//span[text()='Log out']") private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}
}
