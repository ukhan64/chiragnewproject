package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {

	WebDriver driver;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnAddToCart() {
		WebElement pdpPagePrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		System.out.println(pdpPagePrice.getText());
		addToCartBtn.click();
	}

	public void clickOnCartIcon() {
		WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartIcon.click();
	}
}
