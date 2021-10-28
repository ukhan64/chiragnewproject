package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test(groups = { "chirag", "smoke", "login" })
	public void verifyUserCannotLoginWithLockedUser() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();
	}

}
