package edu.ycp.cs320.entrelink.controller;

import edu.ycp.cs320.entrelink.userdb.persist.DatabaseProvider;
import edu.ycp.cs320.entrelink.userdb.persist.FakeDatabase;

public class InitDatabase {
	public static void init(int which) {
		System.out.print("Which database (0=fake, 1=derby): ");
		if (which == 0) {
			DatabaseProvider.setInstance(new FakeDatabase());
		}/* else if (which == 1) {
			DatabaseProvider.setInstance(new DerbyDatabase());
		} else {
			throw new IllegalArgumentException("Invalid choice: " + which);
		}*/
	}
}
