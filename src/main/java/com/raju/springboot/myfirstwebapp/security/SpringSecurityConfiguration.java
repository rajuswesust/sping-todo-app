package com.raju.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	
	//LDAP or Database
	//In memory
	
//	InMemoryUserDetailsManager
//	InMemoryUserDetailsManager(UserDetails... users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails x = createNewUser("raju", "bal");
		UserDetails y = createNewUser("raZu", "baal");
		UserDetails z = createNewUser("void", "void");
		
		return new InMemoryUserDetailsManager(x, y);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails x = User.builder().passwordEncoder(passwordEncoder).username(username).password(password).roles("USER", "ADMIN").build();
		return x;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
