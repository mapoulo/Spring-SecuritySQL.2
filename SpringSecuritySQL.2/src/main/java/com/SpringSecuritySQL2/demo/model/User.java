package com.SpringSecuritySQL2.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Setter
@Entity
@Getter
public class User {
	
	@Id
	@GeneratedValue
	private int user_id;
	
	
	private String user_name;
	private String user_password;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns =@JoinColumn(name="user_role") )
	
	private Set<Role> roles;

}
