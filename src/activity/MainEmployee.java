package activity;

public class MainEmployee {

	public static void main(String[] args) {
		EmployeeFactory employeeFactory = new EmployeeFactory(); 
		
		EmployeeInter emp1 = employeeFactory.getEmployeeInterface("Permanent Employee",25000);
		emp1.calcBasicpay();
		emp1.calcLoanAmount();

		
		
		EmployeeInter emp2 = employeeFactory.getEmployeeInterface("Contractual Employee",65000);
		emp2.calcBasicpay();
		emp2.calcLoanAmount();
	}

}
