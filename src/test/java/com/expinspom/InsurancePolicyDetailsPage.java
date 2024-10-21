package com.expinspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.expinsbase.BaseClass;

public class InsurancePolicyDetailsPage extends BaseClass {

	public	InsurancePolicyDetailsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "Address")
	private WebElement address;

	@FindBy(id = "DateOfBirth")
	private WebElement dob;

	@FindBy(xpath = "(//input[@name=\"Gender\"])[2]")
	private WebElement gender;

	@FindBy(xpath = "(//input[@name='PolicyType'])[2]")
	private WebElement policytype;

	@FindBy(xpath = "//select[@name='SumInsured']")
	private WebElement suminsured;

	@FindBy(id = "Premium")
	private WebElement premium;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElement submit;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPolicytype() {
		return policytype;
	}

	public WebElement getSuminsured() {
		return suminsured;
	}

	public WebElement getPremium() {
		return premium;
	}

	public WebElement getSubmit() {
		return submit;
	}
public void details() {
	
	
//To select the sum Insured
	WebElement suminsured1 = getSuminsured();
	suminsured1.click();
	Select sm = new Select(suminsured1);
	sm.selectByIndex(3);
}

}
