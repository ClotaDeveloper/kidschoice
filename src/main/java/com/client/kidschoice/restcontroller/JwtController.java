package com.client.kidschoice.restcontroller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.entity.JwtRequest;
import com.client.kidschoice.entity.JwtResponse;
import com.client.kidschoice.jwt.JwtUtil;
import com.client.kidschoice.service.impl.JwtService;


@RestController
@CrossOrigin
public class JwtController {

	
	@Autowired
    private JwtService jwtService;
	
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }

    
    @PostMapping("/expire-token")
    public ResponseEntity<String> expireToken(@RequestBody Map<String, String> tokenMap) {
        String token = tokenMap.get("token");
        if (jwtUtil.isTokenBlacklisted(token)) {
            return ResponseEntity.badRequest().body("Token already expired or invalid.");
        }

        jwtUtil.blacklistToken(token);
        return ResponseEntity.ok("Token expired successfully.");
    }
    
    @PostMapping("/check-token")
    public ResponseEntity<String> checkTokenValidity(@RequestBody Map<String, String> tokenMap) {
        String token = tokenMap.get("token");
        if (jwtUtil.validateToken(token)) {
            return ResponseEntity.ok("Token is valid.");
        } else if (jwtUtil.isTokenExpired(token)) {
            return ResponseEntity.ok("Token has expired.");
        } else if (jwtUtil.isTokenBlacklisted(token)) {
            return ResponseEntity.ok("Token is blacklisted or invalid.");
        } else {
            return ResponseEntity.ok("Token is invalid.");
        }
    }
	
}


