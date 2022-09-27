package assignment.day9.odd_even;

public class MultiTable extends Thread{

    private int product;
    public int getProduct() {
        return product;
    }

    @Override
    public void run() {
        for(int i = 1; i < 5; i++) {
            product = 5 * i;
            System.out.print("\n5 * "+i+" = "+product);
             OddOrEven OddOrEven = new OddOrEven(product);
             OddOrEven.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
