package assignment.day9.thread;

public class Thread1 extends Thread{
    private final String threadName; 
    
    Thread1(String threadName) {
        this.threadName = threadName;
    }

	@Override
	public void run() {
		for(int i = 5; i>0; i--) {
			System.out.println("[" + threadName + "] => " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished  [" + threadName + "]");
	}
}
