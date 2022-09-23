package assignment.collections.day6;

public class Student{
	 String name, colleges;
	 int studentId;
	public Student(){
	}
	
	public Student(String name, String colleges, int studentId) {
		super();
		this.name = name;
		this.colleges = colleges;
		this.studentId = studentId; 
	}

	public String getName() {
		return name;
	}
	public String getColleges() {
		return colleges;
	}

	public int getStudentId() {
		return studentId;
	}


	@Override
	public String toString() {
		return "Student Name : " + name + "Student Id: " + studentId + "Colleges: " +colleges+ " ]";
	}
	

}


