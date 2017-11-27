package com.springApp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="ROLE")
public class Role {
	
	private Long id;
	private String role;
	private Set<UserCredentials> users;
	
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@ManyToMany(mappedBy = "roles")
	public Set<UserCredentials> getUsers() {
		return users;
	}
	public void setUsers(Set<UserCredentials> users) {
		this.users = users;
	}

}
