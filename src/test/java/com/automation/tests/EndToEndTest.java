package com.automation.tests;

import javax.security.auth.callback.ConfirmationCallback;

import org.testng.annotations.Test;

import com.automation.pages.CartPage;
import com.automation.pages.CheckoutPage;
import com.automation.pages.ConfirmationPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductDetailPage;
import com.automation.pages.ReviewPage;

public class EndToEndTest extends BaseTest {

	@Test(groups = { "regression" })
	public void verifyUserCanPlaceOrder() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

		HomePage homePage = new HomePage(driver);
		homePage.clickOnFirstItem();
		
		Thread.sleep(2000);

		ProductDetailPage pdpPage = new ProductDetailPage(driver);
		pdpPage.clickOnAddToCart();
		pdpPage.clickOnCartIcon();

		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnCheckoutBtn();
		
		Thread.sleep(2000);

		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.fillCheckoutForm();
		checkoutPage.clickOnContinueBtn();

		Thread.sleep(2000);

		ReviewPage reviewPage = new ReviewPage(driver);
		reviewPage.printReviewPageDetails();
		reviewPage.clickOnFinishBtn();

		Thread.sleep(2000);
		
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		confirmationPage.printConfirmationDetails();
	}
}
