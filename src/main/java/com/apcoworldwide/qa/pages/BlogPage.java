package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class BlogPage extends TestBase{

	
	@FindBy(xpath="//a[contains(@class,'subscribe-button')]")
	WebElement subscribeButton;
	
	@FindBy(xpath="//a[contains(@class,'more-blog-posts')]")
	WebElement loadMoreButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Blog')]")
	WebElement blogSearchTypingArea;
	
	@FindBy(xpath="//*[@class='blog-search-form']/input[@class='search-submit']")
	WebElement blogSearchButton;
	
	@FindBy(xpath="//a[contains(@href,'advice-report')][@class='read-more']")
	WebElement WorkingForBalance;
	
	@FindBy(xpath="//div[contains(@style,'corporate-boardroom-meeting')]")
	WebElement VideoBlogPage;
	
	@FindBy(xpath="//a[contains(@href,'what-black-history')][@class='read-more']")
	WebElement BlackHistory;
	
	@FindBy(xpath="//a[contains(@href,'for-b2b-companies-in-a-b2c-world')][@class='read-more']")
	WebElement B2BCompaniesB2CWorld;
	
	////////////////////////////////////////////
	@FindBy(xpath="//div[@class='bp-item'][") //		
	WebElement BlogPostReadMorePart1;         //
	@FindBy(xpath="]/div[2]/a[2]")            // 
	WebElement BlogPostReadMorePart2;         // 
	////////////////////////////////////////////
	
	public BlogPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyBlogPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogoAtTop() {
		HomePage homePage=new HomePage();
		return homePage.LogoAtTop.isDisplayed();
	}

}
