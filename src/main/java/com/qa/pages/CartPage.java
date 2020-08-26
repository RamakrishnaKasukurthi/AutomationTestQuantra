package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class CartPage extends TestBase {

	// Page factory
	@FindBy(xpath = "//*[@class='cart-item-title']")
	List<WebElement> courseList;

	@FindBy(xpath = "//a[@class='link router-link-exact-active router-link-active']//span[@class='cart-count']")
	WebElement cartIcon;

	@FindBy(xpath = "//div[contains(text(),'35192')]")
	WebElement baseAmount;

	@FindBy(xpath = "//span[contains(text(),'41527')]")
	WebElement amountPayable;

	@FindBy(xpath = "//*[contains(text(),'View Details')]")
	WebElement viewDetails;

	@FindBy(linkText  = "Remove")
	WebElement remove;
	@FindBy(xpath = "//*[contains(text(),'Apply Coupon')]")
	WebElement applyCoupon;
	
	
	@FindBy(xpath = "//input[@placeholder='Type coupon code']")
	WebElement couponCodeTextbox;
	
	@FindBy(xpath = "//div[@class='coupon-form__button']//span[@class='content']")
	WebElement applybtn;
	
	@FindBy(xpath = "//*[contains(text(),'Oops! This coupon is no longer valid.')]")
	WebElement errorMSG;
	
	@FindBy(css =  "body.rm-chatBot.modal-active-body-pr.modal-active-body:nth-child(2) div.App:nth-child(2) div.LayoutDefault main.LayoutDefault__main:nth-child(2) div.cart-outer-container.view div.container div.cart-container div.cart-summary-section div.cart-summary:nth-child(1) div.modal.modal-active:nth-child(11) div.modal-dialog.modal-900 div.modal-content div.modal-body button.close > span:nth-child(1)")
	WebElement closeCoupon;
	
	@FindBy(css =  "body.rm-chatBot:nth-child(2) div.App:nth-child(2) div.LayoutDefault header.nav-wrapper.nav-free-header div.container nav.nav ul.nav-list div.list.-left:nth-child(1) li.item.avatar.d-user-profile:nth-child(7) > img:nth-child(1)")
	WebElement userProfile;
	
	@FindBy(xpath = "//ul[@class='avatar-menu']//a[@class='test link'][contains(text(),'Logout')]")
	WebElement logout;

	public CartPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void verifyCourseCount() {
		List<WebElement> cartCourseList = courseList;
		String icon = cartIcon.getText();
		System.out.println(icon);
		Assert.assertEquals(cartCourseList.size(), icon);

	}

	public String captureBaseAmount() {
		return baseAmount.getText();
	}

	public String captureAmountPayable() {
		return amountPayable.getText();
	}

	public void clickOnViewDetails() {
		viewDetails.click();
	//	driver.close();
	}

	public void clickOnRemove() {
		remove.click();
	}
	
	public void clickOnApplyCoupon() {
		applyCoupon.click();
		
	}
	
	public String verifyErrorMessage() {
		applyCoupon.click();
		couponCodeTextbox.sendKeys(prop.getProperty("coupon"));
		applybtn.click();
		return errorMSG.getText();
			
	}
	
	public void clickOnCloseCoupon() {
		applyCoupon.click();
		closeCoupon.click();
		
	}
	
	public void clickOnLogout() {
		userProfile.click();
		logout.click();
		
	}

	

}
