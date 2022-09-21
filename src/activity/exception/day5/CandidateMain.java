package activity.exception.day5;
import java.util.Scanner;

public class CandidateMain {

	public static void main(String[] args) throws InvalidSalaryException {
		Scanner sc = new Scanner(System.in);
		//Candidate c = new Candidate(name,gender,salary);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Gender: ");
		String gender = sc.nextLine();
		
		System.out.println("Enter Salary: ");
		double expSalary = sc.nextDouble();

		Candidate c = new Candidate(name,gender,expSalary);
		c.getName();
		c.getGender();
		c.getexpSalary();
		c.Calculate();

	}

}
