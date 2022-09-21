package activity.hostellers;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new DayScholar("Sharie","IT Dept",0111,01233);
		Student std2 = new Hostellers("Abey","English Dept",0022,5436,678,902);
		std1.getDetails();
		std2.getDetails();


	}

}
