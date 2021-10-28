package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.utils.PropertyReader;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillCheckoutForm() {
		WebElement firstNameInput = driver.findElement(By.id("first-name"));
		WebElement lastNameInput = driver.findElement(By.id("last-name"));
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		firstNameInput.sendKeys(PropertyReader.getProperty("checkout.firstname"));
		lastNameInput.sendKeys(PropertyReader.getProperty("checkout.lastname"));
		postalCode.sendKeys(PropertyReader.getProperty("checkout.postal.code"));
	}

	public void clickOnContinueBtn() {
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
	}
}
