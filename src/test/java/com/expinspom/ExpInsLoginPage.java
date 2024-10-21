package com.expinspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expinsbase.BaseClass;

public class ExpInsLoginPage extends BaseClass {
	
	public ExpInsLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
