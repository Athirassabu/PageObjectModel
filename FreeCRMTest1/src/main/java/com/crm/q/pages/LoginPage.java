package com.crm.q.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class LoginPage extends TestBase {
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="decorativeSubmit")
	WebElement loginButton;
	
	
	@FindBy(xpath="//img[contains(@src,'/opentaps_images/opentaps_logo.png')]")
	WebElement logoTest;

	@FindBy(xpath="//*[@id=\"label\"]/a")
	WebElement crmsfaLink;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateTestImage(){
		return logoTest.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		crmsfaLink.click();
		    	
		    	
		return new HomePage();
	}
	
	
	
}
