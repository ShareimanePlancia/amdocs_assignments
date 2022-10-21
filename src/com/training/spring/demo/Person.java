package com.training.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	@Autowired
	private Car myCar1;
	
	public Car getMyCar1() {
		return myCar1;
	}

	public void setMyCar1(Car myCar1) {
		this.myCar1 = myCar1;
	}

	public Person() {
		//default constructor
	}
	
	public Person(int age) {
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public String getPersonDetails() {
		return firstName+ " "+lastName+" CAR DETAILS: "+myCar1.getCarDetails();
	}

}
