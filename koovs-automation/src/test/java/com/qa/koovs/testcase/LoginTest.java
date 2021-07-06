package com.qa.koovs.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.Tools;
import com.qa.koovs.pages.HomePage;
import com.qa.koovs.pages.LoginPage;
import com.qa.testdata.ReadExcel;
import com.sun.tools.javac.util.Assert;

public class LoginTest extends Tools {

	HomePage home;
	LoginPage login;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		login = new LoginPage();
		home = new HomePage();
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest1() {
		String homePageTitle = home.verifyHomePageTitle();
		assertEquals(homePageTitle, "Online Shopping - Shop for Clothing, Shoes & Accessories in India at Koovs");
	}

	@Test(priority = 2)
	public void verifyCorrectLoginLabel1() {
		assertTrue(home.verifyCorrectLoginName());
	}

	@Test(priority = 3)
	public void verifyHomePageLogin() {
		home.clickLogin();

	}

	@Test(priority = 4)
	public void verifyLoginTitlelogo() {
		assertTrue(login.validateKoovsImage());

	}

	@Test(priority = 5)
	public void verifyLoginPageTitleTest() {
		String Loginpage = login.validateLoginPageTitle();
		assertEquals(Loginpage, "Online Shopping - Shop for Clothing, Shoes & Accessories in India at Koovs");
	}

	@Test(priority = 6, dataProvider = "KoovsData", dataProviderClass = ReadExcel.class)
	public void verifyloginTest(String Username, String Password) throws InterruptedException  {
		home.clickLogin();
		login.login(Username, Password);
		String exp_message = "YOU'VE SUCCESSFULLY LOGGED IN.";
		String actual = driver.findElement(By.xpath("//div[@id='notification-wrapper']/div/span")).getText();
		assertEquals(exp_message, actual);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
