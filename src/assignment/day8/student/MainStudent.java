package assignment.day8.student;

import java.util.Map;
import java.util.TreeMap;

public class MainStudent {

	public static void main(String[] args) {
		Map<String, Student> student = new TreeMap<String,Student>();
		
		student.put("Sharie", new Student("Sharie", 12345));
		student.put("Carla", new Student("Carla",54321));
		student.put("Selena", new Student ("Selena", 9876));
		student.put("Miley", new Student ("Miley", 64527));
		student.put("Shaira", new Student ("Shaira", 64527));

		
        for(String n1 : student.keySet()){
            Student stud = student.get(n1);

            if(stud.getName().startsWith("S") || stud.getName().startsWith("s")){
                System.out.println((stud.toString()));
            }
        }
   }
}
