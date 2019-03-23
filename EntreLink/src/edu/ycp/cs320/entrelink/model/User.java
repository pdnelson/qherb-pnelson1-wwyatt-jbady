package edu.ycp.cs320.entrelink.model;

public class User {
	
	private String username;
	private String password;
	private String userFirstName;
	private String userLastName;
	
	public User() {
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	
	public String getUserFirstName() {
		return this.userFirstName;
	}
	
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	public String getUserLastName() {
		return this.userLastName;
	}
}
