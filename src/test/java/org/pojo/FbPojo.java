package org.pojo;

import org.helper.BaseClass; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbPojo extends BaseClass {
	
	public FbPojo() {
		PageFactory.initElements(driver,this);

	}
	
	
	@FindBy(id="username")
	public WebElement username;
	
	
	@FindBy(id="password")
	public WebElement pass;

	@FindBy(id="login")
	public WebElement log;
	
	@FindBy(id="location")
	public WebElement cl;
	
	@FindBy(id="hotels")
	public WebElement hot;
	
	@FindBy(id="Submit")
	public WebElement sub;
	
	@FindBy(id="radiobutton_1")
	public WebElement sel;
	
	@FindBy(id="continue")
	public WebElement con;
	
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLog() {
		return log;
	}
		
		public WebElement getCl() {
			return cl;
	}
	
		public WebElement getHot() {
			return hot;
	}

		public WebElement getSub() {
			return sub;
	}
		
		public WebElement getSel() {
			return sel;
	}
		public WebElement getCon() {
			return con;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
	
	

