package org.stepdefinition;

import org.helper.BaseClass;





public class HooksClass extends BaseClass{
	
	@cucumber.api.java.Before
    public void browserlaunch1() {
		browserlaunch();

	}
	

	@cucumber.api.java.After
	public void browserlaunch2() {
		
		close();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
