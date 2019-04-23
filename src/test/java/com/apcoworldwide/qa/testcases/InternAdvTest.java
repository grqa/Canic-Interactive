package com.apcoworldwide.qa.testcases;

import java.io.IOException;

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

public class InternAdvTest extends TestBase{
	
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

	public InternAdvTest() {
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
		termsAndConPage = new TermsAndConPage();
		peoplePage = new PeoplePage();
		internAdvPage = homePage.AboutSubMenuInterAdvCouncilClick();

	}

	@Test
	public void verifyInternAdvTitleTest(){
	    Assert.assertEquals(internAdvPage.verifyInternAdvTitle(), pageTitles.InterAdvTitle);
	}
	
	@Test
	public void linkListTest(){
		Assert.assertEquals(testUtil.LinkList(), 0, "Please check the link-list because we have a broken link");
	   	}
	
	
	@Test
	public void verifyLogoTest() {
		Assert.assertTrue(internAdvPage.verifyLogo());
	}
	
	@Test
	public void verifyBreadcrumbsInternAdvTest() {
		Assert.assertTrue(internAdvPage.verifyBreadcrumbs());
	}
	
	@Test
	public void peopleBreadcrumbClickTest() {
		peoplePage = internAdvPage.peopleBreadcrumbClick();
		Assert.assertEquals(peoplePage.verifyPeoplePageTitle(), pageTitles.peopleTitle);
	}
	
	@Test
	public void verifyFullIACTest() {
		log.info("Verifying that Full IAC button is preselected");
		Assert.assertTrue(internAdvPage.verifyFullIAC());
	}
	
	@Test
	public void VerifyHoverStateTest() throws IOException {
		Assert.assertTrue(internAdvPage.VerifyHoverState());
	}
	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}

}
