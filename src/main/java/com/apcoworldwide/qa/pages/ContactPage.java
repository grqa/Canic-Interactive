package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Abu Dhabi')]")
	WebElement Abu_Dhabi;
	
	@FindBy(xpath="//a[contains(text(),'Bangkok')]")
	WebElement Bangkok;
	
	@FindBy(xpath="//a[contains(text(),'Beijing')]")
	WebElement Beijing;
	
	@FindBy(xpath="//a[contains(text(),'Berlin')]")
	WebElement Berlin;
	
	@FindBy(xpath="//a[contains(text(),'Brussels')]")
	WebElement Brussels;
	
	@FindBy(xpath="//a[contains(text(),'Chicago')]")
	WebElement Chicago;
	
	@FindBy(xpath="//a[contains(text(),'Dubai')]")
	WebElement Dubai;
	
	@FindBy(xpath="//a[contains(text(),'Frankfurt')]")
	WebElement Frankfurt;
	
	@FindBy(xpath="//a[contains(text(),'Hanoi')]")
	WebElement Hanoi;
	
	@FindBy(xpath="//a[contains(text(),'Hong Kong')]")
	WebElement Hong_Kong;
	
	@FindBy(xpath="//a[contains(text(),'Istanbul')]")
	WebElement Istanbul;
	
	@FindBy(xpath="//a[contains(text(),'Jakarta')]")
	WebElement Jakarta;
	
	@FindBy(xpath="//a[contains(text(),'Kuala_Lumpur')]")
	WebElement Kuala_Lumpur;
	
	@FindBy(xpath="//a[contains(text(),'London')]")
	WebElement London;
	
	@FindBy(xpath="//a[contains(text(),'Manama')]")
	WebElement Manama;
	
	@FindBy(xpath="//a[contains(text(),'Milan')]")
	WebElement Milan;
	
	@FindBy(xpath="//a[contains(text(),'Moscow')]")
	WebElement Moscow;
	
	@FindBy(xpath="//a[contains(text(),'Mumbai')]")
	WebElement Mumbai;
	
	@FindBy(xpath="//a[contains(text(),'New Delhi')]")
	WebElement New_Delhi;
	
	@FindBy(xpath="//a[contains(text(),'New York')]")
	WebElement New_York;
	
	@FindBy(xpath="//a[contains(text(),'Paris')]")
	WebElement Paris;
	
	@FindBy(xpath="//a[contains(text(),'Raleigh')]")
	WebElement Raleigh;
	
	@FindBy(xpath="//a[contains(text(),'Riyadh')]")
	WebElement Riyadh;
	
	@FindBy(xpath="//a[contains(text(),'Rome')]")
	WebElement Rome;
	
	@FindBy(xpath="//a[contains(text(),'Seattle')]")
	WebElement Seattle;
	
	@FindBy(xpath="//a[contains(text(),'Shanghai')]")
	WebElement Shanghai;
	
	@FindBy(xpath="//a[contains(text(),'Singapore')]")
	WebElement Singapore;
	
	@FindBy(xpath="//a[contains(text(),'Tel Aviv')]")
	WebElement Tel_Aviv;
	
	@FindBy(xpath="//a[contains(text(),'Tokyo')]")
	WebElement Tokyo;
	
	@FindBy(xpath="//a[contains(text(),'Warsaw')]")
	WebElement Warsaw;
	
	@FindBy(xpath="//a[contains(text(),'Washington')]")
	WebElement Washington;
	
	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyContactPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogoAtTop() {
		HomePage homePage=new HomePage();
		return homePage.LogoAtTop.isDisplayed();
	}



}
