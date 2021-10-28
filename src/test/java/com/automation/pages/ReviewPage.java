package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {

	WebDriver driver;

	public ReviewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void printReviewPageDetails() {
		WebElement reviewPagePrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		WebElement reviewPageShippingInfo = driver.findElement(By.xpath("//div[@class='summary_info']"));
		WebElement reviewPageTax = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
		WebElement reviewPageTotalPrice = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		System.out.println(reviewPagePrice.getText());
		System.out.println(reviewPageShippingInfo.getText());
		System.out.println(reviewPageTax.getText());
		System.out.println(reviewPageTotalPrice.getText());
	}

	public void clickOnFinishBtn() {
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
	}
}
