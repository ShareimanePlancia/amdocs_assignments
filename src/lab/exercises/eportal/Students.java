package lab.exercises.eportal;

public class Students {
	int id;
    String name;
    String course;
    
    public Students(){
    	
    }
	
    public Students(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
    public String toString() {
		return "Student ID: " + id + ", Student Name: " + name + " Student Course: "+course;
	}	
	    
}
