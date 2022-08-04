package com.crm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

//import io.qameta.allure.Description;

public class LoginPageTest extends TestBase {
	LoginPage loginPage ;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1, description= " verify the title of the page loaded")
	//@Description("Test Description: Check the title ")
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
//	@Test(priority = 2)
//	public void crmLogoImgTest() throws InterruptedException {
//		Thread.sleep(2000);
//		boolean flag = loginPage.validateLogoImg();
//		Assert.assertTrue(flag);
//	}

	@Test(priority  = 2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
		boolean flag = loginPage.validateLogoImg();
		Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}