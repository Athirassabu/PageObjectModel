package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.q.pages.HomePage;
import com.crm.q.pages.LoginPage;
import com.crm.q.pages.SaintGobainHomePage;
import com.crm.q.pages.SaintGobainPage;
import com.crm.qa.base.TestBase;

public class SaintGobain extends TestBase {
	
	SaintGobainPage gobainPage;
	SaintGobainHomePage gobainhomePage;
	public SaintGobain()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
	
		initialization();
		gobainPage=new SaintGobainPage();
	}
	
	
	@Test
	public void loginTest(){
		gobainhomePage = gobainPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
}

