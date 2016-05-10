package com.base;

import com.util.PageDriver;

public abstract class BasePage {
	
	public PageDriver driver;
	/* My test */
	public BasePage(PageDriver driver)   //Dependency Injection
	{
		
		this.driver= driver;
		
	}

	
	
    
	
	
}
