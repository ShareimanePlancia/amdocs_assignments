package assignment.day10.withdraw;

public class MainBank {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(12345, "Taylor Swift", 20000);
		BankRunnable br = new BankRunnable(ba, 1000);
		ba.displayCurrentBalance();
		ba.deposit(3000);
		ba.displayCurrentBalance();
	}

}