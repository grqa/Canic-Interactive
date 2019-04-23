package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class PrivacyPolicyPage extends TestBase{
	
	@FindBy(xpath="//div[@class='entry-content']")
	WebElement PrivacyPolicy;
	
	public PrivacyPolicyPage(){
		PageFactory.initElements(driver, this);
	}	
	
	public String verifyPrivacyPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}

}
