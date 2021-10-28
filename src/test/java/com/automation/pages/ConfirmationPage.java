package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
	
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void printConfirmationDetails() {
		WebElement confirmationPageHeader = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		WebElement confirmationPageDescription = driver.findElement(By.xpath("//div[@class='complete-text']"));
		System.out.println(confirmationPageHeader.getText());
		System.out.println(confirmationPageDescription.getText());
	}
}
