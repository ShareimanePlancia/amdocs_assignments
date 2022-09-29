package assignment.day11.stream;

public class Student {
	private String studName,grade;
	private int age;
	
	public Student(String studName, String grade, int age) {
		super();
		this.studName = studName;
		this.grade = grade;
		this.age = age;
	}
	public String getStudName() {
		return studName;
	}
	public String getGrade() {
		return grade;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student name = " + studName + ", Student Age= " + age+ ", Grade = " + grade+ "\n";
	}
}
