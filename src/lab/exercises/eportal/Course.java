package lab.exercises.eportal;

public class Course {
	int id;
    String name;
    String course;
	
    public Course(int id, String name, String course) {
		super();
		this.course = course;
	}
	
	public Course() {
		
	}
	public String coursesDetails() {
		return  " Student Course: "+course;
	}	

}

