package assignment.day11.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List <Student> students = new ArrayList<Student>();
		
		students.add(new Student("Taylor", 25));
		students.add(new Student("Nancy", 45));
		students.add(new Student("Rita",  18));
		students.add(new Student("Charles",45));
		students.add(new Student("Justine",27));
		
		Collections.sort(students, (a,b) -> (int) (a.getAge() - b.getAge()));
		 System.out.println(students);
		
		}

	}

