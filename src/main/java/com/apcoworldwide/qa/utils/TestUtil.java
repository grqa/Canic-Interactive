package com.apcoworldwide.qa.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.apcoworldwide.qa.base.TestBase;


public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;
	static JavascriptExecutor js;
	
	public static void takeScreenshotAtEndOfTest(Throwable error) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir+"\\screenshots\\"+System.currentTimeMillis()+".png"));
	}
	
	public static void scrollPage(int i){
    	js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,"+i+")");
    }
	
	
	
	
	public static void highLightElement(WebElement element)
	{
	js=(JavascriptExecutor)driver;  
	js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
    }
	
	
	
	
    public static void scrollIntoView(WebElement element){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String getScreenshot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}

    public int LinkList() {
    	 int brokenLinks=0;
		String homePage = prop.getProperty("url");
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
		List <WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println("The page "+driver.getCurrentUrl()+" has "+(linklist.size())+" links");
		log.info("The page "+driver.getCurrentUrl()+" has "+(linklist.size())+" links");
		Iterator<WebElement> it = linklist.iterator();
		 while(it.hasNext()){
	            
	            url = it.next().getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
	            if(!url.startsWith(homePage)){
	                System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	               
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                    log.fatal(url+" is a broken link");
	                    brokenLinks++;
	                }
	                else
	                {
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
		 return brokenLinks;
		}
    
    public String PdfReader() throws IOException {
    	String currentURL=driver.getCurrentUrl();
		URL url=new URL(currentURL);
		InputStream is=url.openStream();
		BufferedInputStream fileParse= new BufferedInputStream(is);
		PDDocument document=null;
		document= PDDocument.load(fileParse);
		String pdf=new PDFTextStripper().getText(document);
		return pdf;                  
    }
    
    public static int SwitchToFrame(By by) {
		driver.switchTo().defaultContent();
        int framecount= driver.findElements(By.tagName("iframe")).size();
		int i;
		for(i=0; i<framecount; i++) 
		{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(i);
		int x = driver.findElements(by).size();
		if(x>0) {		break;
		}
		else
		{
			System.out.println("Continue Loop");	
		}
		}	
		driver.switchTo().defaultContent();
		return i;
	}

	
}
