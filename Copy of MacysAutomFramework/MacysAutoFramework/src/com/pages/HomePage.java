package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	
	public HomePage(PageDriver driver)
	{
		super(driver);
		
	}
	
	public void openPage()
	{
		driver.get("http://www.macys.com/");
				
	}
     
	public int countnavItems()
	{
		driver.maximize();
		int x=0;
		
		List<WebElement> elements=driver.findelements(By.cssSelector(Locators.loc.get("Menu-Items")));
		
		if(!elements.isEmpty())
		{
		x = elements.size();
		}
		 return x;
		
		
	}
	
	public String clickSignIn()
	{
		String url = null ;
		
		driver.maximize();
		driver.findelement(By.cssSelector(Locators.loc.get("Login-Link"))).click();
		
		
		url= driver.getCurenturl();  
				
		return url;
	
	}
	
}
