package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsTrello {
	WebDriver driver;
	public BoardsTrello(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Create']")
	private WebElement createButton;
	public WebElement getCreateButton() {
		return createButton;
	}
	
	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	private WebElement createbuttonindropdown;
	public WebElement getCreatebuttonindropdown() {
		return createbuttonindropdown;
	}
	
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement CreateButtonInsideDropDown;
	public WebElement getCreateButtonInsideDropDown() {
		return CreateButtonInsideDropDown;
	}
	

}
