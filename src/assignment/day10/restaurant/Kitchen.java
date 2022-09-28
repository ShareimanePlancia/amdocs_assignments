package assignment.day10.restaurant;

public class Kitchen implements Runnable{
	
	Counter counter;
	Thread thread;
	
	public Kitchen (Counter counter) {
		this.counter = counter;
		thread = new Thread(this, "Waiter");
		thread.start();
	}
	  @Override
	    public void run() {
	        for(int i=1; i<5; i++){
	            counter.putStatus("\tPreparing the dish");
	        }
	        counter.putStatus("\tDish is ready");
	    }

	}
