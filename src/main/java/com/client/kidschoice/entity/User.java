package com.client.kidschoice.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity(name="EmployeeUsers")
public class User {
	
	@Id
	@Column (name="userName")
	private String userName;
	@Column(name="UniqueID")
	private Integer uniqueID;
	@Column(name="userPassword")
	//@JsonIgnore
	private String userPassword;
 
	
	  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL) @JoinTable(name = "UserRole",
	          joinColumns = {
	                  @JoinColumn(name = "UserId")
	          },
	          
	          inverseJoinColumns = {
	                  @JoinColumn(name = "RoleId")
	          }
	  )
		private Set<Role> role;


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public Integer getUniqueID() {
		return uniqueID;
	}


	public void setUniqueID(Integer uniqueID) {
		this.uniqueID = uniqueID;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Set<Role> getRole() {
		return role;
	}


	public void setRole(Set<Role> role) {
		this.role = role;
	}


	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}





}
