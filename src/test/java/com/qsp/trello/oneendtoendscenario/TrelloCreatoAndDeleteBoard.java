package com.qsp.trello.oneendtoendscenario;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qsp.trello.genericUtility.BaseClass;
import com.qsp.trello.genericUtility.FileUtility;
import com.qsp.trello.pomrepo.BoardsTrello;
import com.qsp.trello.pomrepo.HomePage;
import com.qsp.trello.pomrepo.LoginTrello;
import com.qsp.trello.pomrepo.LogoutPage;
import com.qsp.trello.pomrepo.M6Trello;

public class TrelloCreatoAndDeleteBoard extends BaseClass{

	@Test
	public void checkWeatherEnduserCanCreateAndDeleteTheBoard() throws IOException {
		HomePage homepage=new HomePage(driver);
		LoginTrello loginTrello=new LoginTrello(driver);
		BoardsTrello boardTrello=new BoardsTrello(driver);
		M6Trello m6trello=new M6Trello(driver);
		LogoutPage logoutPage=new LogoutPage(driver);
		homepage.getLoginLink().click();
		loginTrello.getusernameTextfield().sendKeys(fileutils.readTheDataFromPropertyFIle("username"));
		loginTrello.getpasswordTextfield().sendKeys(fileutils.readTheDataFromPropertyFIle("password"));
		loginTrello.getloginButton().click();
		boardTrello.getCreateButton().click();
		boardTrello.getCreatebuttonindropdown().click();
		boardTrello.getBoardTitleTextField().sendKeys("boardTitle");
		boardTrello.getCreateButtonInsideDropDown().click();
		m6trello.getHamburger().click();
		m6trello.getLogOut().click();
		logoutPage.getLogout();
	}
}
