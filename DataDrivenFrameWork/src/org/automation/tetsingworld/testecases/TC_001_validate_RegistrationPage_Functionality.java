package org.automation.tetsingworld.testecases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.pages.RegistrationPage;
import org.automation.testngworld.base.CreateDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


  public class TC_001_validate_RegistrationPage_Functionality extends CreateDriverInstance{

	
	@Test(dataProvider = "Static")
	
	
   public void tc_001_validate_Registration_page_Functionality(String username,String mail,String pass  ,String Repass) throws Exception
	{
	   
		RegistrationPage Reg = new RegistrationPage(driver);
		Reg.enteryourname(username);
		Reg.enteremailadress(mail);
		Reg.enterpassword(pass);
		Reg.reenterpassword(Repass);
		Reg.clickverifyme();
		
	}
	@DataProvider(name="Static")
			public Object[ ][ ] testDataGenerator() throws IOException 
			{
		FileInputStream file = new FileInputStream("./TestData/register.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet RegisterSheet  = workbook.getSheet("Sheet1");
		int numberOfData = RegisterSheet.getPhysicalNumberOfRows();
		Object [ ][  ] testData = new Object[numberOfData][4];
		
		for(int i = 0 ;i<numberOfData ;i++)
		{
			XSSFRow row = RegisterSheet.getRow(i);
			XSSFCell username =row.getCell(0);
			XSSFCell mail    =          row.getCell(1);
			XSSFCell pass   =           row.getCell(2);
			XSSFCell Repass =      row.getCell(3);
			testData [i] [0] = username .getStringCellValue();
			testData [i] [1] = mail.getStringCellValue();
			testData [i] [2] = pass.getStringCellValue();
		    testData [i] [3] = Repass.getStringCellValue();
		}
		return testData;
			}
}
