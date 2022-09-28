package assignment.day9.odd_even;

public class OddOrEven extends Thread{

    int number;
    OddOrEven(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        String numberType = "";
        try {
            if (this.number % 2 == 0) {
                numberType = "even";
            } else {
                numberType = "odd";
            }
            System.out.print("\t"+numberType);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}