package com.client.kidschoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="role")
public class Role {
	
	   	@Id
	    @Column(name ="role_name")
	    private String roleName;
	    @Column(name="role_description")
	    private String roleDescription;
	    
	    
	    public Role () {}
	    
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		public String getRoleDescription() {
			return roleDescription;
		}
		public void setRoleDescription(String roleDescription) {
			this.roleDescription = roleDescription;
		}

}
