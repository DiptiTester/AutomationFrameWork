package org.automation.testingworld.assertation;

import org.openqa.selenium.WebDriver;

public class compare {
	// validate page URL static so anybody can call class method 
	
	public  static boolean validatePageURL(WebDriver driver , String expURL)
	{
		boolean flag = false ;      // false by default
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			flag = true;
		}
		return flag;
	}
	
	// Validate Page Title
	
	public static boolean validatePageTitle(WebDriver driver , String expTitle)
	{
		boolean flag = false ;      // false by default
		if(driver.getCurrentUrl().equalsIgnoreCase(expTitle))
		{
			flag = true;
		}
		return flag;
	}
}
