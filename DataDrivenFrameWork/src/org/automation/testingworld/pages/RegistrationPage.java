package org.automation.testingworld.pages;
import java.io.IOException;
import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RegistrationPage {                   // Login Page Object created
	WebDriver driver;                            //declair webdriver object 
public RegistrationPage(WebDriver driver)    //create constructor
	{    
		this.driver = driver ;                   // Transferring local value to global value
	}
	public void enteryourname(String uname) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Enter_yourName_xpath"))).sendKeys(uname);
	}
	
	public void enteremailadress(String email) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Enter_EmailAdresss_xpath"))).sendKeys(email);
	}
	public void enterpassword(String password) throws IOException
	{
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Enter_Password_xpath"))).sendKeys(password);
	}

	public void reenterpassword(String ReEnterpassword) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Enter_ReEnterPassword_xpath"))).sendKeys(ReEnterpassword);	
	}
	
	public void clickverifyme() throws IOException
	{
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Enter_ClickVerifyMe_xpath"))).click();
	}
}
