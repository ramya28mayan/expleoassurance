package com.expinspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expinsbase.BaseClass;

public class ExpleoSurancePage extends BaseClass {
	
	
public ExpleoSurancePage() {
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//a[contains(text(),'New In')]")
private WebElement newInsurance;

public WebElement getNewInsurance() {
	return newInsurance;
	}

}
