package com.apcoworldwide.qa.pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.apcoworldwide.qa.base.TestBase;
import com.apcoworldwide.qa.utils.TestUtil;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@class='site-branding']/a/img[1]")
	WebElement LogoAtTop;

	@FindBy(xpath = "//div[@class='site-branding']/a/img[2]")
	WebElement LogoAtScroll;

	@FindBy(xpath = "//*[@class='search-trigger']")
	WebElement SearchButton;

	@FindBy(xpath = "//input[@class='search-field']")
	WebElement SearchField;

	@FindBy(xpath = "//*[contains(@class,'search-overlay')]//*[@class='search-submit']")
	WebElement SearchSubmit;

	@FindBy(xpath = "//*[@class='page-title']")
	WebElement SearchResults;

	@FindBy(xpath = "//span[@class='close-search']")
	WebElement SearchClose;

	@FindBy(id = "menu-item-63")
	WebElement About;

	@FindBy(xpath = "//*[@id='menu-item-63']/ul[@class='sub-menu']")
	WebElement SubMenu;

	@FindBy(id = "menu-item-3167")
	WebElement Locations;

	@FindBy(id = "menu-item-122")
	WebElement Careers;

	@FindBy(id = "menu-item-4749")
	WebElement Leadership;

	@FindBy(id = "menu-item-4779")
	WebElement InterAdvisory;

	@FindBy(id = "menu-item-121")
	WebElement News;

	@FindBy(id = "menu-item-123")
	WebElement Awards;

	@FindBy(id = "menu-item-67")
	WebElement Work;

	@FindBy(id = "menu-item-64")
	WebElement Blog;

	@FindBy(id = "menu-item-65")
	WebElement Contact;

	@FindBy(xpath = "//a[contains(@class,'hero-btn')]")
	WebElement LearnMoreButton;

	@FindBy(xpath = "//*[@id='menu-item-92']/a")
	WebElement About_down;

	@FindBy(id = "menu-item-3168")
	WebElement Locations_down;

	@FindBy(id = "menu-item-97")
	WebElement Careers_down;

	@FindBy(id = "menu-item-4751")
	WebElement Leadership_down;

	@FindBy(xpath = "//*[@id='menu-item-102']/a")
	WebElement News_down;

	@FindBy(id = "menu-item-96")
	WebElement Awards_down;

	@FindBy(xpath = "//*[@id='menu-item-95']/a")
	WebElement Work_down;

	@FindBy(xpath = "//*[@id='menu-item-93']/a")
	WebElement Blog_down;

	@FindBy(xpath = "//*[@id='menu-item-94']/a")
	WebElement Contact_down;

	@FindBy(id = "menu-item-108")
	WebElement Privacy_Policy;

	@FindBy(id = "menu-item-109")
	WebElement TermsNcon;

	@FindBy(xpath = "//a[contains(text(),'View all careers')]")
	WebElement ViewCareersButton;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div/a")
	WebElement ClientMars;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[2]/a")
	WebElement ClientDanfoss;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[3]/a")
	WebElement ClientRockfeller;

	@FindBy(xpath = "//div[@class='clients-content']/div[1]/div[4]/a")
	WebElement ClientVantageScore;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	WebElement ClientIkea;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	WebElement ClientEbay;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	WebElement ClientMasdar;

	@FindBy(xpath = "//div[@class='clients-content']/div[2]/div[4]/a")
	WebElement ClientBetterMedicare;

	@FindAll({ @FindBy(xpath = "//*[@id='our-values']/div[2]/div") })
	List<WebElement> OurValues;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[1]")
	WebElement Boldness;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[1]/div[2]/p[2]")
	WebElement Boldness_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[2]")
	WebElement Curiosity;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[2]/div[2]/p[2]")
	WebElement Curiosity_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[3]")
	WebElement Inclusivity;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[3]/div[2]/p[2]")
	WebElement Inclusivity_text;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[4]")
	WebElement Empathy;

	@FindBy(xpath = "//*[@id='our-values']/div[2]/div[4]/div[2]/p[2]")
	WebElement Empathy_text;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[1]")
	WebElement CnCBullet1;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[2]")
	WebElement CnCBullet2;

	@FindBy(xpath = "//*[@class='curios-and-connected']/div/div[2]/div/span[3]")
	WebElement CnCBullet3;

	@FindBy(xpath = "//a[contains(@href,'presence-to-milan')][@class='read-more']")
	WebElement CnCApcoWorldwideReadMore;

	@FindBy(xpath = "//div[@id='apco-twitter-1']/following-sibling::a")
	WebElement CnCTwitter1;

	@FindBy(xpath = "//div[@id='apco-twitter-2']/following-sibling::a")
	WebElement CnCTwitter2;

	@FindBy(xpath = "//div[@id='apco-twitter-3']/following-sibling::a")
	WebElement CnCTwitter3;

	@FindBy(xpath = "//div[@id='apco-twitter-4']/following-sibling::a")
	WebElement CnCTwitter4;

	@FindBy(xpath = "//div[contains(@style,'Imad-AI')]")
	WebElement PlayVideo1;

	@FindBy(xpath = "//span[@class='close-video']")
	WebElement CloseVideo;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'masdar')]")
	WebElement CnCMasdar;

	@FindBy(xpath = "//a[contains(@href,'Bv__q2wHbk1')]")
	WebElement CnCInstagram1;

	@FindBy(xpath = "//div[@class='swiper-button-next-curios']")
	WebElement CnCNext;

	@FindBy(xpath = "//div[@class='swiper-button-prev-curios']")
	WebElement CnCPrev;

	@FindBy(xpath = "//a[contains(@href,'advice-report')][@class='read-more']")
	WebElement CnCWorkingForBalance;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'ups-foundation')]")
	WebElement CnCUpsFoundation;

	@FindBy(xpath = "//div[contains(@style,'mela')]")
	WebElement PlayVideo2;

	@FindBy(xpath = "//a[contains(@href,'BuxInvinhe')]")
	WebElement CnCInstagram2;

	@FindBy(xpath = "//a[contains(@href,'podcast')][@class='read-more']")
	WebElement CnCPodcast;

	@FindBy(xpath = "//div[@class='case-study-info']/a[contains(@href,'ukrainian-ministry-of-finance')]")
	WebElement CnCMinFinance;

	@FindBy(xpath = "//div[contains(@style,'Carmichael')]")
	WebElement PlayVideo3;

	@FindBy(xpath = "//a[contains(@href,'BurKboBHSib')]")
	WebElement CnCInstagram3;

	@FindBy(xpath = "//div[contains(@style,'greg-annis')]")
	WebElement WPAS_Greg1;

	@FindBy(xpath = "//a[text()='Greg Annis']")
	WebElement WPAS_Greg2;

	@FindBy(xpath = "//div[contains(@style,'MK-EW-Saying')]")
	WebElement WPAS_WomenMagazine;

	@FindBy(xpath = "//a[text()='Enterprising Women Magazine']")
	WebElement WPAS_WomenMagazine2;

	@FindBy(xpath = "//div[contains(@style,'ny-buildings')]")
	WebElement WPAS_NewYorkObserver;

	@FindBy(xpath = "//a[text()='New York Observer']")
	WebElement WPAS_NewYorkObserver2;

	@FindBy(xpath = "//div[contains(@style,'noam-ivri')]")
	WebElement WPAS_Noam;

	String WPAS_NoamString = "[contains(@style,'noam-ivri')]";

	@FindBy(xpath = "//a[text()='Noam Ivri']")
	WebElement WPAS_Noam2;

	@FindBy(xpath = "//*[@id='what-people-saying']/div[3]/div[2]/span[1]")
	WebElement WPAS_Bullet1;

	@FindBy(xpath = "//*[@id='what-people-saying']/div[3]/div[2]/span[2]")
	WebElement WPAS_Bullet2;

	@FindBy(xpath = "//div[contains(@style,'pavolova')]")
	WebElement WPAS_pavlova;

	@FindBy(xpath = "//a[text()='Irina Pavlova']")
	WebElement WPAS_pavlova2;

	@FindBy(xpath = "//div[contains(@style,'skye-matt')]")
	WebElement WPAS_PRNews;

	@FindBy(xpath = "//a[text()='PR News']")
	WebElement WPAS_PRNews2;

	@FindBy(xpath = "//div[contains(@style,'talwalker')]")
	WebElement WPAS_talwalker;

	@FindBy(xpath = "//div[contains(@style,'sandra-diversity')]")
	WebElement WPAS_Sandra;

	String WPAS_SandraString = "[contains(@style,'sandra-diversity')]";

	@FindBy(xpath = "//a[text()='Sandra Taylor']")
	WebElement WPAS_Sandra2;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[1]/div/a")
	WebElement Job1;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[2]/div/a")
	WebElement Job2;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[3]/div/a")
	WebElement Job3;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[4]/div/a")
	WebElement Job4;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[5]/div/a")
	WebElement Job5;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[6]/div/a")
	WebElement Job6;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[7]/div/a")
	WebElement Job7;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[8]/div/a")
	WebElement Job8;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[9]/div/a")
	WebElement Job9;

	@FindBy(xpath = "//*[contains(@class,'jobs')]/div[1]/div[10]/div/a")
	WebElement Job10;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[1]")
	WebElement Job_Bullet1;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[2]")
	WebElement Job_Bullet2;

	@FindBy(xpath = "//*[@id='job-fair']/div/div[2]//div[2]/span[3]")
	WebElement Job_Bullet3;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogoAtTop() {
		return LogoAtTop.isDisplayed();
	}

	public boolean verifyLogoScroll() {
		TestUtil.scrollPage(500);
		TestUtil.scrollPage(250);
		return LogoAtScroll.isDisplayed();
	}

	public boolean verifyTopLogoAtScroll() {
		TestUtil.scrollPage(800);
		TestUtil.scrollPage(700);
		return LogoAtTop.isDisplayed();
	}

	public boolean verifyLogoScrollAtTop() {
		return LogoAtScroll.isDisplayed();
	}

	public AboutPage ClickOnAboutTop() {
		About.click();
		return new AboutPage();
	}

	public WorkPage ClickOnWorkTop() {
		Work.click();
		return new WorkPage();
	}

	public BlogPage ClickOnBlogTop() {
		Blog.click();
		return new BlogPage();
	}

	public ContactPage ClickOnContactTop() {
		Contact.click();
		return new ContactPage();
	}

	public AboutPage ClickOnAboutDown() {
		About_down.click();
		return new AboutPage();
	}

	public WorkPage ClickOnWorkDown() {
		Work_down.click();
		return new WorkPage();
	}

	public BlogPage ClickOnBlogDown() {
		Blog_down.click();
		return new BlogPage();
	}

	public ContactPage ClickOnContactDown() {
		Contact_down.click();
		return new ContactPage();
	}

	public boolean SearchWindow() {
		SearchButton.click();
		return SearchField.isDisplayed();
	}

	public String SearchTyping() {
		SearchWindow();
		SearchField.clear();
		SearchField.sendKeys(prop.getProperty("searchText"));
		SearchSubmit.click();
		return SearchResults.getText();
	}

	public boolean SearchWindowClose() {
		SearchWindow();
		SearchClose.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SearchField.isDisplayed();
	}

	public boolean AboutSubMenu() {
		Actions a = new Actions(driver);
		a.moveToElement(About).build().perform();
		return SubMenu.isDisplayed();
	}

	public ContactPage AboutSubMenuLocations() {
		AboutSubMenu();
		Locations.click();
		return new ContactPage();
	}

	public void AboutSubMenuCareers() {
		AboutSubMenu();
		Careers.click();
		// return new CareersPage();
	}

	public LeadershipPage AboutSubMenuLeadership() {
		AboutSubMenu();
		Leadership.click();
		return new LeadershipPage();
	}

	public NewsPage AboutSubMenuNews() {
		AboutSubMenu();
		News.click();
		return new NewsPage();
	}

	public void AboutSubMenuAwards() {
		AboutSubMenu();
		Awards.click();
		// return new AwardsPage();
	}

	public ContactPage AboutSubMenuLocationsDown() {
		Locations_down.click();
		return new ContactPage();
	}

	public void AboutSubMenuCareersDown() {
		Careers_down.click();
		// return new CareersPage();
	}

	public LeadershipPage AboutSubMenuLeadershipDown() {
		Leadership_down.click();
		return new LeadershipPage();
	}

	public NewsPage AboutSubMenuNewsDown() {
		News_down.click();
		return new NewsPage();
	}

	public void AboutSubMenuAwardsDown() {
		Awards_down.click();
		// return new AwardsPage();
	}

	public boolean AboutSubMenuInterAdvCouncil() {
		AboutSubMenu();
		Actions a = new Actions(driver);
		a.moveToElement(Leadership).build().perform();
		return InterAdvisory.isDisplayed();
	}

	public InternAdvPage AboutSubMenuInterAdvCouncilClick() {
		AboutSubMenuInterAdvCouncil();
		InterAdvisory.click();
		return new InternAdvPage();
	}

	public AboutPage LearnMoreButton() {
		LearnMoreButton.click();
		return new AboutPage();
	}

	public PrivacyPolicyPage PrivacyPolicy() {
		Privacy_Policy.click();
		return new PrivacyPolicyPage();
	}

	public TermsAndConPage TermsAndConButton() {
		TermsNcon.click();
		return new TermsAndConPage();
	}

	public boolean OurValuesRefreshPage() {
		TestUtil.scrollIntoView(OurValues.get(1));
		String ActiveWindowBeforeRefresh = null;
		String ActiveWindowAfterRefresh = null;
		int NumberOfValueWindows = OurValues.size();
		for (int i = 0; i < NumberOfValueWindows; i++) {
			String ClassName = OurValues.get(i).getAttribute("class");
			if (ClassName.contentEquals("our-value active-value")) {
				ActiveWindowBeforeRefresh = OurValues.get(i).getText();
				break;
			}

		}
		driver.navigate().refresh();
		for (int i = 0; i < NumberOfValueWindows; i++) {
			String ClassName = OurValues.get(i).getAttribute("class");
			if (ClassName.contentEquals("our-value active-value")) {
				ActiveWindowAfterRefresh = OurValues.get(i).getText();
				break;
			}

		}

		if (ActiveWindowBeforeRefresh.equals(ActiveWindowAfterRefresh)) {
			log.error("On each refresh the default expanded box at 'Driven by our values' is the same");
			return false;
		} else {
			log.info("On each refresh the default expanded box at 'Driven by our values' is changing");
			return true;
		}

	}

	public boolean OurValuesExpand() {
		int ActivatingTheWindows = 0;
		int NumberOfValueWindows = OurValues.size();
		int x = 1;
		for (int i = 0; i < NumberOfValueWindows; i++) {
			OurValues.get(i).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String BoxExpand = driver.findElement(By.xpath("//*[@id='our-values']/div[2]/div[" + x + "]/div[2]/p[2]"))
					.getAttribute("style");
			x++;
			if (BoxExpand.contains("display: block;")) {
				String ActiveWindow = OurValues.get(i).getText();
				log.info("The box with the text " + ActiveWindow + " opened");
				ActivatingTheWindows++;
			}

		}
		if (NumberOfValueWindows == ActivatingTheWindows) {
			log.info("All the boxes at 'Driven by our values' expand slightly when you click on them");
			return true;
		} else {
			log.error("The boxes at 'Driven by our values' are not expanding when you click on them");
			return false;
		}

	}

	public boolean WhatPeopleRefreshPage() {
		String xpath = "//*[contains(@class,'people-saying')]/div/div";
		TestUtil.scrollIntoView(driver.findElement(By.xpath(xpath)));
		String ActiveBoxText1 = null;
		String ActiveBoxText2 = null;
		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		} else if (WPAS_Bullet2.isEnabled() == true) {
			String slideXpath = xpath + "[4]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText1 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		}
		driver.navigate().refresh();

		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		} else if (WPAS_Bullet2.isEnabled() == true) {
			String slideXpath = xpath + "[4]/div/div";
			int NumberOfBoxes = driver.findElements(By.xpath(slideXpath)).size();
			List<WebElement> ListOfBoxes = driver.findElements(By.xpath(slideXpath));
			for (int i = 0; i < NumberOfBoxes; i++) {
				boolean ActiveBox = ListOfBoxes.get(i).isEnabled();
				if (ActiveBox == true) {
					if (ListOfBoxes.get(i).isDisplayed() == true) {
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					} else {
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOf(ListOfBoxes.get(i)));
						ListOfBoxes.get(i).click();
						ActiveBoxText2 = ListOfBoxes.get(i).getText();
						break;
					}
				}
			}
		}
		if (ActiveBoxText1.contentEquals(ActiveBoxText2)) {
			log.error("The default expanded box at 'What People are saying' is the same all the time");
			return false;
		} else {
			log.info("The default expanded box at 'What People are saying' is changing automatically");
			return true;
		}

	}

	public boolean WhatPeopleClicking() {
		String xpath = "//*[contains(@class,'people-saying')]/div/div";
		if (WPAS_Bullet1.isEnabled() == true) {
			String slideXpath = xpath + "[3]/div/div";
			WebElement Noam = driver.findElement(By.xpath(slideXpath + WPAS_NoamString));
			Noam.click();
			boolean activating = Noam.isEnabled();
			if (activating == true) {
				log.info("The boxes at 'What People are saying' getting expanded by clicking on them");
				return true;
			} else {
				log.error("The boxes at 'What People are saying' aren't getting expanded by clicking on them");
				return false;
			}

		} else if (WPAS_Bullet2.isEnabled() == false) {
			String slideXpath = xpath + "[4]/div/div";
			WebElement Sandra = driver.findElement(By.xpath(slideXpath + WPAS_SandraString));
			Sandra.click();
			boolean activating = Sandra.isEnabled();
			if (activating == true) {
				log.info("The boxes at 'What People are saying' getting expanded by clicking on them");
				return true;
			} else {
				log.error("The boxes at 'What People are saying' aren't getting expanded by clicking on them");
				return false;
			}
		} else {
			log.fatal("The elements are not visible");
			return false;
		}
	}

	public String AiAtTheRiseVideo() throws FindFailed, InterruptedException {
		PlayVideo1.click();
		Screen s = new Screen();
		Pattern playImg = new Pattern(System.getProperty("user.dir") + "\\sikuliphotos\\playYouTube.JPG");
		s.wait(playImg, 2000);
		s.click();
		Thread.sleep(3000);
		if (s.exists(System.getProperty("user.dir") + "\\sikuliphotos\\redLineOfPlayed.JPG") != null) {
			Pattern mouseMoveImg = new Pattern(System.getProperty("user.dir") + "\\sikuliphotos\\mouseMoveYouTube.JPG");
			s.wait(mouseMoveImg, 2000);
			s.mouseMove();
			Pattern pauseImg = new Pattern(System.getProperty("user.dir") + "\\sikuliphotos\\pauseYouTube.JPG");
			s.wait(pauseImg, 2000);
			s.click();
			CloseVideo.click();
			log.info("The AI AND THE RISE OF A NEW GENERATION video working fine");
			return "It Played";
		} else {
			log.error("The AI AND THE RISE OF A NEW GENERATION video isn't working");
			return "The video didn't work";
		}
	}

	public boolean ClientsPictureCompare() throws IOException {
		TestUtil.scrollIntoView(ClientDanfoss);
		File file = new File(System.getProperty("user.dir") + "\\sikuliphotos\\clients.png");
		BufferedImage expectedphoto = ImageIO.read(file);
		Screenshot logoimage = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,
				ClientDanfoss);
		BufferedImage actualimg = logoimage.getImage();
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedphoto, actualimg);
		if (diff.hasDiff() == true) {
			log.error("The logos of clients are incorrect");
			return false;
		} else {
			log.info("The logos of clients are correct");
			return true;
		}
	}

}
