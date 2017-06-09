package com.niit.collaboration.test;

import static org.junit.Assert.assertEquals;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.backend.dao.UserDAO;
import com.niit.collaboration.backend.model.User;


public class UserTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static User user;
	@Autowired
	private static UserDAO userDAO;

	@BeforeClass
	public static void initialize() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.collaboration.*");
		context.refresh();
		user = (User) context.getBean(User.class);
		System.out.println(user);

		userDAO = (UserDAO) context.getBean("udao");
		System.out.println(userDAO);

	}
//create
	/*
	  @Test public void createUserTestCase() { user.setId(39);
	  user.setUsername("hhnu"); user.setPassword("1231"); user.setEmail("Manu");
	  user.setContact("985885855"); user.setRole("ROLE_ADMIN");
	  user.setEnabled(true); userDAO.registerUser(user);
	  Assert.assertEquals("createUserTestCase", true); }
	 
//Delete
	@Test 
	  public void deleteUserTestCase() { 
		User user = (User)userDAO.getUser(3004); 
		boolean flag = userDAO.delete(3004);
	  Assert.assertEquals("delete user test case", true, flag); 
	  
	}
	
	

	//Update
	@Test 
	public void updateUserTestCase()
	{ 
		User user = (User)userDAO.getUser(39); 
		user.setId(311); 
		user.setUsername("Anu");
	  user.setPassword("123"); 
	  user.setEmail("mn@gmail");
	 user.setContact("985885833"); 
	 user.setRole("ROLE_ADMIN");
	 
	 boolean flag = userDAO.update(user);
	 
	 Assert.assertEquals("update user test case", true, flag); }
	

	@Test
	public void validateCredentialsTestCase() { 
		User flag=userDAO.validate(user);
	  assertEquals("ValidateCredentialsTestCase",true,flag);
	  
	  }
	  
*/
}
