package lab1;

public class Student {
	private String name;
	private int age, rollNumber;
	private double marks;
	
	public Student(String name, int age, int rollNumber, double marks ) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.marks = marks;
}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "[Student Name = " + name + ", Age = " + age +  ", Roll Number = " + rollNumber + ", Marks: " +marks+"]";
	}
	
}
