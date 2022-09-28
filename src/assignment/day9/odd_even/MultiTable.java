package assignment.day9.odd_even;

public class MultiTable extends Thread{

    private int product;
    private int number;
    MultiTable(int number) {
        this.number = number;
    }

    public int getProduct() {
        return product;
    }

    @Override
    public void run() {
        try {
            product = 5 * this.number;
            System.out.print("\n5 * "+this.number+" = "+product);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    }
}