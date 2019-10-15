package com.crm.q.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ZooplaLoginPage extends TestBase {
	
	@FindBy(id="search-input-location")
	WebElement searchName;
	
	@FindBy(id="search-submit")
	WebElement loginButton;
	
	
	
	
	
	public ZooplaLoginPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public  void login( ){
		searchName.sendKeys("London");
		
		loginButton.click();
		
		
		    	
		    	
		
	}
	
	
	
}


