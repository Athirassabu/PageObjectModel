package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.q.pages.CreateLeadPage;
import com.crm.q.pages.FindLeadPage;
import com.crm.q.pages.HomePage;
import com.crm.q.pages.LoginPage;
import com.crm.qa.base.TestBase;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateLeadPage createLeadPage;
	FindLeadPage findLeadPage;
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
	
		initialization();
		loginPage=new LoginPage();
		 createLeadPage=new CreateLeadPage();
		  findLeadPage=new FindLeadPage();
		 
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void homePageTitleTest(){
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "My Home | opentaps CRM");
	}
	
	@Test
	public void verifyCreateLeadLink(){
		createLeadPage=homePage.clickCreateLeadLink();
		
	}
		
	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
}
