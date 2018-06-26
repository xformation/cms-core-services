package com.synectiks.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaAuditing
public class CollegeManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplicationBuilder(CollegeManagementSystemApplication.class).build();
		app.run(args);
		//SpringApplication.run(CollegeManagementSystemApplication.class, args);
	}
}
