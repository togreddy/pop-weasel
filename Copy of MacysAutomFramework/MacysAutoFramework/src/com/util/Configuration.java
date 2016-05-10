package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public String URL;
	public String BROWSER;
	Configuration configuraton;
	
	public void readprops()
	{
		
		Properties p= new Properties();
		
		try{
		FileReader reader = new FileReader("config.properties");   //location of properties file
		p.load(reader);
		URL = p.getProperty("url");
		BROWSER = p.getProperty("browser");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
