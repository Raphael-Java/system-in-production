package com.raphaeldev.systemproduct.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.raphaeldev.systemproduct.entities.User;
import com.raphaeldev.systemproduct.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Bruce Wayne", "bruce@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Chris Rock", "chris@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}	
}
