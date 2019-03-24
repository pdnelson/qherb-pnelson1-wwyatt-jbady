package edu.ycp.cs320.entrelink.controller;

import edu.ycp.cs320.entrelink.model.User;

public class LoginController {
	
	private User model;
	
	public void setModel(User model) {
		this.model = model;
		//this.model.setUserFirstName("John");
		//this.model.setUserLastName("Doe");
	}
	
	public boolean verifyUser(String usernameOrEmail, String password) {
		System.out.println(model.getEmail());
		if(model.getEmail().equals(usernameOrEmail) || model.getUsername().equals(usernameOrEmail)) {
			if (model.getPassword().equals(password)) return true;
		}
	return false;
	}
	
	public User getModel() {
		return model;
	}
	
}
