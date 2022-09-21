package activity;

public class ContractualEmployee extends Employee{

	ContractualEmployee(double basicPay){
		this.basicPay = basicPay;
		
		pf = netSalary * 0.12;
		netSalary = basicPay-pf;
		loanRate = netSalary *0.10;
	}

	@Override
	public double calcBasicpay() {
		System.out.println("\nThe net salary for contractual employee is: " +netSalary);
		return netSalary;
	}

	@Override
	public double calcLoanAmount() {
		System.out.println("The loan amount that contractual employee can avail is: " +loanRate);
		return loanRate;
	}


	


}
