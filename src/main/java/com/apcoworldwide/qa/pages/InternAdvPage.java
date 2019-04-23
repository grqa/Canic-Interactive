package com.apcoworldwide.qa.pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apcoworldwide.qa.base.TestBase;
import com.apcoworldwide.qa.utils.TestUtil;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class InternAdvPage extends TestBase{
	
	@FindBy(xpath="//div[@class='breadcrumbs']")
	WebElement Breadcrumbs;
	
	@FindBy(xpath="//a[@title='Go to People.']")
	WebElement PeopleBreadcrumb;
	
	@FindBy(xpath="//a[text()='Full IAC']")
	WebElement FullIACButton;
	
	@FindBy(xpath="//a[contains(@href,'eduardo-aguirre')]")
	WebElement EduardoAguirre;
	
	public InternAdvPage() {
		PageFactory.initElements(driver, this);
	}	
	
	public String verifyInternAdvTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		HomePage homepage= new HomePage();
		return homepage.LogoAtScroll.isDisplayed();
		}
	
	public boolean verifyBreadcrumbs() {
		return Breadcrumbs.isDisplayed();
	}
	
	public PeoplePage peopleBreadcrumbClick() {
		PeopleBreadcrumb.click();
		return new PeoplePage();
	}
	
	public boolean verifyFullIAC() {
		return FullIACButton.isEnabled();
	}
	
	public boolean VerifyHoverState() throws IOException{
		
		TestUtil.scrollIntoView(EduardoAguirre);
		
		Screenshot logoimage=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,EduardoAguirre);
		BufferedImage getimg = logoimage.getImage();
		File file=new File(System.getProperty("user.dir")+"\\sikuliphotos\\EduardoAguirre.png" );
		ImageIO.write(getimg, "PNG", file);
		
		//////////////////////////////////////////////////////////
		//Moving mouse on element 
		Actions a = new Actions(driver);
		a.moveToElement(EduardoAguirre).build().perform();	
		//////////////////////////////////////////////////////////
		
		BufferedImage expectedphoto = ImageIO.read(file);
		Screenshot afterHoverImage=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,EduardoAguirre);
		BufferedImage actualimg = afterHoverImage.getImage();
		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedphoto, actualimg);
		if(diff.hasDiff()==true) {
			log.info("After hovering on people info the photo appears");
			return true;
		}
		else {
			log.error("After hovering on people info nothing happens");
			return false;
		}


		
	}

}
