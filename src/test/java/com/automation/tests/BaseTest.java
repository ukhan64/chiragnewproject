package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.utils.PropertyReader;

public class BaseTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		PropertyReader.initProperty();

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get(PropertyReader.getProperty("base.url"));
	}

	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}

}
