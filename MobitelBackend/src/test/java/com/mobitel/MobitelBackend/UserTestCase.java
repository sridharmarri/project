package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.UserDAO;
import com.mobitel.MobitelBackend.model.User;

public class UserTestCase {

	
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a User Object.
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		
		//Insertion TestCase
		
		User user=new User();
		user.setAddr("hyderabad");
		user.setCustname("sridhar");
		user.setEmail("sridharmarri1@gmail.com");
		user.setMobile("9493772999");
		user.setPassword("1234");
		user.setRole("manager");
		user.setUsername("srirenu1");

		
		userDAO.insertUpdateUser(user);		
		System.out.println("User Inserted");
		
		//Retrieval TestCase`
		
		/*User user=userDAO.getUser(2);
		System.out.println("User Name:"+user.getCatname());
		System.out.println("User Description:"+user.getCatdesc());*/
		
		//Deletion TestCase
		/*User user=userDAO.getUser(2);
		userDAO.deleteUser(user);
		System.out.println("The User Deleted");*/
		
		//Retrieving the Data
		
		/*List<User> list=userDAO.getUserDetails();
		
		for(User user:list)
		{
			System.out.println(user.getCatid()+":"+user.getCatname()+":"+user.getCatdesc());
		}*/
		
		//Update the User
		//User user=userDAO.getUser(3);
		//user.setCatname("WifiEnMobile");
		//userDAO.insertUpdateUser(user);
		//System.out.println("The User Updated");
	}

}

