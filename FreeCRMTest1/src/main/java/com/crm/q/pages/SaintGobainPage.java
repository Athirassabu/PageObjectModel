package com.crm.q.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SaintGobainPage extends TestBase {
	
	@FindBy(id="txtUserId")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnSubmit")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/nav/ul[2]/li[3]/a/input")
	WebElement goButton;
	
	
	
	public SaintGobainPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public SaintGobainHomePage login(String un, String pwd){
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		goButton.click();
		
		    	
		    	
		return new SaintGobainHomePage();
	}
	
	
	
}


