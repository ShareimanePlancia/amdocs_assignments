package com.training.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.assignment.Employee;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		ApplicationContext javaContext = new AnnotationConfigApplicationContext(Employee.class);

		Employee e1 = (Employee)context.getBean("employee");

	}

}
