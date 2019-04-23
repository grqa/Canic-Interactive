package com.apcoworldwide.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apcoworldwide.qa.base.TestBase;
import com.apcoworldwide.qa.utils.TestUtil;

public class WorkPage extends TestBase{
	
	@FindAll({ @FindBy(xpath = "//ul[@class='tabs-list services-tabs']") })
	List<WebElement> Services;
	
	@FindBy(xpath="//a[contains(text(),'View all')]")
	WebElement View_all_button;
	
	@FindBy(xpath="//div[@class='cs-image']/a[contains(@href,'ukrainian-ministry-of-finance')]")
	WebElement MinFinancePhoto;
	
	@FindBy(xpath="//a[contains(@href,'ukrainian-ministry-of-finance')][@class='read-more']")
	WebElement MinFinanceReadMore;
	
	@FindBy(xpath="//div[@class='cs-image']/a[contains(@href,'polish-cultural-institute')]")
	WebElement PolishCulturalPhoto;
	
	@FindBy(xpath="//a[contains(@href,'polish-cultural-institute')][@class='read-more']")
	WebElement PolishCulturalReadMore;
	
	@FindBy(xpath="//div[@class='cs-image']/a[contains(@href,'mars-food')]")
	WebElement MarsFoodPhoto;
	
	@FindBy(xpath="//a[contains(@href,'mars-food')][@class='read-more']")
	WebElement MarsFoodReadMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[1]")
	WebElement Advisory;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'advisory')]")
	WebElement AdvisoryLearnMore;

	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[3]")
	WebElement Advocacy;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'advocacy')]")
	WebElement AdvocacyLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[5]")
	WebElement CorporateCommunication;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'corporate-communication')]")
	WebElement CorporateCommunicationLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[7]")
	WebElement Creative;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'advisory')]")
	WebElement CreativeLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[9]")
	WebElement Crisis;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'crisis')]")
	WebElement CrisisLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[11]")
	WebElement Digital;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'digital')]")
	WebElement DigitalLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[13]")
	WebElement marketingCommunication;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'marketing-communication')]")
	WebElement marketingCommunicationLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[15]")
	WebElement media;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'media')]")
	WebElement mediaLearnMore;
	
	@FindBy(xpath="//ul[@class='tabs-list services-tabs']/li[17]")
	WebElement researchStrategy;

	@FindBy(xpath="//a[@class='read-more'][contains(@href,'research-strategy')]")
	WebElement researchStrategyLearnMore;
	
	@FindBy(xpath="//div[@class='content-col']/a[contains(@href,'energy-and-clean-tech')]")
	WebElement GreenTech;
	
	@FindBy(xpath="//div[@class='content-col']/a[contains(@href,'financial')]")
	WebElement financial;
	
	@FindBy(xpath="//div[@class='content-col']/a[contains(@href,'food-consumer-products-and-retail')]")
	WebElement Food;
	
	@FindBy(xpath="//div[@class='content-col']/a[contains(@href,'health-care')]")
	WebElement healthCare;
	
	@FindBy(xpath="//div[@class='content-col']/a[contains(@href,'technology')]")
	WebElement technology;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'agility')]")
	WebElement agilityPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'agility')]")
	WebElement agilityLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'ai-comms-lab')]")
	WebElement aiCommsLabPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'ai-comms-lab')]")
	WebElement aiCommsLabText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'apco-er')]")
	WebElement apcoErPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'apco-er')]")
	WebElement apcoErLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'prospective')]")
	WebElement ProspectivePhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'prospective')]")
	WebElement ProspectiveLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'/proprietary-tools/ror/')]")
	WebElement rorPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'/proprietary-tools/ror/')]")
	WebElement rorLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'trademarks')]")
	WebElement trademarksPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'trademarks')]")
	WebElement trademarksLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'sonar-campfire')]")
	WebElement sonarCampfirePhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'sonar-campfire')]")
	WebElement sonarCampfireLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'telescope')]")
	WebElement telescopePhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'telescope')]")
	WebElement telescopeLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'apco-insight')]")
	WebElement apcoInsightPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'apco-insight')]")
	WebElement apcoInsightLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'sustainability-purpose')]")
	WebElement sustainabilityPurposePhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'sustainability-purpose')]")
	WebElement sustainabilityPurposeLinkText;
	
	@FindBy(xpath="//div[@class='proprietary-tool-img']/a[contains(@href,'global-solutions')]")
	WebElement globalSolutionsPhoto;
	
	@FindBy(xpath="//div[@class='proprietary-tool-content']/a[contains(@href,'global-solutions')]")
	WebElement globalSolutionsLinkText;
		
	public WorkPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyWorkPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogoAtTop() {
		HomePage homePage=new HomePage();
		return homePage.LogoAtTop.isDisplayed();
	}
	
	public boolean verifySelectedServiceAtEveryRefresh() {
		TestUtil.scrollIntoView(Services.get(1));
		String Service1 = null;
		String Service2 = null;
	     int ServicesSize = Services.size();
	     for(int i=0; i<ServicesSize; i++) {
	    	boolean activeService = Services.get(i).isEnabled();
	    	if(activeService==true) {
	    		Service1 = Services.get(i).getText();
	    		break;
	    	}
	     }
	     driver.navigate().refresh();
	     for(int i=0; i<ServicesSize; i++) {
	    	boolean activeService = Services.get(i).isEnabled();
	    	if(activeService==true) {
	    		Service2 = Services.get(i).getText();
	    		break;
	    	}
	     }
	     if(Service1.contentEquals(Service2)) {
	    	 log.error("The default service at 'Work Page' is the same all the time");
				return false;
	     }
	     else {
	    	 log.info("The default service at 'Work Page' is changing automatically");
				return true;
	     }
	}
	
	
	public boolean clickOnServiceDigital() {
		Digital.click();
		return DigitalLearnMore.isDisplayed();
		
	}


}
