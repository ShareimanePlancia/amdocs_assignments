package assignment.day10.restaurant;

public class Waiter implements Runnable{
	
	Counter counter;
	Thread thread;
	
	public Waiter(Counter counter) {
		this.counter = counter;
		thread =new Thread(this, "Kitchen");
		thread.start();
	}

	@Override
	public void run() {
		
		while(true) {
			counter.getStatus();
		}
	}

}
