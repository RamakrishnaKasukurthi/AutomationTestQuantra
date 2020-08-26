package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SentimentAnalysisTradingPage;
	
	public class DashboardPageTest extends TestBase{

		LoginPage loginPage;
		HomePage homePage;
		DashboardPage dashbordPage;
		SentimentAnalysisTradingPage sentimentAnalysisTradingPage;
		
		
		public DashboardPageTest() throws IOException {
		super();	
		
		}
		@BeforeMethod
		public void setUp() throws IOException {
			initialization();
			homePage=new HomePage();
			loginPage=new LoginPage();
			dashbordPage=new DashboardPage();
			homePage.clickOnLoginButton();
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@Test(priority = 1)
		public void selectOnSentimentAnalysisTrading() throws IOException {
			
					sentimentAnalysisTradingPage=dashbordPage.selectOnSentimentAnalysisTrading();
		}
	
	  @AfterMethod
	  public void tearDown() { driver.quit(); }
	 
}