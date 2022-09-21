package activity.hostellers;

public class Hostellers extends Student{
	int hostelNo;
	int roomNumber;

	Hostellers(String studentName, String department, int studentID, int registrationNo, int hostelNo, int roomNumber ) {
		super(studentName, department, studentID, registrationNo);
		
		this.hostelNo = hostelNo;
		this.roomNumber = roomNumber;
	}
	
	@Override
	void getDetails() {
		super.getDetails();
		System.out.println("Student Type: Hosteller");
		System.out.println("Hostel Number: " +hostelNo);
		System.out.println("Room Number:   " +roomNumber);
		System.out.println();
	}

}
