package com.job.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CompanyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyProjectApplication.class, args);
	}

}
