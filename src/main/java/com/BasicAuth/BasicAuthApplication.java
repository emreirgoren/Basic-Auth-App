package com.BasicAuth;

import com.BasicAuth.dto.CreateUserRequest;
import com.BasicAuth.model.Role;
import com.BasicAuth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BasicAuthApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthApplication.class, args);

	}

}
