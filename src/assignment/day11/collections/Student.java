package assignment.day11.collections;

import java.util.Comparator;

public class Student{
	String studName;
	int age;
	
	public Student(String studName, int age) {
		super();
		this.studName = studName;
		this.age = age;
	}
	
	
	public String getStudName() {
		return studName;
	}


	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student name = " + studName + ", Student Age= " + age+ "\n";
	}
}
