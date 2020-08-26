package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SentimentAnalysisTradingPage extends TestBase{
	
	
	//Page factory 
	@FindBy(xpath  = "//h1[contains(text(),'Learning Track: Sentiment Analysis in Trading')]")
	WebElement courseName;
	
	@FindBy(xpath  = "//span[contains(text(),'35192')]")
	WebElement price;
	
	@FindBy(xpath  = "//button[@class='vue-ui-button btn button secondary']//span[@class='default-slot'][contains(text(),'Enroll Now')]")
	WebElement enrollNowbtn;

	public SentimentAnalysisTradingPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public String verifyCourseName() {
		return courseName.getText();
	}
	
	public String verifyPrice() {
		return price.getText();
	}
	
	public CartPage clickOnEnrollNow()throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		enrollNowbtn.click();
		/*
		 * Actions ac=new Actions(driver);
		 * ac.moveToElement(enrollNowbtn).build().perform();
		 */
		return new CartPage();
		
	}

}
