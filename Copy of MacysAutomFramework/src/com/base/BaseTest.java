package com.base;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;



public abstract class BaseTest{
	
	
	
	public static final Configuration _config;
	
	
	static        //Static block is first block which will execute before any block 
	{
	_config = new Configuration();
	}
	
	public PageDriver driver;
		
	
	@BeforeSuite
	public void setUp()
	{
			driver= new PageDriver(_config);
			Locators.getelements();
			
	}
	@AfterSuite
	public void quit()
	{
		driver.quit();
	}
		
	
}
