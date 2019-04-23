package com.apcoworldwide.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.apcoworldwide.qa.utils.TestUtil;
import com.apcoworldwide.qa.utils.WebEventListener;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver=null;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	protected static Logger log = LogManager.getLogger((TestBase.class.getName()));
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\apcoworldwide\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(driver==null) {
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver(); 
		}		
		else if(browserName.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); 
		}
		else if(browserName.equals("explorer")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver(); 
		}
		else if(browserName.equals("headless-chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			driver = new ChromeDriver(options); 
		}
		else
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TaSoSsS\\Downloads\\chromedriver_win32\\chromedriver.exe");		
			driver = new ChromeDriver(options); 
			System.out.println("Please check again the browser name at config.properties file");
		}
		
		

		
		e_driver = new EventFiringWebDriver(driver);
		
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver; 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		
		}
		
	}
public static void quit() {
		
		System.out.println("Quitting the browser");
		driver.quit();
		driver = null;
		
	}
	
public static void close() {
		
		System.out.println("Closing the browser");
		driver.close();
		driver = null;
		
	}

}