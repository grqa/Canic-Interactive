package com.apcoworldwide.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apcoworldwide.qa.base.TestBase;

public class LeadershipPage extends TestBase{
	
	@FindBy(xpath="//*[@id='post-86']")
	WebElement leadershipText;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/a[contains(@href,'margery-kraus')]")
	WebElement MargeryKrausBoardMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/div//a[contains(@href,'margery-kraus')]")
	WebElement MargeryKrausBoardMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/a[contains(@href,'brad-staples')]")
	WebElement BradStaplesBoardMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/div//a[contains(@href,'brad-staples')]")
	WebElement BradStaplesBoardMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/a[contains(@href,'marcia-l-page')]")
	WebElement MarciaPageBoardMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/div//a[contains(@href,'marcia-l-page')]")
	WebElement MarciaPageBoardMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/a[contains(@href,'peter-milton-sommerhauser')]")
	WebElement PeterSommerhauserBoardMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/div//a[contains(@href,'peter-milton-sommerhauser')]")
	WebElement PeterSommerhauserBoardMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/a[contains(@href,'joseph-zimmel')]")
	WebElement JosephZimmelBoardMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[1]/div/div//a[contains(@href,'joseph-zimmel')]")
	WebElement JosephZimmelBoardMembersNamelink;
	
	@FindBy(xpath="//h2[contains(text(),'Global')]")
	WebElement GlobalTitleText;
	
	@FindBy(xpath="//*[contains(text(),'Global')]/following-sibling::p")
	WebElement GlobalText;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'margery-kraus')]")
	WebElement MargeryKrausGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'margery-kraus')]")
	WebElement MargeryKrausGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'brad-staples')]")
	WebElement BradStaplesGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'brad-staples')]")
	WebElement BradStaplesGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'robert-ardelt')]")
	WebElement RobertArdeltGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'robert-ardelt')]")
	WebElement RobertArdeltGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'claire-boussagol')]")
	WebElement ClaireBoussagolGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'claire-boussagol')]")
	WebElement ClaireBoussagolGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'debra-delman')]")
	WebElement DebraDelmanGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'debra-delman')]")
	WebElement DebraDelmanGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'mara-hedgecoth')]")
	WebElement MaraHedgecothGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'mara-hedgecoth')]")
	WebElement MaraHedgecothGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'eliot-hoff')]")
	WebElement EliotHoffGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'eliot-hoff')]")
	WebElement EliotHoffGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'marc-johnson')]")
	WebElement MarcJohnsonGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'marc-johnson')]")
	WebElement MarcJohnsonGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'evan-kraus')]")
	WebElement EvanKrausGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'evan-kraus')]")
	WebElement EvanKrausGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'mamoon-sbeih')]")
	WebElement MamoonSbeihGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'mamoon-sbeih')]")
	WebElement MamoonSbeihGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'martina-tydecks')]")
	WebElement MartinaTydecksGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'martina-tydecks')]")
	WebElement MartinaTydecksGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'anne-wang')]")
	WebElement AnneWangGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'anne-wang')]")
	WebElement AnneWangGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'kelly-williamson')]")
	WebElement KellyWilliamsonGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'kelly-williamson')]")
	WebElement KellyWilliamsonGlobalMembersNamelink;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/a[contains(@href,'agnieszka-zieminska-yank')]")
	WebElement AgnieszkaZieminskaGlobalMembersPhoto;
	
	@FindBy(xpath="//*[@class='leadership-section']/div[2]/div/div//a[contains(@href,'agnieszka-zieminska-yank')]")
	WebElement AgnieszkaZieminskaGlobalMembersNamelink;
	
	public LeadershipPage(){
		PageFactory.initElements(driver, this);
	}
	public String verifyLeadershipPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}
	
	
}
