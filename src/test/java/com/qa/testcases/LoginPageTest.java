package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;

	
	public class LoginPageTest extends TestBase{

		LoginPage loginPage;
		HomePage homePage;
		
		DashboardPage dashbordPage;
		
		public LoginPageTest() throws IOException {
		super();	
		
		}
		@BeforeMethod
		public void setUp() throws IOException {
			initialization();
			homePage=new HomePage();
			loginPage=new LoginPage();
			homePage.clickOnLoginButton();
			
			
		}
		
		@Test(priority = 1)
		public void loginTest() throws IOException {
		
			dashbordPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
		}
	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 
}
