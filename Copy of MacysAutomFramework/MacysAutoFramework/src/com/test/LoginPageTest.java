package com.test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.DataProvider;
import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;


@Test
public class LoginPageTest extends BaseTest{
	
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void initialize()
	{
		hp= new HomePage(driver);
		hp.clickSignIn();
		lp= new LoginPage(driver);
	}
		
	@DataProvider(name="user-data")
	public static Object[][] getUserData()
	{
		Object[][] data = {{"Anitha","Anitha"},{"Reddy","Reddy"}};
		return data;
	}
	
	public void testinvalidLogin(String email,String password)
	{
		String actString = lp.invalidLogin(email,password);
		AssertJUnit.assertEquals("Your Email Address must be entered in this format: jane@company.com. Please try again.",actString);
	}
	

}
