package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CartPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SentimentAnalysisTradingPage;

public class SentimentAnalysisTradingPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashbordPage;
	SentimentAnalysisTradingPage sentimentAnalysisTradingPage;
	CartPage enrollNowPage;
	
	
	public SentimentAnalysisTradingPageTest() throws IOException {
	super();	
	
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
		dashbordPage=new DashboardPage();
		sentimentAnalysisTradingPage=new SentimentAnalysisTradingPage();
		
		homePage.verifyHomePageTitle();
		homePage.clickOnLoginButton();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		dashbordPage.selectOnSentimentAnalysisTrading();
				
	}
	
	 @Test(priority = 1)
	  public void verifyCourseNameTest() { 
		  String courseName=sentimentAnalysisTradingPage.verifyCourseName();
	  Assert.assertEquals(courseName,
	  "Learning Track: Sentiment Analysis in Trading"); 
	  }
	 
	 
	 @Test(priority = 2)
	  public void verifyPriceTest() { 
		  String price=sentimentAnalysisTradingPage.verifyPrice();
	  Assert.assertEquals(price,
	  "₹35192"); 
	  }
	 
	
	@Test(priority = 3)
	public void clickOnEnrollNowtest() throws IOException, InterruptedException {
		sentimentAnalysisTradingPage.clickOnEnrollNow();
	}

  @AfterMethod public void tearDown() { driver.quit(); }
 


}
