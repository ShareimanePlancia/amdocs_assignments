package assignment.day9.odd_even;

public class Main {

	    public static void main(String[] args) {
	        for(int i = 1; i <=10; i++) {
	            try {
	            	MultiTable thread1 = new MultiTable(i);
	            	thread1.start();
	                thread1.join();
	                OddOrEven thread2 = new OddOrEven(thread1.getProduct());
	                thread2.start();
	                thread2.join();
	            } catch (Exception e) {
	                e.getStackTrace();
	            }
	        }

	    }
	}
