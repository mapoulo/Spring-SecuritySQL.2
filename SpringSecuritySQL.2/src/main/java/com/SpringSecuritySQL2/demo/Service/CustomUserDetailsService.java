package com.SpringSecuritySQL2.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecuritySQL2.demo.Repository.UserRepository;
import com.SpringSecuritySQL2.demo.model.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(user_name);
		CustomUserDetails customUserDetails = null;
		if(user != null) {
			customUserDetails = new CustomUserDetails(user);
		}else {
			throw new UsernameNotFoundException(user_name+" is not found");
		}
		return customUserDetails;
	}

}
