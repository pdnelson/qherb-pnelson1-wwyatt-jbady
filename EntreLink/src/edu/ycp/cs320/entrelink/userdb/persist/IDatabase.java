package edu.ycp.cs320.userdb.persist;

import java.util.List;

import edu.ycp.cs320.entrelink.model.User;

public interface IDatabase {
	public User findUserByEmailOrUsername(String username);
}
