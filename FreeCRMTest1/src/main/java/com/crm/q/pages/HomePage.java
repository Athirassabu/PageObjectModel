package com.crm.q.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Create Lead")
	WebElement clickCreateLead;

	@FindBy(linkText="Find Leads")
	WebElement findLeads;

	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateHomePageTitle(){
		return driver.getTitle();
	}

	
	public CreateLeadPage clickCreateLeadLink(){
		
		clickCreateLead.click();
		    	return new CreateLeadPage();	
	}	
}

