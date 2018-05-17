package com.udemy.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemy.cursomc.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String Strategy;
	
	@Autowired
	private DBService dbService;
	@Bean
	public boolean instatiateDataBase() throws ParseException {

		if(!"create".equals(Strategy)) {
			return false;
		}
		
		dbService.instatiateTestDataBase();
		return true;
	}
}
