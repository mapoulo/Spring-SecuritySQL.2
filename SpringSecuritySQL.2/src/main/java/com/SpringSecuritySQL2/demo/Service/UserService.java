package com.SpringSecuritySQL2.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringSecuritySQL2.demo.Repository.UserRepository;
import com.SpringSecuritySQL2.demo.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public List getAllEmployees() {
		List<User> employees = new ArrayList<>();
		userRepository.findAll().stream().forEach(employees::add);
		return employees;
	}
	
	
}
