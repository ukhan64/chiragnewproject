package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.utils.PropertyReader;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void doLogin() {
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys(PropertyReader.getProperty("valid.username"));
		passwordInput.sendKeys(PropertyReader.getProperty("valid.password"));
		loginBtn.click();
	}

	public void verifyInvalidLoginError() {
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		Assert.assertTrue(errorMsg.isDisplayed(), "Locked out user error is not displayed");
	}
}
