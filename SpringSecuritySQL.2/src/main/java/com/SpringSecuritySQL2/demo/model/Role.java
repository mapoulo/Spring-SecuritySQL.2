package com.SpringSecuritySQL2.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@Getter
@NoArgsConstructor
public class Role {
	
	@Id
	@GeneratedValue
	private int role_id;
	
	private String user_role;

}
