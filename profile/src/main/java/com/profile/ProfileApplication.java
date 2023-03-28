package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication extends ServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

}
