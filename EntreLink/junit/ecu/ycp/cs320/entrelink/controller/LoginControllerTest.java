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
	public void testVerifyUserExists() {
	
		// tests that you can log in with email and password
		
		// John Doe
		model.setPassword("ILikeRocks");
		model.setEmail("jdoe@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
		// Patrick Nelson
		model.setPassword("toothbrush");
		model.setEmail("pnelson1@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
		// Jason Bady
		model.setPassword("fingernail");
		model.setEmail("jbady@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
		// William Wyatt
		model.setPassword("RockSalt");
		model.setEmail("wwyatt@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
		
		// Quintin Herp
		model.setPassword("3legs");
		model.setEmail("qherb@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
		
		// Professor Hake
		model.setPassword("BDConsultant");
		model.setEmail("djhake@ycp.edu");
		
		controller.setModel(model);

		assertTrue(controller.verifyUser());
		
	}
	
	@Test
	public void testVerifyUserDoesNotExist() {
		controller.setModel(model);
		assertFalse(controller.verifyUser());
	}
	
	@Test
	public void testThatOneIsEqualToOne() {
		assertTrue(1 == 1);
	}
}
