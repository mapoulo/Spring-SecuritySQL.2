package com.SpringSecuritySQL2.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecuritySQL2.demo.model.User;

@RestController
@RequestMapping("/rest")
public class AdminController {
	
	
	public String getUsers() {
		return "";
	}

}
