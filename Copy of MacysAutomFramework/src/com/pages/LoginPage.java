package com.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class LoginPage extends BasePage {
	
	
	public LoginPage(PageDriver driver)
	{
	super(driver);
	
	}
	
	public String invalidLogin(String email,String password)
	{
		String error = null;
			
		driver.findelement(By.cssSelector(Locators.loc.get("Login-Username"))).sendKeys(email);
		driver.findelement(By.cssSelector(Locators.loc.get("Login-Password"))).sendKeys(password);
		
		driver.findelement(By.cssSelector(Locators.loc.get("Sign-In-Button"))).click();
		error= driver.findelement(By.cssSelector(Locators.loc.get("Sign-In-Error"))).getText();
		
		return error;
	}
	

}
