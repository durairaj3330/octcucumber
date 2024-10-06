package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;

import org.openqa.selenium.WebElement;
import org.pojo.AmazonPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AmazonDefinitionClass extends BaseClass {
	public static AmazonPojo s;
	
	@Given("To send the chrome browser and hit the url")
	public void to_send_the_chrome_browser_and_hit_the_url() {
		
	   launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
	}

	@When("To send invalid username in email field")
	public void to_send_invalid_username_in_email_field(io.cucumber.datatable.DataTable d) {
		List<String> li = d.asList();
		String te = li.get(1);
		
	 s=new AmazonPojo();
	 WebElement name = s.getName();
	 key(name, te);
	 
		
	}

	@When("to click continue button")
	public void to_click_continue_button() {
		s=new AmazonPojo();
	WebElement cont = s.getCont();
	cli(cont);
	
	}

	@When("To send valid password in password field")
	public void to_send_valid_password_in_password_field() {
	
		
		
		s=new AmazonPojo();
		WebElement pass = s.getPass();
		key(pass, "vikki");
	
	}

	@When("To enter signin button")
	public void to_enter_signin_button() {
		s=new AmazonPojo();
		WebElement sign = s.getSign();
		cli(sign);
	
	}

	@Then("to close the amazonweb brower")
	public void to_close_the_amazonweb_brower() {
System.out.println("1");
	   
	}


	
	
}
