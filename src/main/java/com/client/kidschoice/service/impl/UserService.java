package com.client.kidschoice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.client.kidschoice.repository.RoleRepository;
import com.client.kidschoice.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	 private UserRepository userRepository;
	 
	 @Autowired
	    private RoleRepository roleRepository;

	    @Autowired
	    private PasswordEncoder passwordEncoder;
	    
	    @Autowired
		private MailServiceImpl mailService;
	
}
