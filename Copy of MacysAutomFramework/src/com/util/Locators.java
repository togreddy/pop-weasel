package com.util;
import java.util.Enumeration;
import java.util.HashMap;
import java.io.FileReader;
import java.util.Properties;



public class Locators {
	
	
	public static HashMap<String,String> loc = new HashMap();
	
	public static void getelements()
	{
		
		Properties p= new Properties();
		
		try{
		FileReader reader = new FileReader("locators.properties");   //location of locators file
		p.load(reader);
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements())
				{
			     String key = (String) e.nextElement();
			     loc.put(key,p.getProperty(key));
				}
		
		
		}
		    catch(Exception e)
		    {
			e.printStackTrace();
		    } 
		}
		
	

}
