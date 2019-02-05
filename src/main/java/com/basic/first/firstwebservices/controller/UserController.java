package com.basic.first.firstwebservices.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.basic.first.firstwebservices.model.User;
import com.basic.first.firstwebservices.service.UserService;
import com.basic.first.firstwebservices.utils.Response;

@RestController
//@RequestMapping("/user")
public class UserController {

	@Autowired UserService userService;
	
	@PostMapping(value="/add-user")
	public Response addUser(@RequestBody User user) {
		System.out.println("user: "+user);
		return userService.addUser(user);
	}
	
	@GetMapping(value="/get-user")
	public List<Map<String, Object>> getUser(){
		System.out.println("inside");
		return userService.getUsers();
	}
}
