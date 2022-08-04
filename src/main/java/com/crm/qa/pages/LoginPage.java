package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

//import io.qameta.allure.Step;

public class LoginPage extends TestBase {
	
	// Page Factory
	@FindBy(linkText="https://ui.freecrm.com/")
	WebElement LoginMenu;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = " //*[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='top-header-menu'] //div[@class='header item']")
	WebElement logoImg;

		//Initialising the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateLogoImg(){
			return logoImg.isDisplayed();
		}
		
		//@Step("Login Step with email: {0},password :{1},for method {method} step....")
		public HomePage login(String un, String pwd){
			email.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}
	
}
