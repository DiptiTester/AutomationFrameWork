package org.automation.testngworld.base;

import java.io.IOException;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriverInstance {
	public WebDriver driver;
	
	@BeforeMethod
	
	
	public void intiateDriverInstance() throws IOException
	{
		
		 
		if(Utility.fetchProprtyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
	      options .addArguments("--remote-allow-origins=*");
	       driver = new ChromeDriver(options);
		}
		else if(Utility.fetchProprtyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			 driver = new FirefoxDriver();
			}	
		else if(Utility.fetchProprtyValue("browserName").toString().equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver = new InternetExplorerDriver();
			}
		else
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get(Utility.fetchProprtyValue("URL").toString());
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).perform();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/div/a")).click();
	    }
	@AfterMethod
	public void closeDriverInstance()
	{
	driver.quit();	
	}

}
