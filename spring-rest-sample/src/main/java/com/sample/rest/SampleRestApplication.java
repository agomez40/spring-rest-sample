package com.sample.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sample.rest.service.PersonService;
import com.sample.rest.service.PersonServiceImpl;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.sample.rest.model.repository" })
@ComponentScan(basePackages = { "com.sample.rest.controller"})
public class SampleRestApplication {

	// Logger
	private static final Logger log = LoggerFactory.getLogger(SampleRestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SampleRestApplication.class, args);
	}
	
	@Bean
	public PersonService cratePersonService(){
		log.debug("Created PersonService");
		return new PersonServiceImpl();
	}
}
