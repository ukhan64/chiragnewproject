package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnFirstItem() {
		WebElement homePageItemName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		WebElement homePagePrice = driver.findElement(
				By.xpath("//div[text()='Sauce Labs Backpack']/../../..//div[@class='inventory_item_price']"));

		System.out.println(homePageItemName.getText());
		System.out.println(homePagePrice.getText());
		homePageItemName.click();
	}
}
