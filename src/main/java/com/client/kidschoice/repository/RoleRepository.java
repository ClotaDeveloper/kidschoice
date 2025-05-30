package com.client.kidschoice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.client.kidschoice.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role , String>  {

	
	Role findByRoleName(String roleName);
	
}
