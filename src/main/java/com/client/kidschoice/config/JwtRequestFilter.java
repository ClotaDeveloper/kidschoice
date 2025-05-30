package com.client.kidschoice.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.client.kidschoice.jwt.JwtUtil;
import com.client.kidschoice.service.impl.JwtService;

import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

	  @Autowired
	    private JwtUtil jwtUtil;

	    @Autowired
	    private JwtService jwtService;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
	    	
	        final String requestTokenHeader = request.getHeader("Authorization");

	        String userName = null;
	        String jwtToken = null;

	        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
	            jwtToken = requestTokenHeader.substring(7);
	            try {
	                userName = jwtUtil.getUsernameFromToken(jwtToken);
	            } catch (IllegalArgumentException e) {
	                System.out.println("Unable to get JWT Token");
	            } catch (ExpiredJwtException e) {
	                System.out.println("JWT Token has expired");
	            }
	        } else {
	            System.out.println("JWT token does not start with Bearer");
	        }

	        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {

	            UserDetails userDetails = jwtService.loadUserByUsername(userName);

	            if (jwtUtil.validateToken(jwtToken, userDetails)) {

	                UsernamePasswordAuthenticationToken userNamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	                userNamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(userNamePasswordAuthenticationToken);
	            }
	        }
	        filterChain.doFilter(request, response);

	    }

	}
