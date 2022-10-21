package com.training.spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.spring.Car;

public class Employee {
	
	private String empName;
	private double salary;
	
	@Autowired
	private Laptop laptop;
	
	public Employee() {
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getEmployeeDetails() {
		return empName+ " "+salary+" \nLaptop Details: "+laptop.getLaptopDetails();
	}

}
