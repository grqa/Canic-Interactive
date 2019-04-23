package com.apcoworldwide.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.apcoworldwide.qa.base.TestBase;
import com.apcoworldwide.qa.pages.AboutPage;
import com.apcoworldwide.qa.pages.BlogPage;
import com.apcoworldwide.qa.pages.ContactPage;
import com.apcoworldwide.qa.pages.HomePage;
import com.apcoworldwide.qa.pages.LeadershipPage;
import com.apcoworldwide.qa.pages.NewsPage;
import com.apcoworldwide.qa.pages.PrivacyPolicyPage;
import com.apcoworldwide.qa.pages.TermsAndConPage;
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class TermsAndConPageTest extends TestBase {

	
	HomePage homePage;
	TestUtil testUtil;
	AboutPage aboutPage;
	WorkPage workPage;
	BlogPage blogPage;
	ContactPage contactPage;
	LeadershipPage leadershipPage;
	NewsPage newsPage;
	PageTitles pageTitles;
	PrivacyPolicyPage privacyPolicyPage;
	TermsAndConPage termsAndConPage;

	public TermsAndConPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		pageTitles = new PageTitles();
		homePage = new HomePage();
		testUtil = new TestUtil();
		aboutPage = new AboutPage();
		workPage = new WorkPage();
		blogPage = new BlogPage();
		contactPage = new ContactPage();
		leadershipPage = new LeadershipPage();
		newsPage = new NewsPage();
		privacyPolicyPage = new PrivacyPolicyPage();
		termsAndConPage = homePage.TermsAndConButton();

	}

	@Test
	public void verifytermsAndConPageTitleTest(){
	    Assert.assertEquals(termsAndConPage.verifyTermsPageTitle(), pageTitles.termsTitle);
	}
	
	@Test
	public void verifyLogoTest(){
		Assert.assertTrue(termsAndConPage.verifyLogo());
	}
	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}

}