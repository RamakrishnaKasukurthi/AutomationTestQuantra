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

public class CartPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashbordPage;
	SentimentAnalysisTradingPage sentimentAnalysisTradingPage;
	CartPage cartPage;
	
	
	public CartPageTest() throws IOException {
	super();	
	
	}
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
		dashbordPage=new DashboardPage();
		sentimentAnalysisTradingPage=new SentimentAnalysisTradingPage();
		cartPage=new CartPage();
		
		homePage.verifyHomePageTitle();
		homePage.clickOnLoginButton();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		dashbordPage.selectOnSentimentAnalysisTrading();
		sentimentAnalysisTradingPage.clickOnEnrollNow();
				
	}
	
	 @Test(priority = 1)
	  public void verifyCourseCountTest() { 
		  cartPage.verifyCourseCount();
	   
	  }
	 @Test(priority = 2)
	  public void captureBaseAmountTest() { 
		  String baseAmount=cartPage.captureBaseAmount();
		  Assert.assertEquals(baseAmount, "₹35192");
	   
	  }
	 
	 @Test(priority = 3)
	  public void captureAmountPayableTest() { 
		  String amountPayable=cartPage.captureAmountPayable();
		  Assert.assertEquals(amountPayable, "₹41527");
	   	  }
	 
	 @Test(priority = 4)
	  public void clickOnViewDetailsTest() { 
		  cartPage.clickOnViewDetails();
	   	  }
	 
	 @Test(priority = 5)
	  public void clickOnRemoveTest() { 
		  cartPage.clickOnRemove();
		   	  }
	 
	 @Test(priority = 6)
	  public void clickOnApplyCouponTest() { 
		  cartPage.clickOnApplyCoupon();
		   	  }
	 
	 @Test(priority = 7)
	  public void verifyErrorMessageTest() { 
		  String errMsg=cartPage.verifyErrorMessage();
		  
		  Assert.assertEquals(errMsg, "Oops! This coupon is no longer valid.");
		  
		   	  }
	 @Test(priority = 8)
	  public void clickOnCloseCouponTest() { 
		  cartPage.clickOnCloseCoupon();
		  
		   	  }
	 @Test(priority = 9)
	  public void clickOnLogoutTest() { 
		  cartPage.clickOnLogout();
		  
		   	  }
	

	
	  @AfterMethod public void tearDown() { driver.quit(); }
	  
	  
	 
}
