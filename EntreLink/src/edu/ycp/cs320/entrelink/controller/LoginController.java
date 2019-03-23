package edu.ycp.cs320.entrelink.controller;

import edu.ycp.cs320.entrelink.model.User;

public class LoginController {
	
	private User model;
	
	public void setModel(User model) {
		this.model = model;
	}
	
	public boolean verifyUser() {
		if(model.getEmail() == "jdoe@ycp.edu" && model.getPassword() == "ILikeRocks") {
			return true;
		}
	return false;
	}
	
}
