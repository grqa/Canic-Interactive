package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class AboutPage extends TestBase{
	
	@FindBy(xpath="//div[@class='hero-content']")
	WebElement AboutUsText;
	
	@FindBy(xpath="//div[contains(@class,'video-col')]/following-sibling::div[@class='content-col']")
	WebElement YearsStrongText;
	
	@FindBy(xpath="//a[contains(@href,'wbenc')]")
	WebElement MajorityWomenPdfLink;
	
	@FindBy(xpath="//div[@class='video-w2']")
	WebElement video;
	
	@FindBy(xpath="//div[contains(@style,'simone')]/following-sibling::div")
	WebElement MissionValuesText;
	
	@FindBy(xpath="//a[contains(@href,'responsible-business')]")
	WebElement LearnMoreBussPracLink;
	
	@FindBy(xpath="//div[contains(@style,'malala')]/following-sibling::div")
	WebElement WhoWeWorkText;
	
	@FindBy(xpath="//a[contains(@href,'work')][contains(text(),'Learn more')]")
	WebElement WhatWeDoLink;
	
	@FindBy(xpath="//div[contains(@style,'Virtual-Globe')]/following-sibling::div")
	WebElement OurWorkText;
	
	@FindBy(xpath="//a[contains(@href,'contact')][contains(text(),'Our work')]")
	WebElement OurWorkTitleLink;
	
	@FindBy(xpath="//a[contains(@href,'contact')][contains(text(),'Explore')]")
	WebElement ExploreLink;
	
	@FindBy(xpath="//div[contains(@style,'mgmt')]/following-sibling::div")
	WebElement OurPeopleText;
	
	@FindBy(xpath="//a[contains(@href,'leadership')][contains(text(),'leadership')]")
	WebElement LeadershipLink;
	
	@FindBy(xpath="//a[contains(@href,'leadership')]/following-sibling::a[contains(@href,'advisory')]")
	WebElement AdvisoryLink;
	
	@FindBy(xpath="//a[contains(@href,'careers')][contains(text(),'at APCO')]")
	WebElement CareersLink;
	
	public AboutPage(){
		PageFactory.initElements(driver, this);
	}
	public String verifyAboutPageTitle() {
		return driver.getTitle();
	}
	
	public String AboutUsText() {
	return	AboutUsText.getText();
	}
	
	public boolean verifyLogoAtTop() {
		HomePage homePage=new HomePage();
		return homePage.LogoAtTop.isDisplayed();
	}

}
