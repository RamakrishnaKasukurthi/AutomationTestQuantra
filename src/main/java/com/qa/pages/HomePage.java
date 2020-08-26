package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	/*
	 * @FindBy(xpath = "//span[@class='user-display']") WebElement user_display;
	 * 
	 * @FindBy(xpath = "//div[@class='header item']") WebElement log_CRM;
	 * 
	 * @FindBy(xpath = "//span[contains(text(),'Contacts')]") WebElement
	 * contacts_link;
	 */
	  @FindBy(xpath = "//*[contains(text(), 'Login')]") WebElement login_Button;
	 
	
	public HomePage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);

	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage clickOnLoginButton() throws IOException {
		login_Button.click();
		return new LoginPage();
		

		
	}
	

}
