package assignment.day10.withdraw;

public class BankRunnable implements Runnable{
    double amountToWithdraw;
    BankAccount obj;
    Thread t;
    public BankRunnable(BankAccount obj, double withdrawAmount) {
        this.obj = obj;
        this.amountToWithdraw = withdrawAmount;
        t = new Thread (this);
        t.start();
    }
    @Override
    public void run() {
        synchronized(this.obj)
        {
            // synchronizing the send object
            obj.withdrawMethod(this.obj, this.amountToWithdraw);
        }

    }
}