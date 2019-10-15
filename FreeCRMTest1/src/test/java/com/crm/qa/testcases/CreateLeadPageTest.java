package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.q.pages.CreateLeadPage;
import com.crm.q.pages.FindLeadPage;
import com.crm.q.pages.HomePage;
import com.crm.q.pages.LoginPage;
import com.crm.qa.base.TestBase;

import com.crm.qa.util.TestUtil;


public class CreateLeadPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateLeadPage createLeadPage;
	TestUtil testUtil;
	String sheetName = "CreateLead";
	
	
	public CreateLeadPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
		
		initialization();
		testUtil = new TestUtil();
		createLeadPage = new CreateLeadPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//TestUtil.runTimeInfo("error", "login successful");
		//testUtil.switchToFrame();
		createLeadPage = homePage.clickCreateLeadLink();
		
	}

	@DataProvider(name="SIT")
	
	public  Object[][] getCRMTestData() throws IOException{
		Object[][] data = TestUtil.readExcelData(sheetName);
		return data;
	}
	

	@Test(dataProvider="SIT")
	public void validateCreateNewContact(String companyName,String firstName,String lastName,String dataSourceID){
	
		createLeadPage.createLead(companyName,firstName,lastName,dataSourceID);
		
	}

	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
}
