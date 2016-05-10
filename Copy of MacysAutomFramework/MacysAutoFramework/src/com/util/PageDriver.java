package com.util;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class PageDriver {
	
	//private static final TimeUnit SECONDS = null;
	
	WebDriver driver;

	Configuration configuration;
	
	
	public PageDriver(Configuration config)
	{
		this.configuration = config;
		
		initializeBrowser();
		//this.driver= new FirefoxDriver();
		
		driver.get(configuration.URL);
		//driver.manage().timeouts().setScriptTimeout(100,SECONDS);;
	}
	
	public void initializeBrowser()
	{
		String browser = configuration.BROWSER;
		switch (browser)
		{
		case "firefox":
		     startFirefox();
		     break;
		case "chrome":
		     startChrome();
		     break;
		case "ie":
		     startIE();
		     break;
		default :
			startHTML();
			break;
			
		}
		driver.get(configuration.URL);
	}
	
	public void startFirefox()
	{
		this.driver = new FirefoxDriver();
				
	}
	public void startChrome()
	{
	System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	this.driver = new ChromeDriver();
	
	}
	public void startIE()
	{
		System.setProperty("webdriver.ie.driver","lib/IEDriverServer.exe");
		this.driver = new InternetExplorerDriver();
	}
	
	public void startHTML()
	{
		this.driver = new HtmlUnitDriver();
	}
	
	
	public String get(String url)
	{
	return url;
	}
	
	public WebElement findelement(By by)
	
	{
		return driver.findElement(by);
	}
	
public List<WebElement> findelements(By by)
	
	{
		return driver.findElements(by);
	}

	public String getCurenturl()
	{
		return driver.getCurrentUrl();
		
	}
	
	public void quit()
	{
		//driver.quit();
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();
	}

}
	
	


