package com.qa.koovs.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.Tools;



public class LoginPage extends Tools {
	
	
	
	//Page Factory - OR:
		@FindBy(id="login-email")
		WebElement loginUsrName;
		
		@FindBy(id="login-pswd")
		WebElement loginPwd;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginBtn;
		
		@FindBy(xpath="//img[@alt='Koovs']")
		WebElement KoovsLogo;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
	
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateKoovsImage(){
			return KoovsLogo.isDisplayed();
		}
		
		public HomePage login(String Username,String Password) throws InterruptedException{
			loginUsrName.sendKeys(Username);
			Thread.sleep(2000); 
			loginPwd.sendKeys(Password);
			Thread.sleep(2000); 
			JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", loginBtn); 	
			Thread.sleep(2000);    	
			return new HomePage();
		}
}
		
	
	



