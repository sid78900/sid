package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersLocators {
	
	public HeadersLocators() {
		PageFactory.initElements(Base.driver, this 	);
		
	}

	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement MyAccountLink;
	 
	@FindBy(xpath="//a[text()=\"Register\"]")
	public static WebElement register;
	
	@FindBy(linkText = "Login")
	public static WebElement login;
}
