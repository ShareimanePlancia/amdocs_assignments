package lab.exercises.eportal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import assignment.collections.day6.Member;

public class Eportal {
    public static ArrayList<Students> students = new ArrayList<Students>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static Map<Integer,String> map=new HashMap<Integer,String>();

	public static void main(String[] args) {
        initializeValue();
        displayMenu();
	}
	
	static void initializeValue(){
        Students a = new Students();
        a.id = 1;
        a.name = "Clara Perez";
        a.course = "BSIT" ;
        
        Students b = new Students();
        b.id = 2;
        b.name = "Nancy Chua" ;
        b.course = "BSBA";
        
        Students c = new Students();
        c.id = 3 ;
        c.name = "Shane Lopez";
        c.course = "Accountancy";
        students.add(a);
        students.add(b);
        students.add(c);
        
        map.put(1, "Add New Course");  
        map.put(2, "Add New Student");   
        map.put(3, "View Students");
        map.put(4, "View Details by Course");
    }
	
	//Add New Course
	   static Course addNewCourse() {
	        Course c= new Course();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input course name: ");
	        c.course = sc.next();
	        System.out.println("Added new course: "+c.coursesDetails());
	        return c;
	    }
	   
	    static void courseDetails(){
	        for (Course  cd: courses) {
	            System.out.println(cd);
	        }
	    }
	    

	//Add New Student
	   static Students addNewStudent() {
	        Students student = new Students();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input Student ID: ");
	        student.id = sc.nextInt();
	        System.out.print("Input name: ");
	        student.name = sc.next();
	        System.out.print("Input course: ");
	        student.course = sc.next();
	        System.out.println("Added new student details "+student.toString());
	       
	        return student;
	    }
	   
	
	   
	//Student Details   
	    static void studentDetails(){
	        for (Students  s: students) {
	            System.out.println(s);
	        }
	    }
	//Student Details By Course    
	    static void showStudentsDetailsByCourse(){
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input course: ");
	        String course = sc.next();
	        
	        List<Students> filteredCourse = students.stream()
	                .filter(string -> string.course.contains(course))
	                .collect(Collectors.toList());
	               if (filteredCourse != null && filteredCourse.size() != 0) {
	                   for (Students student : filteredCourse) {
	                       System.out.print("Student ID: " + student.id + ", Student Name: " + student.name+ " Student Course: "+student.course+"\n");
	                   }
	               } else {
	                   System.out.println("No members found on the given address");
	               }
	           }
	    
	   //Display Menu 
	    static void displayMenu() {
	        Scanner sc = new Scanner(System.in);
	        int operationId;
	        
	        System.out.println("Menus\n");
	        for(Map.Entry<Integer,String> m:map.entrySet()){  
	           System.out.print( "ID: "+m.getKey()+": "+m.getValue()+"\n");  
	        }  
	        try{
	            System.out.print("Input id of the desired operation from the menu: "+"\n");
	            operationId = sc.nextInt();            
	            
	            Iterator<Map.Entry<Integer, String> >
	            iterator = map.entrySet().iterator();
	            boolean isKeyPresent = false;
	            while (iterator.hasNext()) {
	                Map.Entry<Integer, String> entry = iterator.next();
	                if (operationId == entry.getKey()) {
	                    isKeyPresent = true;
	                }
	            }
	            
	            if (!isKeyPresent) {
	                System.out.print("Operation id does not exists");
	            } else {
	                if (operationId == 1) {
	                	Course newCourse = addNewCourse();
	                	courses.add(newCourse);
	                    System.out.print("\nAdded new course : "+newCourse.course+"\n");
	                    displayMenu();
	                }
	                else if(operationId == 2) {
	                	Students newStudent = addNewStudent();
	                    students.add(newStudent);
	                    System.out.print("\nAdded new student details Student ID: "+newStudent.id+" Student Name: "+newStudent.name+" Course: "+newStudent.course+"\n");
	                    displayMenu();
	                }  else if (operationId == 3) {
	                	studentDetails();
	                    displayMenu();
	                } else if (operationId == 4) {
	                	studentDetails();
	                    displayMenu();
	                } else {
	                	showStudentsDetailsByCourse();
	                    displayMenu();
	                }
	            }
	        } catch(InputMismatchException e) {
	            System.out.print("Only integer value is allowed");
	        }
	        
	    }
	 
}
