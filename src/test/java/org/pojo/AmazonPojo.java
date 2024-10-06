package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name = "email")
	private WebElement name;
	
	
	@FindBy(id = "continue")
	private WebElement cont;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	
	@FindBy(id = "signInSubmit")
	
	private WebElement sign;


	public WebElement getName() {
		return name;
	}


	public WebElement getCont() {
		return cont;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getSign() {
		return sign;
	}


	


	
	
	

}
