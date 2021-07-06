package com.qa.koovs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.Tools;

public class HomePage extends Tools  {
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginLabel;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public boolean verifyCorrectLoginName(){
		return loginLabel.isDisplayed();
	}

	public void clickLogin(){
		Actions action = new Actions(driver);
		action.moveToElement(loginBtn).build().perform();
		loginBtn.click();
		
	}
}
