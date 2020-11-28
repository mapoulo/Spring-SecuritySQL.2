package com.SpringSecuritySQL2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecuritySQL2.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
