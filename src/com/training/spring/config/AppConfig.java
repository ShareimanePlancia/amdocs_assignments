package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Emp;
import com.training.spring.assignment.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee  employee() {
		return new Employee();
		
	}

}
