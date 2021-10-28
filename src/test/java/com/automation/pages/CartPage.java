package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCheckoutBtn() {
		WebElement cartPagePrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		WebElement checkOutBtn = driver.findElement(By.id("checkout"));
		System.out.println(cartPagePrice.getText());
		checkOutBtn.click();
	}
}
