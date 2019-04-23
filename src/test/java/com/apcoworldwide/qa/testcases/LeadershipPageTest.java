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
import com.apcoworldwide.qa.pages.InternAdvPage;
import com.apcoworldwide.qa.pages.LeadershipPage;
import com.apcoworldwide.qa.pages.NewsPage;
import com.apcoworldwide.qa.pages.PeoplePage;
import com.apcoworldwide.qa.pages.PrivacyPolicyPage;
import com.apcoworldwide.qa.pages.TermsAndConPage;
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class LeadershipPageTest extends TestBase{
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
	InternAdvPage internAdvPage;
	PeoplePage peoplePage;

	public LeadershipPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		newsPage = new NewsPage();
		privacyPolicyPage = new PrivacyPolicyPage();
		termsAndConPage = new TermsAndConPage();
		internAdvPage = new InternAdvPage();
		pageTitles = new PageTitles();
		homePage = new HomePage();
		testUtil = new TestUtil();
		aboutPage = new AboutPage();
		workPage = new WorkPage();
		blogPage = new BlogPage();
		contactPage = new ContactPage();
		leadershipPage = homePage.AboutSubMenuLeadership();

	}
	
	@Test
	public void verifyLeadershipPageTitleTest(){
	    Assert.assertEquals(leadershipPage.verifyLeadershipPageTitle(), pageTitles.leadershipTitle);
	}
	
	@Test
	public void linkListTest(){
		Assert.assertEquals(testUtil.LinkList(), 0, "Please check the link-list because we have a broken link");
	   	}
	
	@Test
	public void verifyLogoTest(){
		Assert.assertTrue(leadershipPage.verifyLogo());
	}
	
	@Test
	public void verifyBreadcrumbsLeadershipPageTest() {
		Assert.assertTrue(internAdvPage.verifyBreadcrumbs());
	}
	
	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}
	
	
	
	
}