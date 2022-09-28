package assignment.day10.withdraw;

public class BankAccount {
    private long accountNum;
    private String accountName;
    private double accountBal;
    
    public void deposit(double amount) {
    	try {
        if (amount > 0) {
            accountBal = accountBal + amount;
            System.out.println("Successfully deposited P " + amount);
        } else {
            System.out.println("Cannot Deposit " + amount);
        }
        Thread.sleep(1000);
        }
    	catch(InterruptedException e) {
            e.printStackTrace();
    	}
    }

    void withdrawMethod(BankAccount account, double amount) {
        try {
            if (account.accountBal > 0) {
                accountBal = account.accountBal - amount;
                System.out.println("Successfully withdraw P " + amount);
            } else {
                System.out.println("Unable to withdraw " + amount+", ending balances ia insufficient.");
            }
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void displayCurrentBalance() {

        System.out.println("Your current balance is " + accountBal);
    }

    public BankAccount (long accountNum, String accountName,  double accountBal) {

        this.accountNum = accountNum;
        this.accountName = accountName;
        this.accountBal = accountBal;
    }
}