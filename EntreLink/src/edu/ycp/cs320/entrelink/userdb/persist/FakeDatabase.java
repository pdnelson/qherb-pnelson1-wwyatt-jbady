package edu.ycp.cs320.userdb.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.ycp.cs320.entrelink.model.User;

public class FakeDatabase implements IDatabase {
	
	private List<User> userList;
	
	public FakeDatabase() {
		userList = new ArrayList<User>();
		
		// Add initial data
		readInitialData();
		
		System.out.println(userList.size() + " users in databse");
	}

	public void readInitialData() {
		try {
			userList.addAll(InitialData.getUsers());;
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	
	// finds users through email or username
	@Override
	public User findUserByEmailOrUsername(String username) {
		User result = new User();
		for (User user : userList) {
			if((user.getUsername() == username) || user.getEmail() == username){
				result = user;
			}
		}
		return result;
	}
		
	
}
