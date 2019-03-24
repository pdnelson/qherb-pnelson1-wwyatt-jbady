package ecu.ycp.cs320.entrelink.controller;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.entrelink.controller.LoginController;
import edu.ycp.cs320.entrelink.model.User;

public class LoginControllerTest {
	private User model;
	private LoginController controller;
	
	@Before
	public void setUp() {
		model = new User();
		controller = new LoginController();
	}
	
	@Test
	public void testSetModel() {
		model.setUserFirstName("John");
		model.setUserLastName("Doe");
		model.setEmail("jdoe@ycp.edu");
		model.setPassword("ILikeRocks");
		model.setUsername("jdoe");
		
		controller.setModel(model);
		
		assertEquals("John", controller.getModel().getUserFirstName());
		assertEquals("Doe", controller.getModel().getUserLastName());
		assertEquals("jdoe@ycp.edu", controller.getModel().getEmail());
		assertEquals("ILikeRocks", controller.getModel().getPassword());
		assertEquals("jdoe", controller.getModel().getUsername());
	}
	
	@Test
	public void testThatOneIsEqualToOne() {
		assertTrue(1 == 1);
	}
}
