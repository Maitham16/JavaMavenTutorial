package com.example.mavenprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MavenprofileApplication {

	@Value("${spring.profiles.active}")
	private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(MavenprofileApplication.class, args);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("=====================Active profile is: " + activeProfile);
	}

}

// run it furs by using: mvn spring-boot:run
// run it second by using: mvn -Pproduction spring-boot:run
