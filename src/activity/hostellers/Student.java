package activity.hostellers;

public class Student {
	
	 String studentName;
	 String department;
	 int studentID;
	 int registrationNo;
	
	Student(String studentName,String department,int studentID, int registrationNo){
		
		this.studentName = studentName;
		this.department = department;
		this.studentID = studentID;
		this.registrationNo = registrationNo;
	}
	
	 void getDetails() {
		System.out.println("\nName:            " +studentName);
		System.out.println("Department       " +department);
		System.out.println("Student ID:      " +studentID);
		System.out.println("Registration ID: "+registrationNo);
		
	}
	
	
}
