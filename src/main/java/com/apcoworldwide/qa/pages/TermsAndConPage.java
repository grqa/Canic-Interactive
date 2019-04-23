package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class TermsAndConPage extends TestBase{
	
	@FindBy(xpath="//*[@id='post-106']")
	WebElement termsArticle;
	
	public TermsAndConPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTermsPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}

}
