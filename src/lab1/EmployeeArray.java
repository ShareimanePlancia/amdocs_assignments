package lab1;

import java.util.Arrays;

public class EmployeeArray {
	
	public static void main(String[] args) {
	
	Employee[] employee = new Employee[5];
	
	employee[0] = new Employee("Sharie", 5);
	employee[1] = new Employee("Nancy", 1);
	employee[2] = new Employee("Oscar", 2);
	employee[3] = new Employee("Sierra",4);
	employee[4] = new Employee("Alpha", 2);
	
	Arrays.sort(employee, (a,b) -> Integer.compare(a.getYears(), b.getYears()));

	for (int i = 0; i < employee.length; i++) {
	    System.out.println(employee[i]);
		}
	}
	
}
