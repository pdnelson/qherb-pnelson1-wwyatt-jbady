package edu.ycp.cs320.entrelink.model;

public class User {
	
	private String username;
	private String password;
	private String userFirstName;
	private String userLastName;
	private String email;
	boolean isLoggedIn;
	
	public User() {
		isLoggedIn = false;
	}
	
	public User(String username, String password, String userFirstName, String userLastName, String email) {
		this.username = username;
		this.password = password;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.email = email;
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
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setIsLoggedIn(boolean getBool) {
		this.isLoggedIn = getBool;
	}
	
	public boolean getIsLoggedIn() {
		return this.isLoggedIn;
	}
}
