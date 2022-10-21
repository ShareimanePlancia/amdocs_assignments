package com.training.spring.demo;

public class Car {
	
	private String color;
	private String type;
	private String brand;
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCarDetails() {
		return color+": "+type+":"+brand+" : "+ model;
	}

	
}
