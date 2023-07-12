package org.automation.testing.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	
	public static Object fetchProprtyValue(String key) throws IOException       // collect data in form of key
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);                                         // input in form of key and return in form of object
		
	}
	
	public static  String fetchLocatorValue(String key) throws IOException     //so typecast in String
	{
		FileInputStream file = new FileInputStream("./Config/Elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();                            //all this locator is accepting value in String formate and returning in to the string as well 
		
	}

	

}
