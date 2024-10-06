package org.stepdefinition;

import org.helper.BaseClass; 

import org.openqa.selenium.WebElement;
import org.pojo.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinDefinition extends BaseClass {
	
	@Given("To launch the chrome browser and hit the url")
	public void to_launch_the_chrome_browser_and_hit_the_url() {
		
		launchUrl("https://adactinhotelapp.com/");
	    
	}

	@When("To enter invalid username in email field")
	public void to_enter_invalid_username_in_email_field() {
		FbPojo f=new FbPojo();
	WebElement username = f.getUsername();
	   key(username, "durai");
	}

	@When("To enter invalid password in password field")
	public void to_enter_invalid_password_in_password_field() {
		FbPojo f=new FbPojo();
		WebElement pass = f.getPass();
		key(pass, "Vikki@412");
	    
	}

	@When("To enter login button")
	public void to_enter_login_button() {
		FbPojo f=new FbPojo();
		WebElement log = f.getLog();
		cli(log);
		
	    
	}

	@Then("to close the chrome brower")
	public void to_close_the_chrome_brower() {
		
	System.out.println("2");
		
	}



	
	
	
	
	
	
	

}
