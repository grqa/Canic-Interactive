package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;

public class NewsPage extends TestBase{


	@FindBy(xpath="//div[@class='entry-content']/h1")
	WebElement Title;
	
	@FindBy(xpath="//div[@class='entry-content']/p")
	WebElement MainText;
	
	@FindBy(xpath="//div[class='load-more']")
	WebElement load_more;
	
	@FindBy(xpath="//div[@class='news-posts-container']/div[number]")
	WebElement newsContainer;
	
	@FindBy(xpath="//div[@class='media-contacts']")
	WebElement MediaContacts;
	
	@FindBy(xpath="//input[contains(@placeholder,'News Search')]")
	WebElement SearchTyping;
	
	@FindBy(xpath="//div[contains(@class,'is-25')]//input[2]")
	WebElement SearchSubmitNews;
	
	public NewsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNewsPageTitle() {
		return driver.getTitle();
	}

	
}
