package assignment.student.jdbc;

public class Student {
	String studID;
	String studName;
	String studAddress;
	String departments;
	
	public Student(String studID, String studName, String studAdress, String departments) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studAddress = studAdress;
		this.departments = departments;
	}

	public String getStudID() {
		return studID;
	}

	public void setStudID(String studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAdress(String studAdress) {
		this.studAddress = studAdress;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}
	
	

}
