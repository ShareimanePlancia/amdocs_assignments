package activity;

public class PermanetEmployee extends Employee{
	
	PermanetEmployee(double basicPay){
		this.basicPay = basicPay;
		
		pf = netSalary * 0.12;
		netSalary = basicPay-pf;
		loanRate = netSalary *0.15;
	}

	@Override
	public double calcBasicpay() {
		System.out.println("The net salary for permanent employee is: " +netSalary);
		return netSalary;
	}

	@Override
	public double calcLoanAmount() {
		System.out.println("The loan amount that permanent employee can avail is: " +loanRate);
		return loanRate;
	}



}
