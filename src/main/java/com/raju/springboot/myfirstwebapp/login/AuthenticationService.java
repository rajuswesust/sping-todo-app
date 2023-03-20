package com.raju.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String pass) {
		
		boolean isValidUserName = username.equalsIgnoreCase("raju");
		boolean isValidPassword = pass.equalsIgnoreCase("raju");
		
		return isValidUserName && isValidPassword;
	}

}
