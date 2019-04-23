package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class PeoplePage extends TestBase{
	
	@FindBy(xpath="//div[@class='hero-content']/div[@class='container']")
	WebElement OurPeoplePageTitleText;
	
	@FindBy(xpath="//div[@class='entry-content']")
	WebElement OurPeopleText;
	
	@FindBy(xpath="//*[@class='container']/div/div/a[contains(@href,'leadership')]")
	WebElement leadershipPhoto;
	
	@FindBy(xpath="//*[@class='container']/div/div/div//a[contains(@href,'leadership')]")
	WebElement leadershipTextLink;
	
	@FindBy(xpath="//*[@class='container']/div/div/a[contains(@href,'international')]")
	WebElement internationalCouncilPhoto;
	
	@FindBy(xpath="//*[@class='container']/div/div/div//a[contains(@href,'international')]")
	WebElement internationalCouncilTextLink;
	
	@FindBy(xpath="//*[@class='full-width-content']/div/h1")
	WebElement WorkTitleText;
	
	@FindBy(xpath="//*[@class='full-width-content']/div//p[1]")
	WebElement WorkText;
	
	@FindBy(xpath="//*[@class='button orange'][contains(@href,'careers')]")
	WebElement LearnMoreWorkButton;
	
	public PeoplePage() {
		PageFactory.initElements(driver, this);
	}	
	
	public String verifyPeoplePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}
	
	public LeadershipPage LeadershipLinkClick() {
		leadershipTextLink.click();
		return new LeadershipPage();
	}

}
