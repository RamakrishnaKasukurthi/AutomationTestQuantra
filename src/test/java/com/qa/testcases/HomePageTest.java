package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	
HomePage homePage;
LoginPage loginPage;

	public HomePageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
			homePage=new HomePage();

	}
	
	
	  @Test(priority = 1)
	  public void verifyHomePageTitleTest() { 
		  String
	  homePageTitle=homePage.verifyHomePageTitle();
	  Assert.assertEquals(homePageTitle,
	  "Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading"); 
	  }
	 

@Test(priority = 2)
public void clickOnLoginButtonTest() throws IOException {
loginPage=homePage.clickOnLoginButton();

}

	
	
	  @AfterMethod public void tearDown() { 
		  driver.quit();
	  
	  }
	 
}
