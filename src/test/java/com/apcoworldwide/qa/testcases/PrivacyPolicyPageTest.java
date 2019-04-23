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
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class PrivacyPolicyPageTest extends TestBase {

		
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

		public PrivacyPolicyPageTest() {
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
			privacyPolicyPage = homePage.PrivacyPolicy();

		}

		@Test
		public void verifyPrivacyPageTitleTest(){
		    Assert.assertEquals(privacyPolicyPage.verifyPrivacyPageTitle(), pageTitles.privacyTitle);
		}
		
		@Test
		public void verifyLogoTest(){
			Assert.assertTrue(privacyPolicyPage.verifyLogo());
		}
		
		@AfterMethod
		public void tearDown(){
			TestBase.quit();
		}

}
