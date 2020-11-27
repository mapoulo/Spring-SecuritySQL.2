package com.SpringSecuritySQL2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecuritySQL2.demo.Service.UserService;
import com.SpringSecuritySQL2.demo.model.User;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/adduser", method = RequestMethod.POST)
	public String getUsers(@RequestBody User user) {
		userService.save(user);
		return "The is added succefully ...";
	}

}
