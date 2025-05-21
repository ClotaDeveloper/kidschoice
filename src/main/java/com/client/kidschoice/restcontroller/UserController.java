package com.client.kidschoice.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.service.impl.UserService;

@RestController
public class UserController {


	 @Autowired
	 private UserService userService;
	
	
    @GetMapping({"/enduser"})
    public ResponseEntity<String> endUser(@AuthenticationPrincipal UserDetails userDetails) {
        String message;
        if (userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_Admin"))) {
            message = "This is Admin Page Testing on Single API ENDPOINT /enduser";
        } else if (userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_Client"))) {
            message = "This is Client Page Testing on Single API ENDPOINT /enduser";
        } else if (userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_User"))) {
            message = "This is User Page Testing on Single API ENDPOINT /enduser";
        } else {
            message = "Invalid User Role";
        }
        return ResponseEntity.ok(message);
    }
    
}
