package assignment.day10.restaurant;

public class Counter {
	String n;
	boolean flag = false;
	
	synchronized String getStatus() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Waiter  get status: "+n);
		flag = false;
		notify();
		return n;
	}
	
	synchronized void putStatus(String n) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		flag = true;
		System.out.println("Kitchen set status:" +n);
		notify();
	}
	
	

}
