package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.util.PageDriver;

public class HomePageTest extends BaseTest{
	
	HomePage hp;    //reference variable
	PageDriver driver;
	

	
	@BeforeClass     //annotation ,before the execution of any other method within the class will be executed only once 
	public void initialize()
	{
		hp= new HomePage(driver);
		
	}
	
	@Test
	public void testcountnavItems()
	{
		int actual= hp.countnavItems();
		assertEquals(13,actual);
		
	}
	@Test
	public void testclickSignIn()
	{
		String actual= hp.clickSignIn();
		assertEquals("http://www.macys.com/index.ognc?from=signout&FromSignin=true",actual);
	}
	

}
