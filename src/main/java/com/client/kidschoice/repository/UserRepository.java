package com.client.kidschoice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, String> {

	User findByUniqueID(String userName);

}
