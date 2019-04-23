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
import com.apcoworldwide.qa.pages.WorkPage;
import com.apcoworldwide.qa.utils.PageTitles;
import com.apcoworldwide.qa.utils.TestUtil;

public class BlogPageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	AboutPage aboutPage;
	WorkPage workPage;
	BlogPage blogPage;
	ContactPage contactPage;
	PageTitles pageTitles;

	public BlogPageTest(){
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
		blogPage = homePage.ClickOnBlogTop();
		contactPage = new ContactPage();
		aboutPage = new AboutPage();

	}
	
	@Test
	public void verifyBlogPageTitleTest(){
	    Assert.assertEquals(blogPage.verifyBlogPageTitle(), pageTitles.blogTitle);
	}
	
	@Test
	public void linkListTest(){
		Assert.assertEquals(testUtil.LinkList(), 0, "Please check the link-list because we have a broken link");
	   	}
	
	@Test
	public void verifyLogoTest() {
		Assert.assertTrue(blogPage.verifyLogoAtTop());
	}
	
	
	@AfterMethod
	public void tearDown(){
		TestBase.quit();
	}
	
	
	
	
}
