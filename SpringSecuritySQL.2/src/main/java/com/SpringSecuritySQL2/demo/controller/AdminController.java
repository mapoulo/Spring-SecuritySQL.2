package com.SpringSecuritySQL2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserService userService;

	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public String save(@RequestBody User user) {
		String password = user.getUser_password();
		String encryptedPassword = passwordEncoder.encode(password);
		user.setUser_password(encryptedPassword);
		userService.save(user);
		return "The user is saved succefully";
	}

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello there suckurs ...";
	}

}
