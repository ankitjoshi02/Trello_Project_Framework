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

	@FindBy (xpath = "li[class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85'] button[aria-label='Board actions menu']") private WebElement boardOption;
	public WebElement getBoardOption() {
		return boardOption;
	}
	
	@FindBy(xpath = "//div[@class='q2PzD_Dkq1FVX3 px-0 pt-0 pb-0']") private WebElement closeBoardButton;
	public WebElement getCloseBoardButton() {
		return closeBoardButton;
	}


}
