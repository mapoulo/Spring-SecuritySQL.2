package com.SpringSecuritySQL2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecuritySQL2.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
