package com.SpringSecuritySQL2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecuritySQL2.demo.Service.UserService;
import com.SpringSecuritySQL2.demo.model.User;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/get")
	public List<User> getAllEmployees(){
		return userService.getAllEmployees();
	}

}
