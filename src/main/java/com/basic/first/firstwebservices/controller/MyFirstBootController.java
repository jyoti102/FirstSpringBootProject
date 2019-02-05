package com.basic.first.firstwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.basic.first.firstwebservices.model.User;

@RestController
public class MyFirstBootController {

	/**
	 * This is simple controller which simply returns a String.
	 * For this you don't need to create a model class or anything
	 * 
	 * @return String
	 */
	@GetMapping(value="/hello-world")
	public String helloWorld() {
		return "Hello! This is my first project in spring boot";
	}
	
	/**
	 * This method will return a object.
	 * For this you have to create the model class User.java
	 * 
	 * @return object
	 */
	@GetMapping(value="/hello-user")
	public User helloUser() {
		return new User((long)23,"Jyoti","Singh","xyz@gmail.com","12345678"); 
	}
	
	/**
	 * Sending the firstName as a path variable and returning the the path variable name in user object.
	 * @return Object
	 */
	@GetMapping(value="/hello-user-name/{firstName}")
	public User helloUserByName(@PathVariable String firstName) {
		User user=new User();
		user.setUserId((long) 23);
		user.setFirstName(firstName);
		user.setLastName("LastName");
		user.setEmail("xyz@gmail.com");
		user.setPassword("12345678");
		return user; 
	}
}
