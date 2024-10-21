package com.expinsstepdef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.expinsbase.BaseClass;
import com.expinspom.ExpInsLoginPage;
import com.expinspom.ExpleoSurancePage;
import com.expinspom.InsurancePolicyDetailsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpInsStepDef extends BaseClass {
	
	ExpInsLoginPage login;
	ExpleoSurancePage Create;
	InsurancePolicyDetailsPage details;
	
	@Given("User should launch web_API browser")
	public void user_should_launch_web_api_browser() throws IOException {
		LaunchBrowswer();
		driver.get(getPropertyFileValue("APIURL"));
	}

	@When("User should write {string} and {string}")
	public void user_should_write_and(String username, String password) {
	    login = new ExpInsLoginPage();
	    EnterValue(login.getUsername(), username);
	    EnterValue(login.getPassword(), password);
	}

	@When("User should click the submit button")
	public void user_should_click_the_submit_button() {
	    login.getSubmit().click();
	}

	
	@Then("User should logoff")
	public void user_should_logoff() {
	    driver.quit();
	}

	@Then("User should select New Insurance")
	public void user_should_select_new_insurance() throws InterruptedException {
		Thread.sleep(2000);
	   Create = new ExpleoSurancePage();
	   Create.getNewInsurance().click();
	}
	@Then("Fill the required details")
	public void fill_the_required_details() throws IOException {
		details = new InsurancePolicyDetailsPage();
		
		WebElement name = details.getName();
		name.sendKeys(getPropertyFileValue("name"));
		
		WebElement email = details.getEmail();
		email.sendKeys(getPropertyFileValue("email"));
		
		WebElement address = details.getAddress();
		address.sendKeys(getPropertyFileValue("address"));
		
		WebElement dob = details.getDob();
		dob.sendKeys(getPropertyFileValue("dob"));
		
		WebElement gender = details.getGender();
		gender.click();
		
		WebElement policytype = details.getPolicytype();
		policytype.click();
		
		//Method that has sum insured value
		details.details();
		
		
		
		WebElement premium = details.getPremium();
		premium.sendKeys(getPropertyFileValue("premium"));
		
		
	}
	@Then("Click on submit button")
	public void click_on_submit_button() {
		details.getSubmit().click();
	}


}
