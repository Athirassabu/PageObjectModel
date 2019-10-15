package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.q.pages.HomePage;
import com.crm.q.pages.LoginPage;
import com.crm.q.pages.SaintGobainHomePage;
import com.crm.q.pages.SaintGobainPage;
import com.crm.q.pages.ZooplaLoginPage;
import com.crm.qa.base.TestBase;

public class ZooplaLoginTest extends TestBase {
	
	ZooplaLoginPage zooplaLoginPage;
	SaintGobainHomePage gobainhomePage;
	public ZooplaLoginTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
	
		initialization();
		zooplaLoginPage=new ZooplaLoginPage();
	}
	
	
	@Test
	public void loginTest(){
		zooplaLoginPage.login();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
}

