package com.apcoworldwide.qa.testcases;


import java.io.IOException;

import org.sikuli.script.FindFailed;
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
import com.apcoworldwide.qa.pages.PrivacyPolicyPage;
import com.apcoworldwide.qa.pages.TermsAndConPage;
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class HomePageTest extends TestBase {

	
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

	public HomePageTest() {
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
		internAdvPage = new InternAdvPage();

	}

	@Test
	public void verifyHomePageTitleTest(){
	    Assert.assertEquals(homePage.verifyHomePageTitle(), pageTitles.homeTitle);
	}
	
	@Test
	public void linkListTest(){
		Assert.assertEquals(testUtil.LinkList(), 0, "Please check the link-list because we have a broken link");
	   	}
	
	
	@Test
	public void verifyLogoTest() {
		Assert.assertTrue(homePage.verifyLogoAtTop());
	}
	
	@Test
	public void verifyLogoScrollTest(){
		Assert.assertTrue(homePage.verifyLogoScroll());
	}
	
	@Test
	public void verifyTopLogoAtScrollTest(){
		Assert.assertFalse(homePage.verifyTopLogoAtScroll());
	}
	
	@Test
	public void verifyLogoScrollAtTopTest(){
		Assert.assertFalse(homePage.verifyLogoScrollAtTop());
	}
	
	@Test
	public void ClickOnAboutTopTest(){
		aboutPage = homePage.ClickOnAboutTop();
		Assert.assertEquals(aboutPage.verifyAboutPageTitle(), pageTitles.aboutTitle);
	}
	
	@Test
	public void ClickOnAboutDownTest(){
		aboutPage = homePage.ClickOnAboutDown();
		Assert.assertEquals(aboutPage.verifyAboutPageTitle(), pageTitles.aboutTitle);		
	}
	
	@Test
	public void ClickOnWorkTopTest(){
		workPage = homePage.ClickOnWorkTop();
		Assert.assertEquals(workPage.verifyWorkPageTitle(), pageTitles.workTitle);
	}
	
	@Test
	public void ClickOnWorkDownTest(){
		workPage = homePage.ClickOnWorkDown();
		Assert.assertEquals(workPage.verifyWorkPageTitle(), pageTitles.workTitle);		
	}
	
	@Test
	public void ClickOnBlogTopTest(){
		blogPage = homePage.ClickOnBlogTop();
		Assert.assertEquals(blogPage.verifyBlogPageTitle(), pageTitles.blogTitle);
	}
	
	@Test
	public void ClickOnBlogDownTest(){
		blogPage = homePage.ClickOnBlogDown();
		Assert.assertEquals(blogPage.verifyBlogPageTitle(), pageTitles.blogTitle);		
	}
	
	@Test
	public void ClickOnContactTopTest(){
		contactPage = homePage.ClickOnContactTop();
		Assert.assertEquals(contactPage.verifyContactPageTitle(), pageTitles.contactTitle);
	}
	
	@Test
	public void ClickOnContactDownTest(){
		contactPage = homePage.ClickOnContactDown();
		Assert.assertEquals(contactPage.verifyContactPageTitle(), pageTitles.contactTitle);		
	}
	
	@Test
	public void SearchWindowTest(){
		Assert.assertTrue(homePage.SearchWindow());
	}
	
	@Test
	public void SearchTypingTest(){
		Assert.assertEquals(homePage.SearchTyping(), "Search Results for: "+prop.getProperty("searchText"));
	}
	
	@Test
	public void SearchWindowCloseTest(){
		Assert.assertFalse(homePage.SearchWindowClose());
	}
	
	@Test
	public void AboutSubMenuTest(){
		homePage.AboutSubMenu();
		Assert.assertTrue(homePage.AboutSubMenu());
	}
	
	@Test
	public void AboutSubMenuLocationsTest(){
		contactPage = homePage.AboutSubMenuLocations();
		Assert.assertEquals(contactPage.verifyContactPageTitle(),pageTitles.contactTitle);
	}
	
	@Test
	public void AboutSubMenuCareersTest(){
		homePage.AboutSubMenuCareers();
		String verifyCareersPageTitle = driver.getTitle();
		Assert.assertEquals(verifyCareersPageTitle, pageTitles.careersTitle);
	}
	
	@Test
	public void AboutSubMenuLeadershipTest(){
		leadershipPage = homePage.AboutSubMenuLeadership();
		Assert.assertEquals(leadershipPage.verifyLeadershipPageTitle(), pageTitles.leadershipTitle);
	}
	
	@Test
	public void AboutSubMenuNewsTest(){
		newsPage = homePage.AboutSubMenuNews();
		Assert.assertEquals(newsPage.verifyNewsPageTitle(), pageTitles.newsTitle);
	}
	
	@Test
	public void AboutSubMenuAwardsTest(){
		homePage.AboutSubMenuAwards();
		String verifyAwardsPageTitle = driver.getTitle();
		Assert.assertEquals(verifyAwardsPageTitle,pageTitles.awardsTitle);
	}
	
	@Test
	public void AboutSubMenuLocationsDownTest(){
		contactPage = homePage.AboutSubMenuLocationsDown();
		Assert.assertEquals(contactPage.verifyContactPageTitle(), pageTitles.contactTitle);
	}
	
	@Test
	public void AboutSubMenuCareersDownTest(){
		homePage.AboutSubMenuCareersDown();
		String verifyCareersPageTitle = driver.getTitle();
		Assert.assertEquals(verifyCareersPageTitle, pageTitles.careersTitle);
	}
	
	@Test
	public void AboutSubMenuLeadershipDownTest(){
		leadershipPage = homePage.AboutSubMenuLeadershipDown();
		Assert.assertEquals(leadershipPage.verifyLeadershipPageTitle(), pageTitles.leadershipTitle);
	}
	
	@Test
	public void AboutSubMenuNewsDownTest(){
		newsPage = homePage.AboutSubMenuNewsDown();
		Assert.assertEquals(newsPage.verifyNewsPageTitle(), pageTitles.newsTitle);
	}
	
	@Test
	public void AboutSubMenuAwardsDownTest(){
		homePage.AboutSubMenuAwardsDown();
		String verifyAwardsPageTitle = driver.getTitle();
		Assert.assertEquals(verifyAwardsPageTitle, pageTitles.awardsTitle);
	}
	
	@Test
	public void AboutSubMenuInterAdvCouncilTest(){
		Assert.assertTrue(homePage.AboutSubMenuInterAdvCouncil());
	}
	
	@Test
	public void AboutSubMenuInterAdvCouncilClickTest(){
		internAdvPage = homePage.AboutSubMenuInterAdvCouncilClick();
		Assert.assertEquals(internAdvPage.verifyInternAdvTitle(), pageTitles.InterAdvTitle);
	}
	
	@Test
	public void LearnMoreButtonTest() {
		aboutPage = homePage.LearnMoreButton();
		Assert.assertEquals(aboutPage.verifyAboutPageTitle(), pageTitles.aboutTitle);		
	}
	
	@Test
	public void PrivacyPolicyTest() {
		privacyPolicyPage = homePage.PrivacyPolicy();
		Assert.assertEquals(privacyPolicyPage.verifyPrivacyPageTitle(), pageTitles.privacyTitle);		
	}
	
	@Test
	public void TermsAndConButtonTest() {
		termsAndConPage = homePage.TermsAndConButton();
		Assert.assertEquals(termsAndConPage.verifyTermsPageTitle(), pageTitles.termsTitle);		
	}
	
	@Test
	public void OurValuesRefreshPageTest() {
		Assert.assertTrue(homePage.OurValuesRefreshPage());
	}
	
	@Test
	public void OurValuesExpandTest() {
		Assert.assertTrue(homePage.OurValuesExpand());
	}
	
	@Test
	public void WhatPeopleRefreshPageTest() {
		Assert.assertTrue(homePage.WhatPeopleRefreshPage());
	}
	
	@Test
	public void WhatPeopleClickingTest() {
		Assert.assertTrue(homePage.WhatPeopleClicking());
	}
	
	@Test
	public void AiAtTheRiseVideoTest() throws FindFailed, InterruptedException {
		Assert.assertEquals(homePage.AiAtTheRiseVideo(), "It Played");	
	}
	
	@Test
	public void ClientsPictureCompareTest() throws IOException {
		Assert.assertTrue(homePage.ClientsPictureCompare());
	}

	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}

}
