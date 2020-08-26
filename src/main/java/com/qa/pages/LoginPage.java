package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;



	public class LoginPage extends TestBase{
		
		//Page factory 
		@FindBy(name = "email")
		WebElement username;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(xpath = "//button[@class='btn btn-plain-border width-70 margin-bottom-20 btn-new-theme']")
		WebElement loginBtn;

		//Initializing the page objects 
		public LoginPage() throws IOException {
			
			PageFactory.initElements(driver, this);
			
		}
				
	
		public DashboardPage login(String un, String pwd) throws IOException {
			
			username.sendKeys(un);
			password.sendKeys(pwd);
			
			loginBtn.click();
			
			return new DashboardPage();
			
		}
	
}
