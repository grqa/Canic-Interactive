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
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class NewsPageTest extends TestBase{
	PageTitles pageTitles;
	HomePage homePage;
	TestUtil testUtil;
	AboutPage aboutPage;
	WorkPage workPage;
	BlogPage blogPage;
	ContactPage contactPage;
	LeadershipPage leadershipPage;
	NewsPage newsPage;

	public NewsPageTest(){
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
		aboutPage = new AboutPage();
		leadershipPage = new LeadershipPage();
		newsPage = homePage.AboutSubMenuNews();

	}
	
	@Test
	public void verifyNewsPageTitleTest(){
	    Assert.assertEquals(newsPage.verifyNewsPageTitle(), pageTitles.newsTitle);
	}
	
	@Test
	public void linkListTest(){
		Assert.assertEquals(testUtil.LinkList(), 0, "Please check the link-list because we have a broken link");
	   	}
	
	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}
	
	
	
	
}