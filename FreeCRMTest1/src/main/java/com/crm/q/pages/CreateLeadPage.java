package com.crm.q.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CreateLeadPage extends TestBase{
	
	@FindBy(id="createLeadForm_companyName")
			WebElement companyName;

	@FindBy(id="createLeadForm_firstName")
	WebElement firstName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement lastName;
	

	@FindBy(id="createLeadForm_dataSourceId")
	WebElement dataSourceId;
	
	@FindBy(className="smallSubmit")
	WebElement submitButton;
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void createLead(String cName, String fName, String lName,String dataId){
	
		
		companyName.sendKeys(cName);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		Select select = new Select(driver.findElement(By.name("dataSourceId")));
		select.selectByVisibleText(dataId);
		submitButton.click();
		

		
	}


}






