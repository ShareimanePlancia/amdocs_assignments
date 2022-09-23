package assignment.collections.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class MainStudent {
    public static ArrayList<Student> list = new ArrayList<Student>();


	public static void main(String[] args) {
		
		list.add(new Student ("Nancy Lopez", "Harvard", 12345 ));
		list.add(new Student ("Erica Ramirez", "NYC", 12345 ));
		list.add(new Student ("Derlyn Santos", "Princeton", 12345 ));
		list.add(new Student ("Maria Ramos", "Harvard", 12345 ));
		list.add(new Student ("Jessica Ocampo", "Princeton", 12345 ));
        
		showStudentDetailsByCollege();

	}
	
    //Search Colleges
    static void showStudentDetailsByCollege(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input University: ");
        String colleges = sc.next();
        
        List<Student> filteredStudents = list.stream()
                .filter(string -> string.colleges.contains(colleges))
                .collect(Collectors.toList());
               if (filteredStudents != null && filteredStudents.size() != 0) {
                   for (Student students : filteredStudents) {
                       System.out.print("Stuent Id: "+students.studentId+" Student Name: "+students.name+" Colleges: "+students.colleges+"\n");
                   }
               } else {
                   System.out.println("No members found on the given college");
               }    
    }
}
