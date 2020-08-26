package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

		
	public class DashboardPage extends TestBase{
		
		
		//Page factory 
		@FindBy(partialLinkText = "Browse Cours")
		WebElement browse_Cours;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(xpath = "//span[contains(text(),'Sentiment Analysis in Trading')]")
		WebElement sentimentAnalysisTradingbtn;

		public DashboardPage() throws IOException {
			PageFactory.initElements(driver, this);
		}
	
		
	
		public SentimentAnalysisTradingPage selectOnSentimentAnalysisTrading()throws IOException {
			
			browse_Cours.click();
			sentimentAnalysisTradingbtn.click();
			
			return new SentimentAnalysisTradingPage();
			
		}

}
