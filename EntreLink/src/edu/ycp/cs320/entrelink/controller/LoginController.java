package edu.ycp.cs320.entrelink.controller;

import edu.ycp.cs320.entrelink.model.User;

public class LoginController {
	
	private User model;
	
	public void setModel(User model) {
		this.model = model;
		this.model.setUserFirstName("John");
		this.model.setUserLastName("Doe");
	}
	
	public boolean verifyUser() {
		System.out.println(model.getEmail());
		if(model.getEmail().equals("jdoe@ycp.edu") && model.getPassword().equals("ILikeRocks")) {
			return true;
		}
	return false;
	}
	
}
