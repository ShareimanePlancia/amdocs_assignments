package assignment.day11.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Taylor","a", 25));
		students.add(new Student("Nancy","B", 45));
		students.add(new Student("Rita","A", 18));
		students.add(new Student("Charles","E", 45));
		students.add(new Student("Justine","A",27));
		
		students.stream().filter(n->n.getGrade().equalsIgnoreCase("A"))
		.sorted(Comparator.comparing(Student:: getStudName)) 
		.forEach(x->System.out.println("Student Name: "+ x.getStudName() + "\tGrade: " + x.getGrade()));
		
	}

}
