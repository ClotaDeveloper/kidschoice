package com.client.kidschoice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.client.kidschoice.entity.EmailConfig;


@Repository
public interface EmailConfigRepository extends CrudRepository<EmailConfig, Integer> {
   
	@Query(value = "SELECT e.id, e.host, e.port, e.username, e.password FROM EmailConfig e WHERE e.id = ?1", nativeQuery = true)
	  EmailConfig getEmailConfigById(int id);
}
